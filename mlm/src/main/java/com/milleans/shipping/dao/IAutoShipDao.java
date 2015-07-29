package com.milleans.shipping.dao;

import com.milleans.dao.IDao;
import com.milleans.model.AutoShip;

/**
 * Created by LeHu on 7/29/15 2:40 PM.
 */
public interface IAutoShipDao extends IDao {

    // void save(AutoShip autoShip);

    int save(AutoShip autoShip);
}
