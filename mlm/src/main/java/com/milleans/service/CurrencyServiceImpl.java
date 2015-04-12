package com.milleans.service;

import com.milleans.dao.ICurrencyDao;
import com.milleans.model.Currency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by macbookpro on 2015-04-12.
 */
@Service("currencyService")
public class CurrencyServiceImpl implements ICurrencyService {

    @Autowired
    private ICurrencyDao currencyDao;

    @Override
    public List<Currency> getAllCurrency() {
        return currencyDao.getAllCurrency();
    }
}
