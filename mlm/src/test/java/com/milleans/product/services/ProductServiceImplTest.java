package com.milleans.product.services;

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
        List list=productService.getProduct();
        System.out.println(list.size());
    }

    @Test
    public void testGetProductByCart() throws Exception {

       List list= productService.getProductByCart("1430599049710");
        System.out.println(list.size());
    }

    @Test
    public void testUpdate() throws Exception {

    }

    @Test
    public void testGetProduct() throws Exception {

        List list = productService.getProductByCart("1430073874041");
        System.out.println(list);
    }

}