package com.milleans.order.controller;

import com.fasterxml.jackson.databind.deser.Deserializers;
import com.milleans.dto.BaseJs;
import com.milleans.model.Order;
import com.milleans.model.OrderHasProduct;
import com.milleans.model.OrderUionProductPKID;
import com.milleans.model.ShoppingCart;
import com.milleans.order.dto.*;
import com.milleans.order.services.IorderHasProductService;
import com.milleans.order.services.IorderService;
import com.milleans.shopping.services.IShoppingCartService;
import com.milleans.tools.Constant;
import com.milleans.tools.Utils;
import com.milleans.um.dto.OrderPendingDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by macbookpro on 2015-03-26.
 */
@Controller("orderController")
@RequestMapping("order")
@Transactional
public class OrderController {

    @Autowired
    private IorderService orderService;

    @Autowired
    private IorderHasProductService orderHasProductService;

    @Autowired
    private IShoppingCartService shoppingCartService;


    @RequestMapping(value = "/orderentry/{orderId}", method = RequestMethod.GET)
    public ModelAndView orderEntry(@PathVariable("orderId") String orderId) {
        ModelAndView modelAndView = new ModelAndView("um/orderentry");
        System.out.println("---->>>>" + orderId);
        modelAndView.addObject("orderId", orderId);
        return modelAndView;
    }


    @RequestMapping(value = "/cancel/{orderId}", method = RequestMethod.POST)
    @ResponseBody
    public BaseJs cancelCurrentOrder(@PathVariable("orderId") String orderId) {
        // ModelAndView modelAndView = new ModelAndView("um/products");
        BaseJs baseJs = new BaseJs();
        try {

            orderHasProductService.deleteOrderProductShip(orderId);
        } catch (Exception e) {
            e.printStackTrace();
            baseJs.setMessage(e.getMessage());
            baseJs.setMessage("fail");
        }

        return baseJs;
    }

    @RequestMapping(value = "/products/{orderId}", method = RequestMethod.POST)
    @ResponseBody
    public ProductListOfOrder getProductsOfOrder(@PathVariable("orderId") String orderId) {
        ProductListOfOrder productListOfOrder = new ProductListOfOrder();
        try {
            List<OrderProducts> orderProductsList =
                    orderHasProductService.getProductsByOrderId(Integer.valueOf(orderId));

            for (OrderProducts orderProducts : orderProductsList) {
                productListOfOrder.setVolumeTotal(productListOfOrder.getVolumeTotal() + orderProducts.getVolume());
                productListOfOrder.setPriceTotal(productListOfOrder.getPriceTotal().add(orderProducts.getPriceTotal()));
                productListOfOrder.setPointsTotal(productListOfOrder.getPointsTotal().add(orderProducts.getPointsTotal()));
            }

            productListOfOrder.setMyOrderInfo(orderProductsList);

        } catch (Exception e) {
            e.printStackTrace();
            productListOfOrder.setMessage(e.getMessage());
            productListOfOrder.setMessage("fail");
        }

        return productListOfOrder;
    }


    @RequestMapping(value = "/makeOrder", method = RequestMethod.POST)
    @ResponseBody
    @Transactional
    public MakingOrderDto makeOrder(HttpSession httpSession) {

        String uid = httpSession.getAttribute(Constant.Uid).toString();
        MakingOrderDto makingOrderDto = new MakingOrderDto();

        try {
            List<ShoppingCart> shoppingCartList = shoppingCartService.getListOfShoppingCart(Integer.valueOf(uid));
            String orderIdL = Utils.getOrderNumber();
            Order newOrder = new Order();
            newOrder.setDate(Calendar.getInstance().getTime());
            newOrder.setOrderIdL(orderIdL);
            newOrder.setStatus(Constant.OrderPending);
            newOrder.setUserid(Integer.valueOf(uid));
            int curOrderId
                    = orderService.saveOrder(newOrder);
            //step 1
            // cp shopping content to order
            List<OrderHasProduct> orderHasProductList = new ArrayList<>();
            for (ShoppingCart shoppingCart : shoppingCartList) {
                OrderHasProduct orderHasProduct = new OrderHasProduct();
                OrderUionProductPKID orderUionProductPKID = new OrderUionProductPKID();
                orderUionProductPKID.setOrderId(curOrderId);
                orderUionProductPKID.setProductId(shoppingCart.getProductId());

//                orderHasProduct.setOrderId(newOrder.getId());
//                orderHasProduct.setProductId(shoppingCart.getProductId());
                orderHasProduct.setOrderUionProductPKID(orderUionProductPKID);
                orderHasProduct.setQuantity(shoppingCart.getQuantity());
                // set transcation price;
                orderHasProduct.setTransactionPrice(shoppingCart.getTransactionPrice());
                orderHasProductList.add(orderHasProduct);
            }
            orderHasProductService.save(orderHasProductList);
            //step 2:
            // empty shopping cart
            shoppingCartService.emptyShoppingCart(Integer.valueOf(uid));

            makingOrderDto.setOrderId(newOrder.getId());
            makingOrderDto.setOrderIdL(newOrder.getOrderIdL());

        } catch (Exception e) {
            e.printStackTrace();
            Utils.getFailMessage(e.getMessage());
            makingOrderDto.setMessage(e.getMessage());
            makingOrderDto.setResult("fail");
        }

        return makingOrderDto;
    }

    @RequestMapping(value = "/bindShippingId", method = RequestMethod.POST)
    @ResponseBody
    public OrderAutoShipBinding bindingAutoShip(@RequestParam("orderId") String orderId, @RequestParam("autoShopId") String autoShipId) {

        OrderAutoShipBinding orderAutoShipBinding = new OrderAutoShipBinding();

        try {
            int _orderId = Integer.valueOf(orderId);
            int _autoShipId = Integer.valueOf(autoShipId);
            Order order = orderService.getOrder(_orderId);

            order.setAutoshipid(_autoShipId);

            orderService.update(order);

        } catch (Exception e) {
            e.printStackTrace();
            Utils.getFailMessage(e.getMessage());
            orderAutoShipBinding.setMessage(e.getMessage());
            orderAutoShipBinding.setResult("fail");
        }

        return orderAutoShipBinding;
    }

    @RequestMapping(value = "/bindPayment", method = RequestMethod.POST)
    @ResponseBody
    public OrderPaymentBinding bindingPayment(@RequestParam("orderId") String orderId, @RequestParam("paymentId") String paymentId) {
        OrderPaymentBinding orderPaymentBinding = new OrderPaymentBinding();

        try {
            int _orderId = Integer.valueOf(orderId);
            int _paymentId = Integer.valueOf(paymentId);

            Order order = orderService.getOrder(_orderId);

            order.setPaymentid(_paymentId);

            orderService.update(order);
        } catch (Exception e) {
            e.printStackTrace();
            Utils.getFailMessage(e.getMessage());
            orderPaymentBinding.setMessage(e.getMessage());
            orderPaymentBinding.setResult("fail");
        }

        return orderPaymentBinding;
    }


    @RequestMapping(value = "/myOrderList", method = RequestMethod.GET)
    public ModelAndView getMyOrderList() {
        ModelAndView modelAndView = new ModelAndView("um/myorders");

        return modelAndView;
    }

    @RequestMapping(value = "/allOrder", method = RequestMethod.POST)
    @ResponseBody
    public OrderPendingDTO getAllOrders(HttpSession httpSession) {

        OrderPendingDTO orderPendingDTO = new OrderPendingDTO();
        try {
            int uid = Integer.valueOf(httpSession.getAttribute(Constant.Uid).toString());
            orderPendingDTO.setMyOrderInfo(orderService.getOrders(uid));
        } catch (Exception e) {
            e.printStackTrace();
            orderPendingDTO.setMessage(e.getMessage());
            orderPendingDTO.setResult("fail");
        }

        return orderPendingDTO;
    }

    @RequestMapping(value = "/orderSummary/{orderId}", method = RequestMethod.POST)
    @ResponseBody
    public OrderSummaryDto getOrderSummary(@PathVariable("orderId") String orderId, HttpSession httpSession) {

        OrderSummaryDto orderSummaryDto =
                orderHasProductService.getOrderSummary(Integer.valueOf(orderId));
        return orderSummaryDto;
    }

}
