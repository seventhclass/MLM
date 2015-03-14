package com.milleans.um.controller;

import com.milleans.um.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by macbookpro on 2015-03-07.
 */
@Controller
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/")
    public ModelAndView signUp(){
        System.out.println("zzzz");
        ModelAndView modelAndView = new ModelAndView("login.jsp");
        return modelAndView;
    }
}
