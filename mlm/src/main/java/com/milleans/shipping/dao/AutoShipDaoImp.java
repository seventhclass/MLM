package com.milleans.shipping.dao;

import com.milleans.dao.AbstractDao;
import com.milleans.model.AutoShip;
import com.milleans.shipping.dto.ShipInfo;
import com.milleans.tools.Utils;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by LeHu on 7/29/15 2:43 PM.
 */
@Repository("autoShipDao")
@Transactional
public class AutoShipDaoImp extends AbstractDao implements IAutoShipDao {


    @Override
    public int save(AutoShip autoShip) {
        return (int) this.getCurrentSession().save(autoShip);
    }

    @Override
    public ArrayList<ShipInfo> getShipList(Date date) {

        ArrayList<ShipInfo> listTable = new ArrayList<>();
        try {
            String sql = "SELECT s.date, u.userid, a.isautoship, o.orderIdl, m.name, CONCAT_WS(u.address,u.zip) " +
                    " FROM t_autoship s, t_account a, t_orderdetails o, t_shippingmethod m, t_user u " +
                    " WHERE s.userid = u.id " +
                    " AND s.shipmethodid = m.id " +
                    " AND u.accountid = a.id " +
                    " AND o.autoship_id = s.id " +
                    " AND s.date=" + date +
                    " GROUP BY o.orderIdl";

            Query query = this.getCurrentSession().createSQLQuery(sql);
            List list = query.list();

            for (Object object : list) {
                ShipInfo shipInfo = new ShipInfo();
                Object[] objects = (Object[]) object;

                shipInfo.setAutoShipDate(Utils.DateFormat.parse(objects[0].toString()));
                shipInfo.setUserId(objects[1].toString());
                shipInfo.setOrderIdL(objects[3].toString());

                if (objects[2] != null) {
                    int auto = Integer.valueOf(objects[2].toString());
                    if (auto == 0) {
                        shipInfo.setAutoShip(false);
                    } else {
                        shipInfo.setAutoShip(true);
                    }
                } else {
                    //shipInfo.setAutoShip(false);
                }
                // shipInfo.setAutoShip(objects[2] == 0 ? false : true);
                shipInfo.setShipMethod(objects[4].toString());
                shipInfo.setAddress(objects[5] == null ? null : objects[5].toString());

                listTable.add(shipInfo);
            }
        } catch (ParseException p) {
            p.printStackTrace();
        }

        return listTable;
    }
}
