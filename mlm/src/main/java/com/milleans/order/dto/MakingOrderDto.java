package com.milleans.order.dto;

import com.milleans.dto.BaseJs;

/**
 * Created by LeHu on 7/10/15 1:55 PM.
 */
public class MakingOrderDto extends BaseJs {

    private int orderId;

    private String orderIdL;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderIdL() {
        return orderIdL;
    }

    public void setOrderIdL(String orderIdL) {
        this.orderIdL = orderIdL;
    }
}
