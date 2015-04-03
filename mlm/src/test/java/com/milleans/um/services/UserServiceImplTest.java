package com.milleans.um.services;

import com.milleans.model.User;
import com.milleans.tools.Utils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserServiceImplTest {

    ApplicationContext context;

    @Before
    public void setUp() throws Exception {
        context =
                new ClassPathXmlApplicationContext("file:src/main/webapp/WEB-INF/dispatcher-servlet.xml");

    }


    @Test
    public void testSignUp() throws Exception {
        IUserService userService = (IUserService) context.getBean("userService");

        User user = new User();
        user.setFirstName("Hu");
        user.setUserId(Utils.getUserId());
        user.setLastName("le");
        user.setCity("Montreal");
        user.setRoleId(77);
        user.setUserId("abc111");
        user.setAddress("5004 QueenMary");
        String birthdayStr="2009-02-11";
        SimpleDateFormat sdf = new SimpleDateFormat(Utils.MilleanDateFormate);
        Date convertedCurrentDate = null;
        try {
            convertedCurrentDate = sdf.parse(birthdayStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        user.setBirthDate(convertedCurrentDate);
        user.setCompanyName("7th company");
        user.setCompanyType(1);
        user.setCountryId(86);
        user.setDate(new Date());
        user.setEmail("hu.le.ca@gmail.com");
        user.setFax("5148850513");
        user.setGender("M");
        user.setMobile("4385570123");
        user.setPassWord("111111");
        user.setPhone("5148851234");
        user.setProvince("QC");
        user.setSponsorId("1111");
        user.setStatus(1);
        user.setZip("h3w 1x2");

        userService.signUp(user);
    }

    @Test
    public void testLogin() throws Exception {

        IUserService userService = (IUserService) context.getBean("userService");
        User user =
                userService.getUser("abc111");

        System.out.println("===================");
        System.out.println("user =" + user.getUserId());

        Assert.assertNotNull(user);

    }



}