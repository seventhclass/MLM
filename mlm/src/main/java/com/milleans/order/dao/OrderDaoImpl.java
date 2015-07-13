package com.milleans.order.dao;

import com.milleans.dao.AbstractDao;
import com.milleans.model.Order;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by LeHu on 7/10/15 11:19 AM.
 */
@Repository("orderDao")
@Transactional
public class OrderDaoImpl extends AbstractDao implements IorderDao {

    @Override
    public int saveOrder(Order order) {
        return (int) this.getCurrentSession().save(order);
    }
}
