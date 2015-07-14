package com.milleans.um.dto;

import com.milleans.dto.BaseJs;
import com.milleans.model.Order;

import java.util.List;

/**
 * Created by LeHu on 7/14/15 1:23 PM.
 */
public class OrderPendingDTO extends BaseJs {

    private List<Order> item;


    public List<Order> getItem() {
        return item;
    }

    public void setItem(List<Order> item) {
        this.item = item;
    }
}
