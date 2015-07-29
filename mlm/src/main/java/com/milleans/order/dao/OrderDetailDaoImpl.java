package com.milleans.order.dao;

import com.milleans.dao.AbstractDao;
import com.milleans.order.dto.OrderDealingInfo;
import com.milleans.tools.Utils;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

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

    @Override
    public ArrayList<OrderDealingInfo> getOrderList(int status) throws ParseException {

//        Criteria criteria = this.getCurrentSession().createCriteria(Orderdetails.class);
//
//        criteria.add(Restrictions.eq("status", status));
//
//        criteria.setProjection(Projections.property("orderIdl"));


        String sql = "select DISTINCT od.orderIdl, od.status,od.createddate, u.userId from t_orderdetails od, t_user u " +
                " where od.userId=u.id  and od.status=" + status;

        Query query = this.getCurrentSession().createSQLQuery(sql);

        ArrayList<OrderDealingInfo> list = new ArrayList<>();
        List rs = query.list();

        for (Object object : rs) {
            Object[] objects = (Object[]) object;

            OrderDealingInfo tmp = new OrderDealingInfo();

            tmp.setOrdlerIdL(objects[0].toString());
            tmp.setStatus(objects[1].toString());
            SimpleDateFormat dateFormat = new SimpleDateFormat(Utils.MilleanDateFormate);
            tmp.setCreateDate(dateFormat.parse(objects[2].toString()));
            tmp.setUserIdL(objects[3].toString());

            list.add(tmp);
        }

        return list;
    }
}
