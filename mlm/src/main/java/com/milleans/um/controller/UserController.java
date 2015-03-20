package com.milleans.um.controller;

import com.milleans.model.User;
import com.milleans.um.services.IUserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    // for doLogin use Post mehtod.
    @RequestMapping(value = "/doLogin", method = RequestMethod.POST)
    public String doLogin(String username,String password) {
        log.info("user do login");
//        if (this.checkParams(new String[]{username, password})) {
//            ModelAndView mav = new ModelAndView("um/home");
//            mav.addObject("username", username);
//            mav.addObject("password", password);
//            return mav;
//        }
        log.info("user do login done");
        return "success";
    }

    @RequestMapping(value = "/home",method = RequestMethod.GET)
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
