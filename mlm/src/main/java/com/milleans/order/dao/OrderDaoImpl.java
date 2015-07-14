package com.milleans.order.dao;

import com.milleans.dao.AbstractDao;
import com.milleans.model.Order;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.*;

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

    @Override
    public ArrayList<Order> getOrders(int uid) {
        Criteria criteria = this.getCurrentSession().createCriteria(Order.class);

        System.out.println("uid===" + uid);
        criteria.add(Restrictions.eq("userid", uid));

        ArrayList<Order> list = (ArrayList<Order>) criteria.list();

        return list;
    }

    @Override
    public Order getOrder(int order) {

        Criteria criteria = this.getCurrentSession().createCriteria(Order.class);
        criteria.add(Restrictions.eq("id", order));

        List<Order> list = criteria.list();

        if (list == null || list.size() == 0) {
            return null;
        } else
            return list.get(0);
    }
}
