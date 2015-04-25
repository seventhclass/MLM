package com.milleans.shopping.dao;

import com.milleans.dao.AbstractDao;
import com.milleans.shopping.controller.ShoppingCart;
import org.springframework.stereotype.Repository;

/**
 * Created by LeHu on 4/24/15 10:41 PM.
 */
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
}
