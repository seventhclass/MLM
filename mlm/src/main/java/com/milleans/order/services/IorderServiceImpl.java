package com.milleans.order.services;

import com.milleans.model.Order;
import com.milleans.order.dao.IorderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

/**
 * Created by LeHu on 5/9/15 2:59 PM.
 */
@Service("orderService")
@Transactional
public class IorderServiceImpl implements IorderService {

    @Autowired
    private IorderDao orderDao;


    @Override
    public ArrayList<Order> getOrders(int uid) {
        return orderDao.getOrders(uid);
    }

    @Override
    public void save(Object object) {

    }

    @Override
    public void remove(Object object) {
        orderDao.remove(object);
    }

    @Override
    public void update(Object object) {

    }

    @Override
    public Object getItemById(String id) {
        return null;
    }

    @Override
    public Order getOrder(Integer integer) {
        return orderDao.getOrder(integer);
    }

    @Override
    public int saveOrder(Order order) {
        return orderDao.saveOrder(order);
    }
}
