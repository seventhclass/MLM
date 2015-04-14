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
        List<Currency> rs=currencyService.getAllCurrency();
        CurrencyJs currencyJs=new CurrencyJs();
        try {
            currencyJs.setSymbol(rs);
            currencyJs.setMessage("success");
            currencyJs.setResult("success");
        } catch (Exception e) {
            currencyJs.setMessage("fail");
            currencyJs.setResult("fail");
        }
        return currencyJs;
    }

    @RequestMapping(value = "/category", method = RequestMethod.POST)
    @ResponseBody
    public CategoryJs getCategory() {
        List<Category> rl = categoryService.getAllCategory();
        CategoryJs categoryJs = new CategoryJs();

        categoryJs.setList(rl);
        categoryJs.setMessage("success");
        categoryJs.setResult("success");
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
                if (categoryService.save(category) == 0) {
                    categoryJs.setMessage("add success!");
                    categoryJs.setResult("success");
                } else {
                    categoryJs.setMessage("add fail!");
                    categoryJs.setResult("fail");
                }
            } else if (model.equals("del")) { //del
                category.setId(Integer.valueOf(id));
                categoryService.remove(category);

                categoryJs.setMessage("remove success!");
                categoryJs.setResult("success");
            } else { // update
                category.setId(Integer.valueOf(id));
                category.setName(name);
                categoryService.update(category);

                categoryJs.setMessage("update success!");
                categoryJs.setResult("success");
            }
        } catch (Exception e) {
            categoryJs.setMessage(e.getMessage());
            categoryJs.setResult("fail");
            e.printStackTrace();
        }

        return categoryJs;
    }

}

