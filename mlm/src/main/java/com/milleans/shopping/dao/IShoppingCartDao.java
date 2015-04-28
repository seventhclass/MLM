package com.milleans.shopping.dao;

import com.milleans.dao.IDao;
import com.milleans.model.ShoppingCart;
import com.milleans.shopping.dto.CartContent;

import java.util.List;

/**
 * Created by LeHu on 4/24/15 10:41 PM.
 */
public interface IShoppingCartDao extends IDao {

    public ShoppingCart getCurrentCart(String userId);

    void saveOrUpdate(ShoppingCart shoppingCart);

    List<CartContent> getProductList(String userId);
}
