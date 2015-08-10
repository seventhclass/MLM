package com.milleans.shipping.controller;

import com.milleans.dto.BaseJs;
import com.milleans.model.Orderdetails;
import com.milleans.order.services.IOrderDetailService;
import com.milleans.shipping.dto.ShipInfoJs;
import com.milleans.shipping.service.IAutoShip;
import com.milleans.tools.Constant;
import com.milleans.tools.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by macbookpro on 2015-04-11.
 */
@Controller("shipController")
@RequestMapping("ship")
public class ShipController {

    @Autowired
    private IAutoShip autoShipService;

    @Autowired
    private IOrderDetailService orderDetailService;

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
        try {
            Date date1 = Utils.DateFormat.parse(date);
            shipInfoJs.setShipInfos(autoShipService.getShipList(date1));
        } catch (ParseException p) {
            p.printStackTrace();
            shipInfoJs.setMessage(p.getMessage());
            shipInfoJs.setResult("fail");
        }

        return shipInfoJs;
    }

    @RequestMapping(value = "/finishedShip", method = RequestMethod.POST)
    @ResponseBody
    public BaseJs updateOrderStatus(@RequestParam("orderArr") String orderArr,
                                    @RequestParam("date") String date) {
        BaseJs baseJs = new BaseJs();
        String[] orders = orderArr.split(";");
        for (int i = 0; i < orders.length; i++) {
            orderDetailService.updateOrderStatus(orders[i],
                    Integer.valueOf(Constant.OrderStatusUnShipping));
        }


        return baseJs;
    }


    private void makeAutoShipOrder(String dates) {
        try {
            Date date = Utils.DateFormat.parse(dates);
            ArrayList<String> orders=orderDetailService.getOrdersAutoShip(date);

            if(orders!=null && !orders.isEmpty()) {
                //copy order info , create new orders
                for (String orderIdl : orders) {
                    this.copyOrder(orderIdl);
                }
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private void copyOrder(String orderIdL) {

        // search order;
         List<Orderdetails> orderdetails=orderDetailService.getOrderdetails(orderIdL);



    }

}
