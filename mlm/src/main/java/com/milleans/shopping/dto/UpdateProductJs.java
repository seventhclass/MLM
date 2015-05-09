package com.milleans.shopping.dto;

import com.milleans.dto.BaseJs;

/**
 * Created by LeHu on 5/9/15 10:52 AM.
 */
public class UpdateProductJs extends BaseJs {

    private int id;

    private int quantity;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
