package com.milleans.order.controller;

/**
 * Created by LeHu on 7/14/15 4:44 PM.
 */

import com.milleans.model.Order;
import com.milleans.model.Orderdetails;
import com.milleans.model.Product;
import com.milleans.order.dto.OrderHasProductDTO;
import com.milleans.order.dto.ProcessOrder;
import com.milleans.order.services.IOrderDetailService;
import com.milleans.order.services.IorderHasProductService;
import com.milleans.order.services.IorderService;
import com.milleans.product.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Calendar;

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

    @RequestMapping(value = "/process/{orderId}", method = RequestMethod.POST)
    @ResponseBody
    public ProcessOrder doProcessOrder(@PathVariable("orderId") String orderId) {
        ProcessOrder processOrder = new ProcessOrder();
        try {
            int _orderId = Integer.valueOf(orderId);
            // cp orderinfo & productinfo to detail table
            Order order = orderService.getOrder(_orderId);

            ArrayList<OrderHasProductDTO> orderHasProduct = orderHasProductService.getItem(_orderId);
            ArrayList<Orderdetails> orderdetailsesList = new ArrayList<>();

            Orderdetails orderdetails = null;
            for (OrderHasProductDTO orderHasProductDTO : orderHasProduct) {
                orderdetails = new Orderdetails();

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
//            orderdetails.setSeq();

//            orderdetails.setTransactionprice();
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


}
