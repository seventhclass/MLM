package com.milleans.um.controller;

import com.milleans.model.User;
import com.milleans.um.services.IUserService;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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


    @RequestMapping(
            value = "/doLogin", method = RequestMethod.POST)
    public
    @ResponseBody
    User
    doLogin(String username, String password) {
        log.info("user do login");
        System.out.println("dodododod");
        User user = new User();
        user.setFirstName("Hu");
        user.setCity("Montreal");
        user.setId(11);
        user.setRoleId(77);
        log.info("user do login done");
        return user;

    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView navMain() {

        return new ModelAndView("um/home");
    }

    private boolean checkParams(String[] params) {
        for (String param : params) {
            if (param == "" || param == null || param.isEmpty()) {
                return false;
            }
        }
        return true;
    }


    @RequestMapping(value = "signup", method = RequestMethod.POST)
    public ModelAndView signUp() {
        User newUser = new User();
        // newUser.setFirstName();
        ModelAndView modelAndView = new ModelAndView("um/home");

        return modelAndView;
    }

}
