package com.milleans.order.services;

import com.milleans.model.Order;
import com.milleans.service.ICrud;

import java.util.ArrayList;

/**
 * Created by LeHu on 5/9/15 1:22 PM.
 */
public interface IorderService extends ICrud{

    Order getOrder(Integer integer);

    //void saveOrderHasProduct()

    int saveOrder(Order order);

    ArrayList<Order> getOrders(int uid);

}
