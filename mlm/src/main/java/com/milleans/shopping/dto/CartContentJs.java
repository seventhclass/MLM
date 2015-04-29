package com.milleans.shopping.dto;

import com.milleans.dto.BaseJs;
import java.util.List;

/**
 * Created by LeHu on 4/24/15 10:31 PM.
 */
public class CartContentJs extends BaseJs{

    private List<CartContent> cartContentList;

    public List<CartContent> getCartContentList() {
        return cartContentList;
    }

    public void setCartContentList(List<CartContent> cartContentList) {
        this.cartContentList = cartContentList;
    }
}
