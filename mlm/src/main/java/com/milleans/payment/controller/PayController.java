package com.milleans.payment.controller;

import com.milleans.model.Order;
import com.milleans.order.services.IorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by macbookpro on 2015-04-11.
 */
@Controller("payController")
public class PayController {

    @Autowired
    private IorderService iorderService;

    @RequestMapping(value = "/paymenttype", method = RequestMethod.GET)
    public ModelAndView paymentType() {
        return new ModelAndView("um/paymenttype");
    }

    @RequestMapping(value = "/payandship/{orderId}", method = RequestMethod.GET)
    public ModelAndView payandShip(@PathVariable("orderId") String orderId) {


        Order order = iorderService.getOrder(Integer.valueOf(orderId));
        String orderIdL = order.getOrderIdL();
        ModelAndView modelAndView = new ModelAndView("um/payandship");
        modelAndView.addObject("orderId", orderId);
        modelAndView.addObject("orderIdL", orderIdL);

        return modelAndView;
    }
}
