package com.milleans.order.dao;

import com.milleans.dao.IDao;
import com.milleans.model.Order;

import java.util.ArrayList;

/**
 * Created by LeHu on 7/10/15 11:18 AM.
 */
public interface IorderDao extends IDao {
    int saveOrder(Order order);

    ArrayList<Order> getOrders(int uid);


    Order getOrder(int order);
}
