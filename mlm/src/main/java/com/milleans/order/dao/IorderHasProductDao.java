package com.milleans.order.dao;

import com.milleans.dao.IDao;
import com.milleans.order.dto.OrderHasProductDTO;
import com.milleans.order.dto.OrderProducts;
import com.milleans.order.dto.OrderSummaryDto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LeHu on 7/10/15 11:46 AM.
 */
public interface IorderHasProductDao extends IDao{
    List<OrderProducts> getProducts(int orderId);

    OrderSummaryDto getOrderSummary(int orderId);

    ArrayList<OrderHasProductDTO> getItem(int orderId);


    void deleteOrderProductShip(String orderId);
}
