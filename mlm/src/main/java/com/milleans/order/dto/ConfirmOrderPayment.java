package com.milleans.order.dto;

import com.milleans.dto.BaseJs;

import java.util.ArrayList;

/**
 * Created by LeHu on 7/29/15 4:13 PM.
 */
public class ConfirmOrderPayment extends BaseJs {

    private ArrayList<OrderDealingInfo> orderList;

    public ArrayList<OrderDealingInfo> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<OrderDealingInfo> orderList) {
        this.orderList = orderList;
    }
}
