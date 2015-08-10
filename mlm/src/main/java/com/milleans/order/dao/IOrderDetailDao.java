package com.milleans.order.dao;

import com.milleans.dao.IDao;
import com.milleans.model.Orderdetails;
import com.milleans.order.dto.OrderDealingInfo;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by LeHu on 7/14/15 5:59 PM.
 */
public interface IOrderDetailDao extends IDao {

    ArrayList<OrderDealingInfo> getOrderList(int status) throws ParseException;

    void updateOrderStatus(String orderIdl, int status);

    ArrayList<String> getOrderAutoShip(Date date);

    List<Orderdetails> getOrderdetails(String orderIdL);
}
