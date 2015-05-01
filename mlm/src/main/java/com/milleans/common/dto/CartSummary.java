package com.milleans.common.dto;

/**
 * Created by LeHu on 5/1/15 12:33 AM.
 */
public class CartSummary {

    private int totalQuantily;

    private int totalAmount;

    public int getTotalQuantily() {
        return totalQuantily;
    }

    public void setTotalQuantily(int totalQuantily) {
        this.totalQuantily = totalQuantily;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }
}
