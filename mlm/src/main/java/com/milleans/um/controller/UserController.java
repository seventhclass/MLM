package com.milleans.um.controller;

import com.milleans.model.User;
import com.milleans.tools.Utils;
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
import java.util.Date;

/**
 * Created by macbookpro on 2015-03-07.
 */
@Controller
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
        if (user.getPassWord().equals(password)) {
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

                response.addCookie(cookieMemberId);
                response.addCookie(cookiePwd);

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

            return loginDto;
        } else {
            loginDto.setMessage("login fail");
            loginDto.setResult("fail");

            return loginDto;
        }
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView navMain() {

        return new ModelAndView("um/home");
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public
    @ResponseBody
    JsonResponseDto getUserInfo(@RequestParam String memberId) {

        User user= userService.getUser(memberId);

        JsonResponseDto jsonResponseDto = new JsonResponseDto();
        jsonResponseDto.setObject(user);
        jsonResponseDto.setResult("success");
        jsonResponseDto.setMessage("it's really success.");

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
    public ModelAndView registration(HttpServletRequest request) {

        User user = new User();
        user.setAccountId(Integer.valueOf(request.getParameter("accountid")));
        user.setFirstName(request.getParameter("firstname"));
        user.setLastName(request.getParameter("lastname"));
        user.setGender(request.getParameter("optionsgender"));
        // user.setBirthDate();
        user.setSsn(request.getParameter("ssn"));
        user.setPassWord(request.getParameter("password1"));
        user.setAddress(request.getParameter("address"));
        user.setCountryId(Integer.valueOf(request.getParameter("countrycode")));
        user.setProvince(request.getParameter("provincecode"));
        user.setCity(request.getParameter("city"));
        user.setZip(request.getParameter("zip"));
        user.setMobile(request.getParameter("mobilephone"));
        user.setPhone(request.getParameter("officephone"));
        user.setSponsorid(Integer.valueOf(request.getParameter("sponsorid")));
        user.setCompanyName(request.getParameter("companyname"));
        if (request.getParameter("companytype") != null) {
            user.setCompanyType(Integer.valueOf(request
                    .getParameter("companytype")));
        }
        user.setEmail(request.getParameter("email"));

        String birthdayStr = request.getParameter("birthday");

        if (birthdayStr != null) {

            SimpleDateFormat sdf = new SimpleDateFormat(Utils.MilleanDateFormate);
            try {
                Date convertedCurrentDate = sdf.parse(birthdayStr);
                user.setBirthDate(convertedCurrentDate);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        user.setDate(new Date());
        user = userService.signUp(user);

        ModelMap model = new ModelMap();
        model.addAttribute("user", user);

        ModelAndView modelAndView = new ModelAndView("um/registersuccess", model);
        //modelAndView.addObject("user", user);

        return modelAndView;
    }

}
