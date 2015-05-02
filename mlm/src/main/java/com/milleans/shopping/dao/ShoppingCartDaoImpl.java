package com.milleans.shopping.dao;

import com.milleans.common.dto.CartSummary;
import com.milleans.dao.AbstractDao;
import com.milleans.model.ShoppingCart;
import org.hibernate.Query;
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
    public void save(Object object) {

    }

    @Override
    public void remove(Object object) {

    }

    @Override
    public void update(Object object) {

    }

    @Override
    public ShoppingCart getCurrentCart(String userId) {

        String hql="select c from ShoppingCart as c, User as u " +
                " where c.userid=u.id and u.userid="+userId;

        Query query = this.getCurrentSession().createQuery(hql);

        List list=query.list();

        ShoppingCart shoppingCart=null;

        for (Object object : list) {
            Object[] objects=(Object[])object;
            shoppingCart=(ShoppingCart)objects[0];
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

        String hql="select sum(c.quantity), sum(c.quantity*c.transactionPrice) from ShoppingCart as c, User as u " +
                " where c.userid=u.id and u.userId="+userId;

        Query query = this.getCurrentSession().createQuery(hql);

        CartSummary cartSummary=new CartSummary();

        List list=query.list();

        for (Object object : list) {

            Object[] objects=(Object[])object;
            cartSummary.setTotalQuantily(((Long) objects[0]));
            cartSummary.setTotalAmount((Double)objects[1]);

        }
        return cartSummary;
    }

    public int getProductAmount(String userId,String productId) {

        return 0;
    }


    public float getAmountTranscationPrice(String userId,String productId){


        return 0;
    }


}
