package com.milleans.shopping.controller;

import com.milleans.dto.BaseJs;
import com.milleans.model.ShoppingCart;
import com.milleans.product.services.IProductService;
import com.milleans.shopping.dto.CartContentJs;
import com.milleans.shopping.services.IShoppingCart;
import com.milleans.tools.Utils;
import com.milleans.um.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * Created by LeHu on 2015-04-20 10:42 PM.
 */
@Controller("shoppingCartController")
public class ShoppingCartController {

    @Autowired
    private IShoppingCart shoppingCartService;

    @Autowired
    private IProductService productService;

    @Autowired
    private IUserService userService;


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
    public BaseJs add2cart(WebRequest webRequest, HttpSession session) {

        BaseJs baseJs = new BaseJs();

        String productId = webRequest.getParameter("productid");
        String price = webRequest.getParameter("price");
        String quantity = webRequest.getParameter("quantity");

        String userId=session.getAttribute("userid").toString();

        String uid = session.getAttribute("userid").toString();

        try {
            ShoppingCart shoppingCart = (ShoppingCart) shoppingCartService.getItemById(uid);
            if (shoppingCart == null) {
                int _uis = userService.getUser(userId).getId();
                shoppingCart = new ShoppingCart();
                shoppingCart.setUserid(_uis);
            }

            shoppingCart.setProductId(Integer.valueOf(productId));
            shoppingCart.setDate(new Date());
            shoppingCart.setQuantity(Integer.valueOf(quantity));
            shoppingCart.setTransactionPrice(Float.valueOf(price));

            


        } catch (Exception e) {
            baseJs = Utils.getFailMessage(e.getMessage());
        }
        return baseJs;
    }
}
