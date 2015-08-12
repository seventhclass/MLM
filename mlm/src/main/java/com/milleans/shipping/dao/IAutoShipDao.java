package com.milleans.shipping.dao;

import com.milleans.dao.IDao;
import com.milleans.model.AutoShip;
import com.milleans.shipping.dto.ShipInfo;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by LeHu on 7/29/15 2:40 PM.
 */
public interface IAutoShipDao extends IDao {

    int save(AutoShip autoShip);

    ArrayList<ShipInfo> getShipList(Date date);

    AutoShip getItem(int id);

}
