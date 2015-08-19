package com.milleans.order.dao;

import com.milleans.dao.AbstractDao;
import com.milleans.model.Orderdetails;
import com.milleans.order.dto.OrderDealingInfo;
import com.milleans.tools.Constant;
import com.milleans.tools.Utils;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
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

        String sql = "SELECT od.orderIdl, od.status, od.createddate, u.userId, " +
                " CONCAT( u.firstname,  ' ', u.lastname )," +
                " SUM( od.price_total )*" + (1 + Constant.TaxRate) +
                " + m.fee " +
                " FROM t_orderdetails od, t_user u, t_autoship s, t_shippingmethod m " +
                " WHERE od.userId = u.id " +
                " AND od.status =1 " +
                " AND od.autoship_id = s.id " +
                " AND s.shipmethodid = m.id " +
                " GROUP BY od.orderIdl ";


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

            tmp.setUserName(objects[4].toString());

            tmp.setAmount(objects[5].toString());

            float amountf = Float.valueOf(tmp.getAmount());
            tmp.setAmount(Utils.decimalFormat.format(amountf));

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

//    @Override
//    public ArrayList<String> getOrderAutoShip(String[] orderArr) {
//
//
//
//        return null;
//    }

//    @Override
//    public ArrayList<String> getOrderAutoShip(Date date) {
//
//        java.sql.Date _sqlDate=new java.sql.Date(date.getTime());
//
//        String sql = "SELECT o.orderIdl " +
//                " FROM t_autoship s, t_account a, t_orderdetails o, t_user u" +
//                " WHERE s.userid = u.id " +
//                " AND u.accountid = a.id " +
//                " AND o.autoship_id = s.id " +
//                " AND a.isautoship =1 " +
//                " GROUP BY o.orderIdl";
//
//        List<String> relist = new ArrayList<>();
//
//        Query query = this.getCurrentSession().createSQLQuery(sql);
//        relist = query.list();
//
//        return (ArrayList) relist;
//    }

    @Override
    public List<Orderdetails> getOrderdetails(String orderIdL) {

        //Criteria criteria=this.getCurrentSession().create
        String hql = "select o from Orderdetails o, User u, Account a " +
                " where o.orderIdl='" + orderIdL + "' " +
                " and o.userid=u.id " +
                " and u.accountId=a.id " +
                " and a.autoship=1";

        Query query = this.getCurrentSession().createQuery(hql);

        List<Orderdetails> list = query.list();
        return list;
    }

    @Override
    public float getAmount(String orderIdL) {

        Criteria criteria = this.getCurrentSession().createCriteria(Orderdetails.class);
        criteria.add(Restrictions.eq("orderIdL", orderIdL));

        List<Orderdetails> rs = criteria.list();

        float amount = 0f;

        for (Orderdetails order : rs) {
            amount += order.getPriceTotal();
        }
        return amount;
    }
}
