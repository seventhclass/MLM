package com.milleans.um.dto;

import com.milleans.dto.BaseJs;

import java.util.*;

/**
 * Created by LeHu on 7/13/15 2:35 PM.
 */
public class AddressList extends BaseJs {

    private List<AddressDTO> shippingAddress;


    public List<AddressDTO> getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(List<AddressDTO> shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
}
