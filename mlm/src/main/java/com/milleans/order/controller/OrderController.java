package com.milleans.order.controller;

import com.milleans.dto.BaseJs;
import com.milleans.model.Order;
import com.milleans.order.services.IorderService;
import com.milleans.tools.Constant;
import com.milleans.tools.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * Created by macbookpro on 2015-03-26.
 */
@Controller("orderController")
@RequestMapping("order")
public class OrderController {

    @Autowired
    private IorderService iorderService;

    @RequestMapping(value = "/orderentry", method = RequestMethod.GET)
    public ModelAndView orderEntry() {
        return new ModelAndView("um/orderentry");
    }


    @RequestMapping(value = "/makeOrder", method = RequestMethod.POST)
    public BaseJs makeOrder(HttpSession httpSession) {
        String uid = httpSession.getAttribute(Constant.Uid).toString();


        try {
            Order order = iorderService.getOrder(Integer.valueOf(uid));

            if (order == null) {
                // create order.

            }
        } catch (Exception e) {
            e.printStackTrace();
            Utils.getFailMessage(e.getMessage());
        }

        //Order order= iorderService.save();
        //iorderService.save();

        return null;
    }


}
