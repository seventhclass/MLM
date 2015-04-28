package com.milleans.shopping.services;

import com.milleans.model.ShoppingCart;
import com.milleans.service.ICrud;
import com.milleans.shopping.dto.CartContent;

import java.util.List;

/**
 * Created by LeHu on 4/24/15 10:36 PM.
 */
public interface IShoppingCartService extends ICrud {

    public void saveOrUpdate(ShoppingCart shoppingCart);


    public List<CartContent> getProducts(String userId);

}
