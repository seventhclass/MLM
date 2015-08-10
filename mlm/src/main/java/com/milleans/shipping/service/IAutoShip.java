package com.milleans.shipping.service;

import com.milleans.model.AutoShip;
import com.milleans.service.ICrud;
import com.milleans.shipping.dto.ShipInfo;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by LeHu on 7/29/15 2:37 PM.
 */
public interface IAutoShip extends ICrud {

    int save(AutoShip autoShip);

    ArrayList<ShipInfo> getShipList(Date date);

//    ArrayList<String> getAutoShipOrderIdLs(Date date);



}
