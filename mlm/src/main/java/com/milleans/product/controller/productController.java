package com.milleans.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by macbookpro on 2015-04-10.
 */
@Controller("productController")
public class productController {



    @RequestMapping(value = "/products")
    public ModelAndView products() {
        return new ModelAndView("um/products");
    }

    @RequestMapping(value = "/productmaintenance")
    public ModelAndView productMaintenance() {
        return new ModelAndView("um/productmaintenance");
    }

    @RequestMapping(value = "/productList", method = RequestMethod.POST)
    public String productList() {

        return null;
    }
}
