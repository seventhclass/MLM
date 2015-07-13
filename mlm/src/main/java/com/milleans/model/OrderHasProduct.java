package com.milleans.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by LeHu on 7/9/15 8:58 PM.
 */
@Entity
@Table(name = "t_order_has_t_product")
public class OrderHasProduct {

    @EmbeddedId
    private OrderUionProductPKID orderUionProductPKID;

    @Column(name = "quantity")
    private int quantity;

    public OrderUionProductPKID getOrderUionProductPKID() {
        return orderUionProductPKID;
    }

    public void setOrderUionProductPKID(OrderUionProductPKID orderUionProductPKID) {
        this.orderUionProductPKID = orderUionProductPKID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
