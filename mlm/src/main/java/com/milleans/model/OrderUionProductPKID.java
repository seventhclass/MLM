package com.milleans.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by LeHu on 7/10/15 4:18 PM.
 */
@Embeddable
public class OrderUionProductPKID implements Serializable {

    @Column(name = "t_order_id", nullable = false)
    private int orderId;

    @Column(name = "t_product_id", nullable = false)
    private int productId;

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


}
