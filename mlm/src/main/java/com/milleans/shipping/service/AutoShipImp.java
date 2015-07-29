package com.milleans.shipping.service;

import com.milleans.dao.AbstractDao;
import com.milleans.model.AutoShip;
import com.milleans.shipping.dao.IAutoShipDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by LeHu on 7/29/15 2:39 PM.
 */
@Service("autoShipService")
@Transactional
public class AutoShipImp extends AbstractDao implements IAutoShip {

    @Autowired
    private IAutoShipDao autoShipDao;

    @Override
    public int save(AutoShip autoShip) {
        return autoShipDao.save(autoShip);
    }

    @Override
    public void save(Object object) {

    }

    @Override
    public void remove(Object object) {

    }

    @Override
    public void update(Object object) {

    }

    @Override
    public Object getItemById(String id) {
        return null;
    }
}
