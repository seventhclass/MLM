package com.milleans.common.service;

import com.milleans.common.dao.ICurrencyDao;
import com.milleans.model.Currency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by macbookpro on 2015-04-12.
 */
@Service("currencyService")
@Transactional
public class CurrencyServiceImpl implements ICurrencyService {

    @Autowired
    private ICurrencyDao currencyDao;

    @Override
    @Transactional
    public List<Currency> getAllCurrency() {
        return currencyDao.getAllCurrency();
    }

    @Override
    @Transactional
    public void save(Currency currency) {
        save(currency);
    }

    @Override
    @Transactional
    public void update(Currency currency) {
      currencyDao.update(currency);
    }

    @Override
    @Transactional
    public void remove(Currency currency) {
        currencyDao.remove(currency);
    }
}
