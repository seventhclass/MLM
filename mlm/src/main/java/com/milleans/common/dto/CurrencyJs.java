package com.milleans.common.dto;

import com.milleans.dto.BaseJs;
import com.milleans.model.Currency;

import java.util.List;

/**
 * Created by LeHu on 2015-04-13.
 */
public class CurrencyJs extends BaseJs {

    private List<Currency> currencyList;

    public List<Currency> getCurrencyList() {
        return currencyList;
    }

    public void setCurrencyList(List<Currency> currencyList) {
        this.currencyList = currencyList;
    }
}
