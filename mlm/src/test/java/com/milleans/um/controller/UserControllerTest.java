package com.milleans.um.controller;

import com.milleans.um.dto.JsonResponseDto;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserControllerTest {


    ApplicationContext context;

    @Before
    public void setUp() throws Exception {
        context =
                new ClassPathXmlApplicationContext("file:src/main/webapp/WEB-INF/dispatcher-servlet.xml");

    }

    @Test
    public void testGetEmail() throws Exception {

        UserController userController = (UserController) context.getBean("userController");

        JsonResponseDto re = userController.getEmail("hu.le@gmail.com");

        System.out.println(re);
    }

    @Test
    public void testGetSponsorId() throws Exception {

        UserController userController = (UserController) context.getBean("userController");

        JsonResponseDto re = userController.getSponsorId("123451234");

        System.out.println(re);
    }
}