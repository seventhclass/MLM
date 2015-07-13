package com.milleans.order.dao;

import com.milleans.dao.IDao;
import com.milleans.order.dto.OrderProducts;

import java.util.List;

/**
 * Created by LeHu on 7/10/15 11:46 AM.
 */
public interface IorderHasProductDao extends IDao{
    List<OrderProducts> getProducts(int orderId);
}
