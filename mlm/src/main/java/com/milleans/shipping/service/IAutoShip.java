package com.milleans.shipping.service;

import com.milleans.model.AutoShip;
import com.milleans.service.ICrud;

/**
 * Created by LeHu on 7/29/15 2:37 PM.
 */
public interface IAutoShip extends ICrud {

    int save(AutoShip autoShip);


}
