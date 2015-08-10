package com.milleans.order.services;

import com.milleans.order.dao.IOrderDetailDao;
import com.milleans.order.dto.OrderDealingInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by LeHu on 7/14/15 5:58 PM.
 */

@Service("orderDetailService")
@Transactional
public class OrderDetailServiceImpl implements IOrderDetailService {

    @Autowired
    private IOrderDetailDao orderDetailDao;

    @Override
    public void save(Object object) {
        orderDetailDao.save(object);
    }

    @Override
    public void remove(Object object) {

    }

    @Override
    public void update(Object object) {

    }

    @Override
    public Object getItemById(String id) {
        return null;
    }

    @Override
    public ArrayList<OrderDealingInfo> getOrderStatus(int status) throws ParseException {

        return orderDetailDao.getOrderList(status);

    }

//    @Override
//    public void updatePaymentStatus(String orderIdL) {
//        orderDetailDao.updatePaymentStatus(orderIdL);
//    }

    @Override
    public void updateOrderStatus(String orderIdL, int status) {
        orderDetailDao.updateOrderStatus(orderIdL, status);
    }

    @Override
    public ArrayList<String> getOrdersAutoShip(Date date) {
        return orderDetailDao.getOrderAutoShip(date);
    }
}
