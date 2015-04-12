package com.milleans.payment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by macbookpro on 2015-04-11.
 */
@Controller("payController")
public class PayController {


    @RequestMapping(value = "/paymenttype",method = RequestMethod.GET)
    public ModelAndView paymentType() {
        return new ModelAndView("um/paymenttype");
    }
}
