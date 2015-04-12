package com.milleans.common.dao;

import com.milleans.dao.AbstractDao;
import com.milleans.model.Currency;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by macbookpro on 2015-04-12.
 */
@Repository("currencyDao")
public class CurrencyDaoImpl extends AbstractDao implements ICurrencyDao {
    @Override
    public List<Currency> getAllCurrency() {
        Criteria criteria = this.getCurrentSession().createCriteria(Currency.class);
        return criteria.list();
    }
}
