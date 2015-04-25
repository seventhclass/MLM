package com.milleans.shopping.services;

import com.milleans.shopping.dao.IShoppingCartDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by LeHu on 4/24/15 10:38 PM.
 */
@Service("shoppingCartService")
public class ShoppingCartImpl implements IShoppingCart {

    @Autowired
    private IShoppingCartDao shoppingCartDao;


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
    public Object getItemById(String id) {
//        shoppingCartDao.
        return null;
    }
}
