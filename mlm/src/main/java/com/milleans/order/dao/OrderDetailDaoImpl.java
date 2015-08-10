package com.milleans.order.dao;

import com.milleans.dao.AbstractDao;
import com.milleans.model.Orderdetails;
import com.milleans.order.dto.OrderDealingInfo;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
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
            //SimpleDateFormat dateFormat = new SimpleDateFormat(Utils.MilleanDateFormate);
            //String test= objects[2].toString();

            //long tl=Long.valueOf(test);
            //Date td=new Date(tl);

            tmp.setCreateDate(objects[2].toString());
            tmp.setUserIdL(objects[3].toString());

            list.add(tmp);
        }

        return list;
    }

//    @Override
//    public void updatePaymentStatus(String orderIdL) {
//        String sql = "update t_orderdetails set status=3 where orderidl=" + orderIdL;
//        this.getCurrentSession().createSQLQuery(sql).executeUpdate();
//    }

    @Override
    public void updateOrderStatus(String orderIdl, int status) {
        String sql = "update t_orderdetails set status=" + status +
                " where orderidl=" + orderIdl;
        this.getCurrentSession().createSQLQuery(sql).executeUpdate();
    }

    @Override
    public ArrayList<String> getOrderAutoShip(Date date) {

        String sql = "SELECT o.orderIdl " +
                " FROM t_autoship s, t_account a, t_orderdetails o, t_user u" +
                " WHERE s.userid = u.id " +
                " AND u.accountid = a.id " +
                " AND o.autoship_id = s.id " +
                " AND a.isautoship =1 " +
                " GROUP BY o.orderIdl";

        List<String> relist = new ArrayList<>();

        Query query = this.getCurrentSession().createSQLQuery(sql);
        relist = query.list();

        return (ArrayList) relist;
    }

    @Override
    public List<Orderdetails> getOrderdetails(String orderIdL) {

        //Criteria criteria=this.getCurrentSession().create
        String hql="select o from Orderdetails o, User u, Account a "+
                " where o.orderIdl='"+orderIdL+"' " +
                " and o.userid=u.id " +
                " and u.accountId=a.id " +
                " and a.autoship=1";

        Query query = this.getCurrentSession().createQuery(hql);

        List<Orderdetails> list=query.list();
        return list;
    }
}
