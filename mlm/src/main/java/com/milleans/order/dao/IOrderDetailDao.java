package com.milleans.order.dao;

import com.milleans.dao.IDao;
import com.milleans.order.dto.OrderDealingInfo;

import java.text.ParseException;
import java.util.ArrayList;

/**
 * Created by LeHu on 7/14/15 5:59 PM.
 */
public interface IOrderDetailDao extends IDao {

    ArrayList<OrderDealingInfo> getOrderList(int status) throws ParseException;

}
