package com.milleans.shopping.controller;

import com.milleans.dto.BaseJs;
import com.milleans.model.ShoppingCart;
import com.milleans.product.services.IProductService;
import com.milleans.shopping.dto.CartContent;
import com.milleans.shopping.dto.CartContentJs;
import com.milleans.shopping.services.IShoppingCartService;
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
import java.util.List;

/**
 * Created by LeHu on 2015-04-20 10:42 PM.
 */
@Controller("shoppingCartController")
public class ShoppingCartController {

    @Autowired
    private IShoppingCartService shoppingCartService;

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

    @RequestMapping(value = "/shoppingcart",method = RequestMethod.POST)
    public CartContentJs getShoppingCart(HttpSession httpSession) {
        String suid = (String) httpSession.getAttribute("userid");

        CartContentJs cartContentJs = new CartContentJs();
        try {
            List<CartContent> rs = productService.getProductByCart(suid);
            cartContentJs.setCartContentList(rs);
        } catch (Exception e) {
            e.printStackTrace();
            Utils.getFailMessage(e.getMessage());
        }

        return cartContentJs;
    }


    @RequestMapping(value = "/add2cart", method = RequestMethod.POST)
    @ResponseBody
    public BaseJs add2cart(WebRequest webRequest, HttpSession session) {

        BaseJs baseJs = new BaseJs();

        String productId = webRequest.getParameter("productid");
        String price = webRequest.getParameter("price");
        String quantity = webRequest.getParameter("quantity");

        String userId = session.getAttribute("userid").toString();

        try {
            ShoppingCart shoppingCart = (ShoppingCart) shoppingCartService.getItemById(userId);

            if (shoppingCart == null) {
                int _uis = userService.getUser(userId).getId();
                shoppingCart = new ShoppingCart();
                shoppingCart.setUserid(_uis);

                shoppingCart.setProductId(Integer.valueOf(productId));
                shoppingCart.setDate(new Date());
                shoppingCart.setQuantity(Integer.valueOf(quantity));
                shoppingCart.setTransactionPrice(Float.valueOf(price));

            } else {


            }

            shoppingCartService.saveOrUpdate(shoppingCart);

        } catch (Exception e) {
            e.printStackTrace();
            baseJs = Utils.getFailMessage(e.getMessage());
        }
        return baseJs;
    }
}
