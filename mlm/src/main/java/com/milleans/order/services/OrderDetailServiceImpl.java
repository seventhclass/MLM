package com.milleans.order.services;

import com.milleans.order.dao.IOrderDetailDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
}
