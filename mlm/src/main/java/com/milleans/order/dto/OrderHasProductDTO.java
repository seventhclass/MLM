package com.milleans.order.dto;

/**
 * Created by LeHu on 7/14/15 6:24 PM.
 */
public class OrderHasProductDTO {


    private int orderId;


    private int productId;


    private int quantity;


    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
