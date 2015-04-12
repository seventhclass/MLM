package com.milleans.port.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by macbookpro on 2015-04-10.
 */
@Controller("portController")
public class PortController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView navMain() {

        return new ModelAndView("um/home");
    }


    @RequestMapping(value = "/aboutus")
    public ModelAndView aboutUs() {
        return new ModelAndView("um/aboutus");
    }

    @RequestMapping(value = "/contactus")
    public ModelAndView contactus() {
        return new ModelAndView("um/contactus");
    }

    @RequestMapping(value = "/currencymaintenance")
    public ModelAndView currentMaintenance() {
        return new ModelAndView("um/currencymaintenance");
    }
}
