package com.milleans.common.dto;

/**
 * Created by LeHu on 5/1/15 12:33 AM.
 */
public class CartSummary {

    private long totalQuantily;

    private Double totalAmount;

    public long getTotalQuantily() {
        return totalQuantily;
    }

    public void setTotalQuantily(long totalQuantily) {
        this.totalQuantily = totalQuantily;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
