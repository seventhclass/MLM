package com.milleans.shipping.dao;

import com.milleans.dao.AbstractDao;
import com.milleans.model.AutoShip;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by LeHu on 7/29/15 2:43 PM.
 */
@Repository("autoShipDao")
@Transactional
public class AutoShipDaoImp extends AbstractDao implements IAutoShipDao {


//    @Override
//    public void save(AutoShip autoShip) {
//        this.save(autoShip);
//    }

    @Override
    public int save(AutoShip autoShip) {
        return (int) this.getCurrentSession().save(autoShip);
    }
}
