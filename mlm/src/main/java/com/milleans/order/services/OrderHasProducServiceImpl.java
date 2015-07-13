package com.milleans.order.services;

import com.milleans.model.OrderHasProduct;
import com.milleans.order.dao.IorderHasProductDao;
import com.milleans.order.dto.OrderProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by LeHu on 7/10/15 12:11 PM.
 */
@Service("orderHasProductService")
@Transactional
public class OrderHasProducServiceImpl implements IorderHasProductService {

    @Autowired
    private IorderHasProductDao orderHasProductDao;

    @Override
    public void save(Object object) {
        orderHasProductDao.save(object);
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
    public void save(List<OrderHasProduct> orderHasProductList) {
        for (OrderHasProduct orderHasProduct : orderHasProductList) {
            this.save(orderHasProduct);
        }
    }

    @Override
    public void removeProduct(int product) {

    }

    @Override
    public List<OrderProducts> getProductsByOrderId(int orderId) {

     List<OrderProducts> list= orderHasProductDao.getProducts(orderId);

        return list;
    }
}
