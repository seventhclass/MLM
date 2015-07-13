package com.milleans.order.services;

import com.milleans.model.OrderHasProduct;
import com.milleans.order.dto.OrderProducts;
import com.milleans.service.ICrud;

import java.util.List;

/**
 * Created by LeHu on 7/10/15 12:10 PM.
 */
public interface IorderHasProductService extends ICrud {

    void save(List<OrderHasProduct> orderHasProductList);

    void removeProduct(int product);

    List<OrderProducts> getProductsByOrderId(int orderId);


}
