package com.milleans.shopping.services;

import com.milleans.common.dto.CartSummary;
import com.milleans.model.ShoppingCart;
import com.milleans.shopping.dao.IShoppingCartDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by LeHu on 4/24/15 10:38 PM.
 */
@Service("shoppingCartService")
@Transactional
public class ShoppingCartServiceImpl implements IShoppingCartService {

    @Autowired
    private IShoppingCartDao shoppingCartDao;


    @Override
    public void save(Object object) {
        shoppingCartDao.save(object);
    }

    @Override
    public void remove(Object object) {
        shoppingCartDao.remove(object);
    }

    @Override
    public void update(Object object) {

    }

    @Override
    public ShoppingCart getItemById(String shoppingCartId) {
        //shoppingCartDao.get
        int sid=Integer.valueOf(shoppingCartId);

        return shoppingCartDao.getItemById(sid);
    }


    @Override
    public List<Integer> getExistProduct(String userId) {
        return null;
    }

    @Override
    public ShoppingCart getCart(int productId, String userId) {
        return shoppingCartDao.getCart(productId,userId);
    }



    @Override
    @Transactional
    public void saveOrUpdate(ShoppingCart shoppingCart) {
        shoppingCartDao.saveOrUpdate(shoppingCart);
    }

    @Override
    public CartSummary getCartSummary(String userId) {

        CartSummary cartSummary = shoppingCartDao.getCartSummary(userId);
        return cartSummary;
    }

}
