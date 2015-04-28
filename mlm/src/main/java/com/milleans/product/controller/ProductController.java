package com.milleans.product.controller;

import com.milleans.dto.BaseJs;
import com.milleans.model.Album;
import com.milleans.model.Product;
import com.milleans.product.dto.ImageJs;
import com.milleans.product.dto.ImageListJs;
import com.milleans.product.dto.ProductTable;
import com.milleans.product.dto.ProductTableJs;
import com.milleans.product.services.IProductService;
import com.milleans.product.services.IalbumService;
import com.milleans.tools.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * Created by macbookpro on 2015-04-10.
 */
@Controller("productController")
public class ProductController {

    @Autowired
    private IProductService productService;

    @Autowired
    private IalbumService albumService;

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
    public ProductTableJs productList() {

        ProductTableJs productTableJs = new ProductTableJs();
        try {
            List<ProductTable> productTableList = productService.getProduct();
            productTableJs.setProductInfo(productTableList);
        } catch (Exception e) {

            productTableJs.setMessage(e.getMessage());
            productTableJs.setResult("fail");
        }

        return productTableJs;
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
        String description = webRequest.getParameter("description");
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
            } else {// upd

                Product product = (Product) productService.getItemById(id);

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

    @RequestMapping(value = "/delProductImages", method = RequestMethod.POST)
    @ResponseBody
    public ImageJs editImage(@RequestParam String[] productimage) {

        ImageJs imageJs = new ImageJs();

        try {
            for (String imgId : productimage) {
                Album album = new Album();
                album.setId(Integer.valueOf(imgId));
                albumService.remove(album);
            }

        } catch (NumberFormatException | NullPointerException e) {
            e.printStackTrace();
            imageJs.setMessage(e.getMessage());
            imageJs.setResult("fail");
        }
        return imageJs;
    }

    @RequestMapping(value = "/uploadImageFile", method = RequestMethod.POST)
    public void uploadTest(@RequestParam("productId") String productId,
                           @RequestParam("uploadFile") MultipartFile uploadFile,
                           HttpSession httpSession, HttpServletResponse httpServletResponse) {
        try {
            String fileName = uploadFile.getOriginalFilename();
            String fileType = fileName.substring(fileName.lastIndexOf("."),
                    fileName.length());

            String realFileName = System.currentTimeMillis() + fileType;

            String uploadDir = httpSession.getServletContext().getRealPath(
                    File.separator)
                    + Constant.AlbumPath + "/";
            if (!new File(uploadDir).exists()) {
                File dir = new File(uploadDir);
                dir.mkdirs();
            }
            if (!uploadFile.isEmpty()) {

                byte[] bytes = uploadFile.getBytes();
                // File destination = new File("/" + productId + "/" + new
                // Date().getTime() + ".jpg");
                File destination = new File(uploadDir + realFileName);
                if (!destination.exists()) {
                    destination.createNewFile();
                }
                BufferedOutputStream stream = new BufferedOutputStream(
                        new FileOutputStream(destination));
                stream.write(bytes);
                stream.close();
            }
            Album album = new Album();
            album.setProductId(Integer.valueOf(productId));
            album.setImageName(realFileName);
            albumService.save(album);
        } catch (Exception e) {
            e.printStackTrace();
            // baseJs.setMessage(e.getMessage());
            // baseJs.setResult("fail");
            try {
                httpServletResponse.getOutputStream().print(
                        "<script>parent.callback('Failed')</script>");
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        }

        try {
            httpServletResponse.getOutputStream().print(
                    "<script>parent.callback('Success')</script>");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    @RequestMapping(value = "uploadTest", method = RequestMethod.POST)
    @ResponseBody
    public BaseJs uploadTest(@RequestParam("productId") String productId, @RequestParam("uploadFile") MultipartFile uploadFile, HttpSession
            httpSession) {

        String fileName = uploadFile.getOriginalFilename();
        String fileType = fileName.substring(fileName.lastIndexOf("."),
                fileName.length());

        String realFileName = System.currentTimeMillis() + fileType;

        return new BaseJs();
    }


	/*
     * @RequestMapping(value = "/uploadImageFile", method = RequestMethod.POST)
	 * 
	 * @ResponseBody public BaseJs uploadImageFile(@RequestParam("productId")
	 * String productId,
	 * 
	 * @RequestParam("uploadFile") MultipartFile uploadFile, HttpSession
	 * httpSession) { BaseJs baseJs = new BaseJs();
	 * 
	 * try { String fileName = uploadFile.getOriginalFilename(); String fileType
	 * = fileName.substring(fileName.lastIndexOf("."), fileName.length());
	 * 
	 * String realFileName = System.currentTimeMillis() + fileType;
	 * 
	 * String uploadDir =
	 * httpSession.getServletContext().getRealPath(File.separator) +
	 * Constant.AlbumPath + "/"; if (!new File(uploadDir).exists()) { File dir =
	 * new File(uploadDir); dir.mkdirs(); } if (!uploadFile.isEmpty()) {
	 * 
	 * byte[] bytes = uploadFile.getBytes(); // File destination = new File("/"
	 * + productId + "/" + new Date().getTime() + ".jpg"); File destination =
	 * new File(uploadDir + realFileName); if (!destination.exists()) {
	 * destination.createNewFile(); } BufferedOutputStream stream = new
	 * BufferedOutputStream(new FileOutputStream(destination));
	 * stream.write(bytes); stream.close(); } Album album = new Album();
	 * album.setProductId(Integer.valueOf(productId));
	 * album.setImageName(realFileName); albumService.save(album); } catch
	 * (Exception e) { e.printStackTrace(); baseJs.setMessage(e.getMessage());
	 * baseJs.setResult("fail"); } return baseJs; }
	 */

    @RequestMapping(value = "/productImages", method = RequestMethod.POST)
    @ResponseBody
    public ImageListJs getImageList(@RequestParam String productId) {

        ImageListJs imageListJs = new ImageListJs();

        try {
            imageListJs.setAlbumInfo(albumService
                    .getAlbumByProductId(productId));
        } catch (Exception e) {
            e.printStackTrace();
            imageListJs.setMessage(e.getMessage());
            imageListJs.setResult("fail");
        }
        return imageListJs;
    }

}
