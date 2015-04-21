package com.milleans.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by macbookpro on 2015-04-11.
 */
@Controller("shipController")
public class ShipController {


    @RequestMapping(value = "/autoship")
    public ModelAndView autoShip() {
        ModelAndView modelAndView = new ModelAndView("um/autoship");
        return modelAndView;
    }


    @RequestMapping(value = "/autoshiplist")
    public ModelAndView autoShipList() {
        return new ModelAndView("um/autoshiplist");
    }
}
