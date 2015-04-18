package com.milleans.product.controller;

import com.milleans.dto.BaseJs;
import com.milleans.model.Product;
import com.milleans.product.dto.ProductListJs;
import com.milleans.product.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
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
            productListJs.setProductInfo(productList);
        } catch (Exception e) {
            e.printStackTrace();
            productListJs.setMessage(e.getMessage());
            productListJs.setResult("fail");
        }

        return productListJs;
    }

    @RequestMapping(value = "/editproduct", method = RequestMethod.POST)
    @ResponseBody
    public BaseJs editProduct(WebRequest webRequest) {

        String model = webRequest.getParameter("model");
        String itemcode = webRequest.getParameter("itemcode");
        String name = webRequest.getParameter("name");
        String categoryid = webRequest.getParameter("categoryid");
        String currencyid = webRequest.getParameter("currencyid");
        String w_price = webRequest.getParameter("w_price");
        String r_price = webRequest.getParameter("r_price");
        String numbers = webRequest.getParameter("numbers");
        String volume = webRequest.getParameter("volume");
        String volume2 = webRequest.getParameter("volume2");
        String description =webRequest.getParameter("description");
        String id = webRequest.getParameter("id");

        BaseJs baseJs = new BaseJs();
        try {
            if (model.equals("add")) {
                Product product = new Product();
                product.setItemCode(itemcode);
                product.setName(name);
                product.setCategoryId(Integer.valueOf(categoryid));
                product.setCurrencyId(Integer.valueOf(currencyid));
                product.setRetailPrice(Float.valueOf(r_price));
                product.setWholesalePrice(Float.valueOf(w_price));
                product.setCapsuleNumber(Integer.valueOf(numbers));
                product.setVolume(Integer.valueOf(volume));
                product.setVolume2(Integer.valueOf(volume2));
                product.setDescription(description);
                product.setDate(new Date());
                productService.save(product);
            } else if (model.equals("del")) {
                Product product = new Product();
                product.setId(Integer.valueOf(id));
                productService.remove(product);
            } else {//upd

                Product product=(Product) productService.getItemById(id);

                product.setItemCode(itemcode);
                product.setName(name);
                product.setCategoryId(Integer.valueOf(categoryid));
                product.setCurrencyId(Integer.valueOf(currencyid));
                product.setRetailPrice(Float.valueOf(r_price));
                product.setWholesalePrice(Float.valueOf(w_price));
                product.setCapsuleNumber(Integer.valueOf(numbers));
                product.setVolume(Integer.valueOf(volume));
                product.setVolume2(Integer.valueOf(volume2));
                product.setDescription(description);

                productService.update(product);
            }
        } catch (Exception e) {
            e.printStackTrace();
            baseJs.setMessage(e.getMessage());
            baseJs.setResult("fail");
        }
        return baseJs;
    }
}
