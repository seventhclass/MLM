package com.milleans.shopping.services;

import com.milleans.common.dto.CartSummary;
import com.milleans.model.ShoppingCart;
import com.milleans.service.ICrud;

/**
 * Created by LeHu on 4/24/15 10:36 PM.
 */
public interface IShoppingCartService extends ICrud {

    public void saveOrUpdate(ShoppingCart shoppingCart);

    CartSummary getCartSummary(String userId);


//    public List<CartContent> getProducts(String userId);

}
