package com.milleans.shopping.dao;

import com.milleans.dao.IDao;
import com.milleans.model.ShoppingCart;

/**
 * Created by LeHu on 4/24/15 10:41 PM.
 */
public interface IShoppingCartDao extends IDao {

    public ShoppingCart getCurrentCart(String userId);
}
