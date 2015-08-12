package com.milleans.shipping.controller;

import com.milleans.dto.BaseJs;
import com.milleans.model.AutoShip;
import com.milleans.model.Orderdetails;
import com.milleans.order.services.IOrderDetailService;
import com.milleans.shipping.dto.ShipInfoJs;
import com.milleans.shipping.service.IAutoShip;
import com.milleans.tools.Constant;
import com.milleans.tools.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.text.ParseException;
import java.util.*;

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
    @Transactional
    public BaseJs updateOrderStatus(@RequestParam("orderArr") String orderArr,
                                    @RequestParam("date") String date) {
        BaseJs baseJs = new BaseJs();
        //
        String[] ordersPair = orderArr.split(";");
        Map<String, String> ordersMap = new HashMap<>();

        for (String ele : ordersPair) {
            String[] pair = ele.split(":");
            ordersMap.put(pair[0], pair[1]);
        }
        String[] orderKeyArr = new String[ordersMap.size()];
        ordersMap.keySet().toArray(orderKeyArr);

        for (int i = 0; i < orderKeyArr.length; i++) {
            orderDetailService.updateOrderStatus(orderKeyArr[i],
                    Integer.valueOf(Constant.OrderStatusFinished));
        }

        //make orders for autoship;
        for (int i = 0; i < orderKeyArr.length; i++) {

            if (ordersMap.get(orderKeyArr[i]).equals("1")) {
                makeAutoShipOrder(orderKeyArr[i], date);
            }
        }
        //makeAutoShipOrder(orderStrArr);
        return baseJs;
    }


    private void makeAutoShipOrder(String orderIdL, String date) {

        try {
            Date _date = Utils.DateFormat.parse(date);

            //create new date
            Calendar rightNow = Calendar.getInstance();
            rightNow.setTime(_date);
            rightNow.add(Calendar.MONTH, 1);

            this.copyOrder(orderIdL, rightNow.getTime());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void copyOrder(String orderIdL, Date date) {

        java.sql.Date _sqlDate = new java.sql.Date(date.getTime());

        // search order;
        List<Orderdetails> orderdetails = orderDetailService.getOrderdetails(orderIdL);
        AutoShip autoShip = null;
        AutoShip newAutoShip = null;
        int newId = 0;
        if (!orderdetails.isEmpty()) {
            autoShip = autoShipService.getItem(orderdetails.get(0).getAutoshipId());
            newAutoShip = (AutoShip) autoShip.clone();
            newAutoShip.setDate(_sqlDate);

            newId = autoShipService.save(newAutoShip);
        }

        for (Orderdetails ele : orderdetails) {

            Orderdetails dest = (Orderdetails) ele.clone();

            dest.setCreatedDate(Calendar.getInstance().getTime());
            dest.setStatus(Integer.valueOf(Constant.OrderStatusUnPayment));
            dest.setOrderIdl(Utils.getOrderNumber());
            dest.setEndedate(dest.getCreatedDate());
            dest.setAutoshipId(newId);

            orderDetailService.save(dest);
        }

    }

}
