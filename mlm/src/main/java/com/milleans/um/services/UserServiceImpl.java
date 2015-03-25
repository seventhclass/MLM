package com.milleans.um.services;


import com.milleans.model.User;
import com.milleans.um.dao.IUserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by macbookpro on 2015-03-07.
 */

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDAO userDAO;

    @Override
    @Transactional
    public int signUp(User userInfo) {
        System.out.println("user service ---------");
        return 0;
    }

    @Transactional
    @Override
    public User login(int userId, String pwd) {
        System.out.println(" service login----");
        return null;
    }
}
