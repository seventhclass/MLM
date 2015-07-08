package com.milleans.shopping.dao;

import com.milleans.common.dto.CartSummary;
import com.milleans.dao.IDao;
import com.milleans.model.ShoppingCart;

import java.util.List;

/**
 * Created by LeHu on 4/24/15 10:41 PM.
 */
public interface IShoppingCartDao extends IDao {

    public ShoppingCart getCurrentCart(String userId);

    void saveOrUpdate(ShoppingCart shoppingCart);

    CartSummary getCartSummary(String userId);

    ShoppingCart getCart(int productId, String userId);

    ShoppingCart getItemById(int sid);

    List<Integer> getAllProductIds(String uid);

//    List<CartContent> getProductList(String userId);


}
