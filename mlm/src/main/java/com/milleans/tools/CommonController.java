package com.milleans.tools;

import com.milleans.service.ICategoryService;
import com.milleans.service.ICurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by macbookpro on 2015-04-12.
 */
@Controller("commonController")
@RequestMapping("/common")
public class CommonController {

    @Autowired
    private ICurrencyService currencyService;

    @Autowired
    private ICategoryService categoryService;

    @RequestMapping(value = "/currency", method = RequestMethod.POST)
    @ResponseBody
    public String getCurrencyList() {
        return currencyService.getAllCurrency().toString();
    }

    @RequestMapping(value = "/category", method = RequestMethod.POST)
    @ResponseBody
    public String getCategory() {
        return categoryService.getAllCategory().toString();
    }


}

