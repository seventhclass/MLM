package com.milleans.shipping.controller;

import com.milleans.shipping.dto.ShipInfoJs;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by macbookpro on 2015-04-11.
 */
@Controller("shipController")
@RequestMapping("ship")
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


    @RequestMapping(value = "/shipList", method = RequestMethod.POST)
    @ResponseBody
    public ShipInfoJs getShipList(@RequestParam("date") String date) {
        ShipInfoJs shipInfoJs = new ShipInfoJs();





        return shipInfoJs;
    }


}
