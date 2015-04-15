package com.milleans.common.dao;

import com.milleans.dao.IDao;
import com.milleans.model.Currency;

import java.util.List;

/**
 * Created by macbookpro on 2015-04-12.
 */
public interface ICurrencyDao extends IDao {

    public List<Currency> getAllCurrency();

//    void update(Currency currency);
//
//    void remove(Currency currency);
//
//    void save(Currency currency);
}
