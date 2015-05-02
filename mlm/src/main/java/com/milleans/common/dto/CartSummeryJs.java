package com.milleans.common.dto;

import com.milleans.dto.BaseJs;

/**
 * Created by LeHu on 5/1/15 12:26 AM.
 */
public class CartSummeryJs extends BaseJs {

    private CartSummary cartSummary;


    public CartSummary getCartSummary() {
        return cartSummary;
    }

    public void setCartSummary(CartSummary cartSummary) {
        this.cartSummary = cartSummary;
    }
}
