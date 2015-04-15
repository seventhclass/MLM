package com.milleans.common.service;

import com.milleans.model.Currency;
import com.milleans.service.ICrud;

import java.util.List;

/**
 * Created by macbookpro on 2015-04-12.
 */
public interface ICurrencyService extends ICrud {
    public List<Currency> getAllCurrency();

//    public void save(Currency currency);
//
//    void update(Currency currency);
//
//    void remove(Currency currency);
}
