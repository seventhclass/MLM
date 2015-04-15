package com.milleans.common.controller;

import com.milleans.common.dto.CategoryJs;
import com.milleans.common.dto.CurrencyJs;
import com.milleans.common.service.ICategoryService;
import com.milleans.common.service.ICurrencyService;
import com.milleans.model.Category;
import com.milleans.model.Currency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

import java.util.List;

/**
 * Created by LeHu on 2015-04-12.
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
    public CurrencyJs getCurrencyList() {
        List<Currency> rs = currencyService.getAllCurrency();
        CurrencyJs currencyJs = new CurrencyJs();
        try {
            currencyJs.setSymbol(rs);
        } catch (Exception e) {
            currencyJs.setMessage("fail");
            currencyJs.setResult("fail");
        }
        return currencyJs;
    }

    @RequestMapping(value = "/editcurrency", method = RequestMethod.POST)
    @ResponseBody
    public CurrencyJs editCurrency(WebRequest webRequest) {

        String model = webRequest.getParameter("model");
        String id = webRequest.getParameter("id");
        String name = webRequest.getParameter("name");
        String abbr = webRequest.getParameter("abbr");

        Currency currency = new Currency();

        CurrencyJs currencyJs = new CurrencyJs();

        try {
            if (model.equals("add")) { // save
                currency.setSymbol(abbr);
                currency.setName(name);
                currencyService.save(currency);
            } else if (model.equals("del")) { // del
                currency.setId(Integer.valueOf(id));
                currencyService.remove(currency);
            } else { // update
                currency.setId(Integer.valueOf(id));
                currency.setName(name);
                currency.setSymbol(abbr);
                currencyService.update(currency);
            }
        } catch (Exception e) {
            currencyJs.setMessage(e.getMessage());
            currencyJs.setResult("fail");
            e.printStackTrace();
        }
        return currencyJs;
    }

    @RequestMapping(value = "/category", method = RequestMethod.POST)
    @ResponseBody
    public CategoryJs getCategory() {
        CategoryJs categoryJs = new CategoryJs();
        try {
            List<Category> rl = categoryService.getAllCategory();
            categoryJs.setList(rl);
        } catch (Exception e) {
            categoryJs.setMessage(e.getMessage());
            categoryJs.setResult("fail");
        }
        return categoryJs;
    }

    @RequestMapping(value = "/editcategory", method = RequestMethod.POST)
    @ResponseBody
    public CategoryJs updateCategory(WebRequest webRequest) {

        String model = webRequest.getParameter("model");
        String id = webRequest.getParameter("id");
        String name = webRequest.getParameter("name");

        Category category = new Category();
        CategoryJs categoryJs = new CategoryJs();
        try {
            if (model.equals("add")) { // save
                category.setName(name);
                categoryService.save(category);
            } else if (model.equals("del")) { // del
                category.setId(Integer.valueOf(id));
                categoryService.remove(category);
            } else { // update
                category.setId(Integer.valueOf(id));
                category.setName(name);
                categoryService.update(category);
            }
        } catch (Exception e) {
            categoryJs.setMessage(e.getMessage());
            categoryJs.setResult("fail");
            e.printStackTrace();
        }

        return categoryJs;
    }

}
