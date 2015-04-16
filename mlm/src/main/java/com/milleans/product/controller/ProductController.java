package com.milleans.product.controller;

import com.milleans.model.Product;
import com.milleans.product.dto.ProductListJs;
import com.milleans.product.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by macbookpro on 2015-04-10.
 */
@Controller("productController")
public class ProductController {

    @Autowired
    private IProductService productService;


    @RequestMapping(value = "/products")
    public ModelAndView products() {
        return new ModelAndView("um/products");
    }

    @RequestMapping(value = "/productmaintenance")
    public ModelAndView productMaintenance() {
        return new ModelAndView("um/productmaintenance");
    }

    @RequestMapping(value = "/productList", method = RequestMethod.POST)
    @ResponseBody
    public ProductListJs productList() {

        ProductListJs productListJs = new ProductListJs();
        try {
            List<Product> productList =
                    productService.getAllProduct();
        } catch (Exception e) {
           productListJs.setMessage(e.getMessage());
            productListJs.setResult("fail");
        }

        return productListJs;
    }

    @RequestMapping(value = "/addProduct", method = RequestMethod.POST)
    public ModelAndView addProduct() {


        return this.productMaintenance();
    }
}
