package com.milleans.shopping.services;

import com.milleans.AbsTest;
import org.junit.Test;

public class ShoppingCartServiceImplTest extends AbsTest {

    @Test
    public void testSave() throws Exception {

    }

    @Test
    public void testRemove() throws Exception {

    }

    @Test
    public void testUpdate() throws Exception {

    }

    @Test
    public void testGetItemById() throws Exception {

    }

    @Test
    public void testSaveOrUpdate() throws Exception {

    }

    @Test
    public void testGetCartSummary() throws Exception {
        IShoppingCartService shoppingCartService = (IShoppingCartService) context.getBean("shoppingCartService");

        shoppingCartService.getCartSummary("1430073874041");
    }


    @Test
    public void testGetProuctsOfCart() throws Exception {
        IShoppingCartService shoppingCartService = (IShoppingCartService) context.getBean("shoppingCartService");

        shoppingCartService.getProuctsOfCart("7");
    }
}