package com.milleans.order.dao;

import com.milleans.dao.AbstractDao;
import com.milleans.order.dto.OrderHasProductDTO;
import com.milleans.order.dto.OrderProducts;
import com.milleans.order.dto.OrderSummaryDto;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by LeHu on 7/10/15 11:49 AM.
 */
@Repository("orderHasProductDao")
@Transactional
public class OrderHasProducDaoImpl extends AbstractDao implements IorderHasProductDao {

    @Override
    public List<OrderProducts> getProducts(int orderId) {
        String sql = "SELECT p.id,p.itemcode,p.name,p.retailprice,c.symbol,p.volume,p.volume2,p.volume*oh.quantity as point,oh.quantity,oh.quantity*p.retailprice as total\n" +
                "FROM t_product AS p join t_currency as c on p.currencyid=c.id, t_order_has_t_product AS oh\n" +
                "WHERE p.id = oh.t_product_id\n" +
                "AND oh.t_order_id =" + orderId;

        Query query = this.getCurrentSession().createSQLQuery(sql);

        List<OrderProducts> orderProductses = new ArrayList<>();

        List rs = query.list();

        for (Object object : rs) {
            Object[] objects = (Object[]) object;

            OrderProducts tmp = new OrderProducts();

            tmp.setId((int) objects[0]);
            tmp.setItemCode((String) objects[1]);
            tmp.setName((String) objects[2]);
            tmp.setPrice((BigDecimal) objects[3]);
            tmp.setCurrency((String) objects[4]);
            tmp.setVolume(objects[5] == null ? null : (int) objects[5]);
            tmp.setVolume2(objects[6] == null ? null : (Integer) objects[6]);
            tmp.setPointsTotal(objects[7] == null ? null : (BigInteger) objects[7]);
            tmp.setQuantity(objects[8] == null ? null : (int) objects[8]);
            tmp.setPriceTotal(objects[9] == null ? null : (BigDecimal) objects[9]);

            orderProductses.add(tmp);
        }

        return orderProductses;
    }

    @Override
    public OrderSummaryDto getOrderSummary(int orderId) {

        OrderSummaryDto orderSummaryDto = new OrderSummaryDto();

        String sql = "SELECT oh.quantity*p.retailprice as total " +
                " FROM t_product p , t_order_has_t_product oh " +
                " WHERE p.id = oh.t_product_id " +
                " AND oh.t_order_id =" + orderId;

        Query query = this.getCurrentSession().createSQLQuery(sql);
        List<OrderProducts> orderProductses = new ArrayList<>();
        List rs = query.list();

        if (rs != null && rs.size() > 0) {
            orderSummaryDto.setSubTotal(rs.get(0).toString());
        }

        return orderSummaryDto;
    }

    @Override
    public ArrayList<OrderHasProductDTO> getItem(int orderId) {

        String sql = "select o.t_order_id, o.t_product_id,o.quantity from t_order_has_t_product o" +
                " where o.t_order_id=" + orderId;

        Query query = this.getCurrentSession().createSQLQuery(sql);

        List rs = query.list();

        ArrayList<OrderHasProductDTO> orderHasProductDTOArrayList = new ArrayList<>();

        OrderHasProductDTO orderHasProductDTO = null;
        for (Object object : rs) {
            Object[] objects = (Object[]) object;

            orderHasProductDTO = new OrderHasProductDTO();

            orderHasProductDTO.setOrderId(Integer.valueOf(objects[0].toString()));
            orderHasProductDTO.setProductId(Integer.valueOf(objects[1].toString()));
            orderHasProductDTO.setQuantity(Integer.valueOf(objects[2].toString()));

            orderHasProductDTOArrayList.add(orderHasProductDTO);
        }

        return orderHasProductDTOArrayList;
    }
}
