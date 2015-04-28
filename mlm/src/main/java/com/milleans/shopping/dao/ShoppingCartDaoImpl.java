package com.milleans.shopping.dao;

import com.milleans.dao.AbstractDao;
import com.milleans.model.Product;
import com.milleans.model.ShoppingCart;
import com.milleans.shopping.dto.CartContent;
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
        return null;
    }

    @Override
    @Transactional
    public void saveOrUpdate(ShoppingCart shoppingCart) {
        this.getCurrentSession().saveOrUpdate(shoppingCart);
    }

    @Override
    public List<CartContent> getProductList(String userId) {

        String hql="select p,c.id from Product as p, ShoppingCart c, User u " +
                "where u.userId="+userId+" and c.userId=u.id and c.productId=p.id";

        Query query = this.getCurrentSession().createQuery(hql);

        List list=query.list();

        for (Object object : list) {
            CartContent cartContent =new CartContent();
            Object[] objects=(Object[])object;
            Product product=(Product)objects[0];
            ShoppingCart shoppingCart=(ShoppingCart)objects[1];

            cartContent.setCapsuleNumber(product.getCapsuleNumber());

        }


        return null;
    }
}
