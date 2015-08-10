package com.milleans.shipping.dto;

import com.milleans.dto.BaseJs;

import java.util.ArrayList;

/**
 * Created by LeHu on 8/9/15 2:58 PM.
 */
public class ShipInfoJs extends BaseJs{

    ArrayList<ShipInfo> shipInfos;


    public ArrayList<ShipInfo> getShipInfos() {
        return shipInfos;
    }

    public void setShipInfos(ArrayList<ShipInfo> shipInfos) {
        this.shipInfos = shipInfos;
    }
}
