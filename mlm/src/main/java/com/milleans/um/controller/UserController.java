package com.milleans.um.controller;

import com.milleans.model.User;
import com.milleans.um.dto.JsonResponseDto;
import com.milleans.um.dto.LoginDto;
import com.milleans.um.services.IUserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

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
    LoginDto doLogin(String memberId, String password,
                     String autoFlag, HttpSession session) {
        log.debug("user do login");
        User user = userService.getUser(Integer.valueOf(memberId));
        LoginDto loginDto = new LoginDto();
        if (user.getPassWord().equals(password)) {
            loginDto.setMessage("login success");
            loginDto.setResult("success");

            if (autoFlag.equals("1")) {
                session.setAttribute("userid", 11);
                session.setAttribute("username", "Le Hu");
            }
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
    JsonResponseDto getUserInfo(String memberId) {

        User user = new User();
        user.setFirstName("Hu");
        user.setLastName("le");
        user.setCity("Montreal");
        user.setId(11);
        //user.setRoleId(77);
        user.setAddress("5004 QueenMary");
        user.setBirthDate(20001112);
        user.setCompanyName("7th company");
        user.setCompanyType(1);
        user.setCountryId(86);
        user.setDate(20150101);
        user.setEmail("hu.le.ca@gmail.com");
        user.setFax("5148850513");
        user.setGender("M");
        user.setMobile("4385570123");
        user.setPassWord("111111");
        user.setPhone("5148851234");
        user.setProvince("QC");
        user.setSponsorid(111);
        user.setStatus(1);
        user.setZip("h3w 1x2");

        JsonResponseDto jsonResponseDto = new JsonResponseDto();
        jsonResponseDto.setObject(user);
        jsonResponseDto.setResult("success");
        jsonResponseDto.setMessage("it's really success.");

        return jsonResponseDto;
    }


    @RequestMapping(value = "/signUp", method = RequestMethod.POST)
    public ModelAndView signUp() {
        User newUser = new User();
        // newUser.setFirstName();
        ModelAndView modelAndView = new ModelAndView("um/home");

        return modelAndView;
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

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public ModelAndView registration(@ModelAttribute User user) {

        System.out.println("user form ="+user.getFirstName());

        ModelAndView modelAndView = new ModelAndView("um/registersuccess");
        return modelAndView;
    }
}
