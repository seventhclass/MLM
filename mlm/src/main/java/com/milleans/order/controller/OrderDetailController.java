package com.milleans.order.controller;

/**
 * Created by LeHu on 7/14/15 4:44 PM.
 */

import com.milleans.dto.BaseJs;
import com.milleans.model.AutoShip;
import com.milleans.model.Order;
import com.milleans.model.Orderdetails;
import com.milleans.model.Product;
import com.milleans.order.dto.ConfirmOrderPayment;
import com.milleans.order.dto.OrderDealingInfo;
import com.milleans.order.dto.OrderHasProductDTO;
import com.milleans.order.dto.ProcessOrder;
import com.milleans.order.services.IOrderDetailService;
import com.milleans.order.services.IorderHasProductService;
import com.milleans.order.services.IorderService;
import com.milleans.product.services.IProductService;
import com.milleans.shipping.service.IAutoShip;
import com.milleans.tools.Constant;
import com.milleans.tools.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

@Controller("orderDetailController")
@RequestMapping("orderdetail")
@Transactional
public class OrderDetailController {

    @Autowired
    private IOrderDetailService orderDetailService;

    @Autowired
    private IorderHasProductService orderHasProductService;

    @Autowired
    private IProductService productService;

    @Autowired
    private IorderService orderService;

    @Autowired
    private IAutoShip autoShipService;

    @RequestMapping(value = "/process/{orderId}/{shippingDate}/{shippingMethod}", method = RequestMethod.POST)
    @ResponseBody
    public ProcessOrder doProcessOrder(@PathVariable("orderId") String orderId,
                                       @PathVariable("shippingDate") String shippingDate,
                                       @PathVariable("shippingMethod") String shippingMehtod) {

        ProcessOrder processOrder = new ProcessOrder();
        try {
            int _orderId = Integer.valueOf(orderId);
            // cp orderinfo & productinfo to detail table
            Order order = orderService.getOrder(_orderId);
            //set autoship
            AutoShip autoShip = new AutoShip();
            autoShip.setUserid(order.getUserid());
            autoShip.setShipmethodid(Integer.valueOf(shippingMehtod));

            SimpleDateFormat dateFormat = new SimpleDateFormat(Utils.MilleanDateFormate);
            Date autoDate = dateFormat.parse(shippingDate);
            autoShip.setDate(autoDate);

            //
            int autoId = autoShipService.save(autoShip);

            ArrayList<OrderHasProductDTO> orderHasProduct = orderHasProductService.getItem(_orderId);
            ArrayList<Orderdetails> orderdetailsesList = new ArrayList<>();

            Orderdetails orderdetails = null;

            for (OrderHasProductDTO orderHasProductDTO : orderHasProduct) {
                orderdetails = new Orderdetails();

                orderdetails.setAutoshipId(autoId);
                orderdetailsesList.add(orderdetails);

                orderdetails.setCreatedDate(order.getDate());
                //get product
                Product product = (Product) productService.getItemById(String.valueOf(orderHasProductDTO.getProductId()));
                orderdetails.setCurrencyId(product.getCurrencyId());
                orderdetails.setDescription(product.getDescription());
                orderdetails.setEndedate(Calendar.getInstance().getTime());
                orderdetails.setItemCode(product.getItemCode());
                orderdetails.setOrderIdl(order.getOrderIdL());
                orderdetails.setPaymentMethodId(1);
                orderdetails.setPointTotal(orderHasProductDTO.getQuantity() * product.getVolume());
                orderdetails.setPriceTotal(orderHasProductDTO.getQuantity() * product.getRetailPrice());
                orderdetails.setProductId(product.id);
                orderdetails.setQuantity(orderHasProductDTO.getQuantity());
                orderdetails.setStatus(1);

                orderdetails.setUserid(order.getUserid());
                orderdetails.setVolume(product.getVolume());
                orderdetails.setVolume2(product.getVolume2());

                orderDetailService.save(orderdetails);
            }
            //delete order have product
            orderHasProductService.deleteOrderProductShip(orderId);
            // delete order
            orderService.remove(order);

        } catch (Exception e) {

            e.printStackTrace();
            processOrder.setMessage(e.getMessage());
            processOrder.setResult("fail");
        }


        return processOrder;
    }

    @RequestMapping(value = "/process/admin/paying", method = RequestMethod.POST)
    @ResponseBody
    public BaseJs processingOrderPayment(@RequestParam("orderids") String orderArr) {
        BaseJs baseJs = new BaseJs();
        String[] orderList = orderArr.split(";");
        for (String orderIdL : orderList) {
            orderDetailService.updateOrderStatus(orderIdL, Integer.valueOf(Constant.OrderStatusUnPayment));
        }
        return baseJs;
    }

    @RequestMapping(value = "/process/admin/unpayidorders", method = RequestMethod.POST)
    @ResponseBody
    public ConfirmOrderPayment getUnpaidOrders() {

        ConfirmOrderPayment confirmOrderPayment = new ConfirmOrderPayment();

        try {
            ArrayList<OrderDealingInfo> rs = orderDetailService.getOrderStatus(1);

            confirmOrderPayment.setOrderList(rs);

        } catch (ParseException e) {
            confirmOrderPayment.setMessage(e.getMessage());
            confirmOrderPayment.setResult("fail");
            e.printStackTrace();
        }

        return confirmOrderPayment;
    }


    @RequestMapping(value = "/process/view/unpaidorder", method = RequestMethod.GET)
    public ModelAndView getOrderdetails() {

        return new ModelAndView("um/unpaidorders");
    }


}
