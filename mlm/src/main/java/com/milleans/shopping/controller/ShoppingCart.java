package com.milleans.shopping.controller;

import com.milleans.dto.BaseJs;
import com.milleans.product.services.IProductService;
import com.milleans.shopping.dto.CartContentJs;
import com.milleans.shopping.services.IShoppingCart;
import com.milleans.tools.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * Created by LeHu on 2015-04-20 10:42 PM.
 */
@Controller("shoppingCartController")
public class ShoppingCart {

    @Autowired
    private IShoppingCart shoppingCartService;

    @Autowired
    private IProductService productService;


    @RequestMapping(value = "/myshoppingcart", method = RequestMethod.GET)
    public ModelAndView myShoppingCart() {
        return new ModelAndView("um/myshoppingcart");
    }


    @RequestMapping(value = "/cart", method = RequestMethod.GET)
    public ModelAndView cart() {
        return new ModelAndView("um/cart");
    }

    @RequestMapping(value = "/shoppingcart")
    public CartContentJs getShoppingCart(HttpSession httpSession) {
        String uid = (String) httpSession.getAttribute("userid");




        return null;
    }


    @RequestMapping(value = "/add2cart", method = RequestMethod.POST)
    @ResponseBody
    public BaseJs add2cart(WebRequest webRequest) {

        BaseJs baseJs = new BaseJs();

        String productId= webRequest.getParameter("productid");
        String price = webRequest.getParameter("price");
        String quantity = webRequest.getParameter("quantity");

        try {


            System.out.println("ssss");
        } catch (Exception e) {
            baseJs = Utils.getFailMessage(e.getMessage());
        }
        return baseJs;
    }
}
