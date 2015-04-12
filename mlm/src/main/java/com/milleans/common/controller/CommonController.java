package com.milleans.common.controller;

import com.milleans.common.dto.CategoryJs;
import com.milleans.common.service.ICategoryService;
import com.milleans.common.service.ICurrencyService;
import com.milleans.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

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

    @RequestMapping(value = "/editcategory", method = RequestMethod.POST)
    @ResponseBody
    public String updateCategory(WebRequest webRequest) {

        String model = webRequest.getParameter("model");
        String id = webRequest.getParameter("id");
        String name = webRequest.getParameter("name");

        Category category = new Category();

        CategoryJs categoryJs = new CategoryJs();

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

        return categoryJs.toString();
    }

}

