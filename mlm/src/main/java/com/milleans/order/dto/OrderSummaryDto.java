package com.milleans.order.dto;

import com.milleans.dto.BaseJs;

/**
 * Created by LeHu on 7/14/15 3:06 PM.
 */
public class OrderSummaryDto extends BaseJs {

    // private String total;

    // private String shipFee;

    private String tax;

    private String taxRate;

    private String subTotal;

    public String getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(String taxRate) {
        this.taxRate = taxRate;
    }


    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(String subTotal) {
        this.subTotal = subTotal;
    }
}
