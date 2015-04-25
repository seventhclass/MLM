package com.milleans.product.services;

import com.milleans.model.Product;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ProductServiceImplTest {
    ApplicationContext context;
    IProductService productService;

    @Before
    public void setUp() throws Exception {
        context =
                new ClassPathXmlApplicationContext("file:src/main/webapp/WEB-INF/dispatcher-servlet.xml");
        productService = (IProductService) context.getBean("productService");
    }

    @Test
    public void testGetAllProduct() throws Exception {
        List<Product> lp = productService.getAllProduct();

        Product product = lp.get(0);

        System.out.println(product.getCategoryId());
    }

    @Test
    public void testGetProductByCart() throws Exception {

        productService.getProductByCart("");

    }

    @Test
    public void testUpdate() throws Exception {

    }

    @Test
    public void testGetProduct() throws Exception {

        List list=productService.getProduct();

    }
}