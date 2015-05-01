package com.milleans.shopping.dao;

import com.milleans.common.dto.CartSummary;
import com.milleans.dao.AbstractDao;
import com.milleans.model.ShoppingCart;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
    public CartSummary getCartSummary(String userId) {

        String hql= "";

        return null;
    }


}
