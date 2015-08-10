package com.milleans.order.services;

import com.milleans.order.dto.OrderDealingInfo;
import com.milleans.service.ICrud;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by LeHu on 7/14/15 5:54 PM.
 */
public interface IOrderDetailService extends ICrud {

    ArrayList<OrderDealingInfo> getOrderStatus(int status) throws ParseException;

    //void updatePaymentStatus(String orderIdL);

    void updateOrderStatus(String orderIdL, int status);

    ArrayList<String> getOrdersAutoShip(Date date);

}
