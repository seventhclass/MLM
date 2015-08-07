package com.milleans.um.controller;

import com.milleans.model.User;
import com.milleans.tools.Constant;
import com.milleans.tools.Utils;
import com.milleans.um.dto.AddressDTO;
import com.milleans.um.dto.AddressList;
import com.milleans.um.dto.JsonResponseDto;
import com.milleans.um.dto.LoginDto;
import com.milleans.um.services.IUserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by macbookpro on 2015-03-07.
 */
@Controller("userController")
public class UserController {

    static Logger log = Logger.getLogger(UserController.class.getName());

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login() {
        log.info("user login");
        ModelAndView modelAndView = new ModelAndView("um/login");
        log.info("login done");
        return modelAndView;
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public ModelAndView doLogout(
            HttpSession session, HttpServletRequest request, HttpServletResponse response) {

        session.invalidate();

        ModelAndView modelAndView = new ModelAndView("um/login");
        return modelAndView;
    }


    @RequestMapping(value = "/doLogin", method = RequestMethod.POST)
    public
    @ResponseBody
    LoginDto doLogin(
            @RequestParam("memberid") String memberid,
            @RequestParam("password") String password, String autoFlag,
            HttpSession session, HttpServletRequest request, HttpServletResponse response) {
        log.debug("user do login");
        User user = userService.getUser(memberid);
        LoginDto loginDto = new LoginDto();

        if (user == null) {
            loginDto.setMessage("memberId or password doesn't match! please input again!");
            loginDto.setResult("fail");
            return loginDto;
        }

//        if (user.getPassWord().equals(password)) {

        if (Utils.match(password, user.getPassWord())) {
            loginDto.setMessage("login success");
            loginDto.setResult("success");

            String username;
            if (user.getCompanyName() == null || user.getCompanyName() == "") {
                username = user.getLastName() + " " + user.getFirstName();
            } else {
                username = user.getCompanyName();
            }

            if (autoFlag.equals("1")) {

                Cookie cookieMemberId = new Cookie("userid", memberid);
                cookieMemberId.setMaxAge(1 * 24 * 60 * 60);

                Cookie cookiePwd = new Cookie("username", username);
                cookieMemberId.setMaxAge(1 * 24 * 60 * 60);

                Cookie cookRoleId = new Cookie("roleId", String.valueOf(user.getRoleId()));

                response.addCookie(cookieMemberId);
                response.addCookie(cookiePwd);
                response.addCookie(cookRoleId);

            } else {
                Cookie[] cookies = request.getCookies();
                if (cookies != null && cookies.length > 0) {
                    for (Cookie c : cookies) {
                        if (c.getName().equals("userid") || c.getName().equals("username")) {
                            c.setMaxAge(0);
                            response.addCookie(c);
                        }
                    }
                }
            }

            session.setAttribute("userid", memberid);
            session.setAttribute("username", username);
            session.setAttribute("autoType", user.getAccountId());
            session.setAttribute("uid", user.getId());
            session.setAttribute("roleId", user.getRoleId());

            return loginDto;
        } else {
            loginDto.setMessage("login fail");
            loginDto.setResult("fail");

            return loginDto;
        }
    }


    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public
    @ResponseBody
    JsonResponseDto getUserInfo(@RequestParam String memberid) {
        JsonResponseDto jsonResponseDto = new JsonResponseDto();
        try {
            User user = userService.getUser(memberid);
            jsonResponseDto.setObject(user);
        } catch (Exception e) {
            e.printStackTrace();
            Utils.getFailMessage(e.getMessage());

        }
        //jsonResponseDto.setResult("success");
        //jsonResponseDto.setMessage("it's really success.");
        return jsonResponseDto;
    }


    @RequestMapping(value = "/selectAutoship", method = RequestMethod.GET)
    public ModelAndView registAutoShip() {
        ModelAndView modelAndView = new ModelAndView("um/selectautoship");
        return modelAndView;
    }

    @RequestMapping(value = "/selectAccount", method = RequestMethod.GET)
    public ModelAndView registAccount() {
        ModelAndView modelAndView = new ModelAndView("um/selectaccount");
        return modelAndView;
    }

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public ModelAndView registRegistration() {
        ModelAndView modelAndView = new ModelAndView("um/registration");
        return modelAndView;
    }

    @RequestMapping(value = "/signUp", method = RequestMethod.POST)
    public ModelAndView registration(@RequestParam("type") String type, HttpServletRequest request) {

        ModelAndView modelAndView = null;
//        String forwardUrl=null;
        if (type.equals("individual")) {
            modelAndView = this.signIndividual(request);
        } else if (type.equals("company")) {
            modelAndView = this.signCompany(request);
        } else {
            modelAndView = this.signAdmin(request, type);
        }
        return modelAndView;
    }

    private ModelAndView signAdmin(HttpServletRequest request, String type) {

        ModelAndView modelAndView = new ModelAndView("um/login");
        try {
            User user = new User();
//            user.setAccountId(Integer.valueOf(request.getParameter("accountid")));

            user.setRoleId(Constant.RoleTypeMapVal.get(type));

            user.setFirstName(request.getParameter("firstname"));
            user.setLastName(request.getParameter("lastname"));
            user.setGender(request.getParameter("optionsgender"));

//        user.setPassWord(request.getParameter("password1"));
            user.setPassWord(Utils.getHashPassword(request.getParameter("password1")));

            user.setAddress(request.getParameter("address"));
            user.setCountry(request.getParameter("countrycode"));
            user.setProvince(request.getParameter("provincecode"));
            user.setCity(request.getParameter("city"));
            user.setZip(request.getParameter("zip"));
            user.setMobile(request.getParameter("mobilephone"));
            user.setPhone(request.getParameter("officephone"));

            user.setEmail(request.getParameter("email"));

            String birthdayStr = request.getParameter("birthday");
            if (birthdayStr != null && !birthdayStr.equals("") && birthdayStr.length() > 0) {
                SimpleDateFormat sdf = new SimpleDateFormat(Utils.MilleanDateFormate);
                try {
                    Date convertedCurrentDate = sdf.parse(birthdayStr);
                    user.setBirthDate(convertedCurrentDate);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }

            user.setDate(new Date());
            user.setUserId(Utils.getUserId());
            user = userService.signUp(user);

            ModelMap model = new ModelMap();
            model.addAttribute("user", user);


            modelAndView = new ModelAndView("um/registersuccess", model);

        } catch (Exception e) {
            e.printStackTrace();
            modelAndView = new ModelAndView("um/registerfail");
        }
        return modelAndView;

    }

    private ModelAndView signCompany(HttpServletRequest request) {

        ModelAndView modelAndView = this.login();
        try {

            User user = new User();

            user.setAccountId(Integer.valueOf(request.getParameter("accountid")));
            user.setCompanyName(request.getParameter("companyname"));
            user.setCompanyType(Integer.valueOf(request.getParameter("companytype")));

//        user.setPassWord(request.getParameter("password1"));

            user.setPassWord(Utils.getHashPassword(request.getParameter("password1")));

            user.setAddress(request.getParameter("address"));
            user.setCountry(request.getParameter("countrycode"));
            user.setProvince(request.getParameter("provincecode"));
            user.setCity(request.getParameter("city"));
            user.setZip(request.getParameter("zip"));
            user.setMobile(request.getParameter("mobilephone"));
            user.setPhone(request.getParameter("officephone"));
            user.setSponsorId(request.getParameter("sponsorid"));

            user.setEmail(request.getParameter("email"));

            user.setDate(new Date());
            user.setUserId(Utils.getUserId());
            user = userService.signUp(user);

            ModelMap model = new ModelMap();
            model.addAttribute("user", user);


            modelAndView = new ModelAndView("um/registersuccess", model);
        } catch (Exception e) {
            e.printStackTrace();
            modelAndView = new ModelAndView("um/registerfail");
        }

        return modelAndView;
    }

    private ModelAndView signIndividual(HttpServletRequest request) {

        ModelAndView modelAndView = new ModelAndView("um/login");
        try {
            User user = new User();
            user.setAccountId(Integer.valueOf(request.getParameter("accountid")));
            user.setFirstName(request.getParameter("firstname"));
            user.setLastName(request.getParameter("lastname"));
            user.setGender(request.getParameter("optionsgender"));
            // user.setBirthDate();
            user.setSsn(request.getParameter("ssn"));
//        user.setPassWord(request.getParameter("password1"));

            user.setPassWord(Utils.getHashPassword(request.getParameter("password1")));

            user.setAddress(request.getParameter("address"));
            user.setCountry(request.getParameter("countrycode"));
            user.setProvince(request.getParameter("provincecode"));
            user.setCity(request.getParameter("city"));
            user.setZip(request.getParameter("zip"));
            user.setMobile(request.getParameter("mobilephone"));
            user.setPhone(request.getParameter("officephone"));
            user.setSponsorId(request.getParameter("sponsorid"));

//        user.setCompanyName(request.getParameter("companyname"));
//        if (request.getParameter("companytype") != null) {
//            user.setCompanyType(Integer.valueOf(request
//                    .getParameter("companytype")));
//        }

            user.setEmail(request.getParameter("email"));
            String birthdayStr = request.getParameter("birthday");
            if (birthdayStr != null && !birthdayStr.equals("") && birthdayStr.length() > 0) {
                SimpleDateFormat sdf = new SimpleDateFormat(Utils.MilleanDateFormate);
                try {
                    Date convertedCurrentDate = sdf.parse(birthdayStr);
                    user.setBirthDate(convertedCurrentDate);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
            user.setDate(new Date());
            user.setUserId(Utils.getUserId());
            user = userService.signUp(user);

            ModelMap model = new ModelMap();
            model.addAttribute("user", user);

            modelAndView =
                    new ModelAndView("um/registersuccess", model);
        } catch (Exception e) {
            e.printStackTrace();
            modelAndView = new ModelAndView("um/registerfail");
        }
        return modelAndView;
    }

    @RequestMapping(value = "/checkEmail", method = RequestMethod.GET)
    public JsonResponseDto getEmail(@RequestParam("email") String email) {

        String _email = userService.checkEmail(email);

        JsonResponseDto jsonResponseDto = new JsonResponseDto();
        jsonResponseDto.setObject(_email);
        jsonResponseDto.setResult("success");
        jsonResponseDto.setMessage("it's really success.");

        return jsonResponseDto;
    }

    @RequestMapping(value = "/sponsorId", method = RequestMethod.GET)
    public JsonResponseDto getSponsorId(@RequestParam("userId") String userId) {
        String sponsorId = null;
        sponsorId = userService.getSponorId(userId);

        JsonResponseDto jsonResponseDto = new JsonResponseDto();
        jsonResponseDto.setObject(sponsorId);
        jsonResponseDto.setResult("success");
        jsonResponseDto.setMessage("it's really success.");

        return jsonResponseDto;
    }

    @RequestMapping(value = "/editprofile", method = RequestMethod.GET)
    public ModelAndView editProfile() {

        ModelAndView modelAndView = new ModelAndView("um/editprofile");
        // modelAndView.addObject("userId", userId);

        return modelAndView;
    }

    @RequestMapping(value = "/modifypassword", method = RequestMethod.GET)
    public ModelAndView modifyPassword() {
        ModelAndView modelAndView = new ModelAndView("um/modifypassword");
        //modelAndView.addObject("userId",)
        return modelAndView;
    }


    @RequestMapping(value = "/accounttypemaintenance")
    public ModelAndView accountTypeMaintenance() {
        return new ModelAndView("um/accounttypemaintenance");
    }

    @RequestMapping(value = "/countrymaintenance")
    public ModelAndView countryMaintenance() {
        return new ModelAndView("um/countrymaintenance");
    }

    @RequestMapping(value = "/provincemaintenance")
    public ModelAndView provinceMaintenance() {
        return new ModelAndView("um/provincemaintenance");
    }


    @RequestMapping(value = "/addressmaintenance")
    public ModelAndView addressMaintenance() {
        return new ModelAndView("um/addressmaintenance");
    }

    @RequestMapping(value = "/categorymaintenance")
    public ModelAndView categoryMaintenance() {
        return new ModelAndView("um/categorymaintenance");
    }


    @RequestMapping(value = "/user/address", method = RequestMethod.POST)
    @ResponseBody
    public AddressList getAddress(HttpSession httpSession) {
        AddressList addressList = new AddressList();
        List<AddressDTO> addressDTOList = new ArrayList<>();
        AddressDTO addressDTO = null;
        try {
            String userId = httpSession.getAttribute("userid").toString();
            addressDTO = userService.getAddress(userId);
            addressDTOList.add(addressDTO);
            addressList.setShippingAddress(addressDTOList);
        } catch (Exception e) {
            e.printStackTrace();
            addressList.setMessage(e.getMessage());
            addressList.setResult("fail");
        }
        return addressList;
    }

}
