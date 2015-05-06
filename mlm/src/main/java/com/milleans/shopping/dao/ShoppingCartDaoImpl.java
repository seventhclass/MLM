package com.milleans.shopping.dao;

import com.milleans.common.dto.CartSummary;
import com.milleans.dao.AbstractDao;
import com.milleans.model.ShoppingCart;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by LeHu on 4/24/15 10:41 PM.
 */
@Transactional
@Repository("shoppingCartDao")
public class ShoppingCartDaoImpl extends AbstractDao implements IShoppingCartDao {


    @Override
    public ShoppingCart getCurrentCart(String userId) {

        String hql = "select c from ShoppingCart as c, User as u " +
                " where c.userId=u.id and u.userId=" + userId;

        Query query = this.getCurrentSession().createQuery(hql);

        List list = query.list();

        ShoppingCart shoppingCart = null;

        for (Object object : list) {
            Object[] objects = (Object[]) object;
            shoppingCart = (ShoppingCart) objects[0];
        }

        return shoppingCart;
    }

    @Override
    @Transactional
    public void saveOrUpdate(ShoppingCart shoppingCart) {
        this.getCurrentSession().saveOrUpdate(shoppingCart);
    }

    @Override
    public CartSummary getCartSummary(String userId) {

        // ShoppingCart shoppingCart = this.getCurrentCart(userId);


        String hql = "select sum(c.quantity), sum(c.quantity*p.wholesalePrice) from ShoppingCart as c, User as u ,Product as p" +
                " where c.userId=u.id and u.userId=" + userId + " and c.productId=p.id";

        Query query = this.getCurrentSession().createQuery(hql);

        CartSummary cartSummary = new CartSummary();

        List list = query.list();

        for (Object object : list) {

            Object[] objects = (Object[]) object;

            if (objects[0] == null) {
                cartSummary.setTotalQuantily(0);
            } else {

                cartSummary.setTotalQuantily(((Long) objects[0]));
            }
            if (objects[1] == null) {
                cartSummary.setTotalAmount(0.0);
            } else {
                cartSummary.setTotalAmount((Double) objects[1]);
            }
        }
        return cartSummary;
    }

    @Override
    public ShoppingCart getCart(int productId, String userId) {

        Criteria criteria = this.getCurrentSession().createCriteria(ShoppingCart.class);

        criteria.add(Restrictions.eq("productId", String.valueOf(productId)));
        criteria.add(Restrictions.eq("userId", userId));

        List<ShoppingCart> list = criteria.list();

        if (list.size() == 0) {
            return null;
        } else {
            return list.get(0);
        }
    }


}
