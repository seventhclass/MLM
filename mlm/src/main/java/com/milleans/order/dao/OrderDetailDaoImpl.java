package com.milleans.order.dao;

import com.milleans.dao.AbstractDao;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by LeHu on 7/14/15 6:00 PM.
 */
@Repository("orderDetailDao")
@Transactional
public class OrderDetailDaoImpl extends AbstractDao implements IOrderDetailDao {
    @Override
    public void save(Object object) {
        super.save(object);
    }

    @Override
    public void remove(Object object) {
        super.remove(object);
    }

    @Override
    public void update(Object object) {
        super.update(object);
    }
}
