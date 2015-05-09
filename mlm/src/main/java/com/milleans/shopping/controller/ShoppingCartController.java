package com.milleans.shopping.controller;

import com.milleans.dto.BaseJs;
import com.milleans.model.Product;
import com.milleans.model.ShoppingCart;
import com.milleans.product.services.IProductService;
import com.milleans.shopping.dto.CartContent;
import com.milleans.shopping.dto.CartContentJs;
import com.milleans.shopping.dto.UpdateProductJs;
import com.milleans.shopping.services.IShoppingCartService;
import com.milleans.tools.Utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

//    @Autowired
//    private IUserService userService;


    @RequestMapping(value = "/myshoppingcart", method = RequestMethod.GET)
    public ModelAndView myShoppingCart() {
        return new ModelAndView("um/myshoppingcart");
    }


    @RequestMapping(value = "/cart", method = RequestMethod.GET)
    public ModelAndView cart() {
        return new ModelAndView("um/cart");
    }

    @RequestMapping(value = "/shoppingcart", method = RequestMethod.POST)
    @ResponseBody
    public CartContentJs getShoppingCart(HttpSession httpSession) {
        String suid = (String) httpSession.getAttribute("userid").toString();

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
        //String price = webRequest.getParameter("price");
        String quantity = webRequest.getParameter("quantity");

        //String userId = session.getAttribute("userid").toString();
        String sid = session.getAttribute("uid").toString();

        try {
            //ShoppingCart shoppingCart = (ShoppingCart) shoppingCartService.getItemById(sid);
            ShoppingCart shoppingCart = (ShoppingCart) shoppingCartService.getCart(Integer.valueOf(productId), sid);
            if (shoppingCart == null) {
            	shoppingCart = new ShoppingCart();
            	shoppingCart.setProductId(Integer.valueOf(productId));
            	shoppingCart.setQuantity(Integer.valueOf(quantity));
            	shoppingCart.setDate(new Date());
            	shoppingCart.setUserId(Integer.valueOf(sid));
                shoppingCartService.save(shoppingCart);
            } else {
                int amount = shoppingCart.getQuantity();
                amount = amount + Integer.valueOf(quantity);
                shoppingCart.setQuantity(amount);
                shoppingCartService.saveOrUpdate(shoppingCart);
            }

        } catch (Exception e) {
            e.printStackTrace();
            baseJs = Utils.getFailMessage(e.getMessage());
        }
        return baseJs;
    }

    @RequestMapping(value = "/delcartitem", method = RequestMethod.POST)
    @ResponseBody
    public BaseJs delItemInCart(@RequestParam("id") String pid, HttpSession httpSession) {

        BaseJs baseJs = new BaseJs();
        //String userId = httpSession.getAttribute("uid").toString();

        try {
            ShoppingCart tmp = new ShoppingCart();
            tmp.setId(Integer.valueOf(pid));
            //ShoppingCart shoppingCart = shoppingCartService.getItemById(pid);
            shoppingCartService.remove(tmp);
        } catch (Exception e) {
            e.printStackTrace();
            baseJs = Utils.getFailMessage(e.getMessage());
        }
        return baseJs;
    }

    @RequestMapping(value = "/updateshoppingcart", method = RequestMethod.POST)
    @ResponseBody
    public UpdateProductJs updateShoppingCart(@RequestParam("cartId") String cartId,
                                              @RequestParam("quantity") String quantity,
                                              @RequestParam("productId") String pid) {
        UpdateProductJs updateProductJs=new UpdateProductJs();

        try {
            ShoppingCart shoppingCart = (ShoppingCart) shoppingCartService.getItemById(cartId);
            shoppingCart.setQuantity(Integer.valueOf(quantity));
            shoppingCartService.update(shoppingCart);

            updateProductJs.setId(shoppingCart.getId());
            updateProductJs.setQuantity(shoppingCart.getQuantity());

            //search product price in p table
            Product product = (Product) productService.getItemById(pid);

            updateProductJs.setPrice(product.getWholesalePrice());

        } catch (Exception e) {
            e.printStackTrace();
            Utils.getFailMessage(e.getMessage());
        }

        return updateProductJs;

    }
}

