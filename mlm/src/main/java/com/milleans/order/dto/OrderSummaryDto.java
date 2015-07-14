package com.milleans.order.dto;

import com.milleans.dto.BaseJs;

/**
 * Created by LeHu on 7/14/15 3:06 PM.
 */
public class OrderSummaryDto extends BaseJs {

    private String total;

    //private String fee;

    private float tax;


    private String subTotal;


    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }

    public String getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(String subTotal) {
        this.subTotal = subTotal;
    }
}
