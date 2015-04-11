package com.milleans.order.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by macbookpro on 2015-03-26.
 */
@Controller("/order")
public class OrderController {


    @RequestMapping(value = "/orderentyr")
    public ModelAndView orderEntry() {
        return new ModelAndView("um/orderentry");
    }

    
}
