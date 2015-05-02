package com.milleans;

import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by LeHu on 5/2/15 11:32 AM.
 */
public class AbsTest {


   protected ApplicationContext context;
//    IProd÷uctService productService;

    @Before
    public void setUp() throws Exception {
        context =
                new ClassPathXmlApplicationContext("file:src/main/webapp/WEB-INF/dispatcher-servlet.xml");
        //productService = (IProductService) context.getBean("productService");
    }

}
