package com.milleans.um.services;

import com.milleans.model.User;
import com.milleans.um.dao.IUserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by macbookpro on 2015-03-07.
 */

@Transactional
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDAO userDAO;

    @Override
    @Transactional
    public User signUp(User userInfo) {
        System.out.println("user service ---------");
        User user=userDAO.save(userInfo);

        return user;
    }

    @Override
    @Transactional
    public User getUser(String userId) {
        System.out.println(" service login----");
        User user =
                userDAO.getUser(userId);
        return user;
    }

    @Override
    @Transactional
    public String checkEmail(String email){
        String _email=null;
        _email=userDAO.getEmail(email);

        return _email;
    }

    @Override
    public String getSponorId(String userId) {

        return userDAO.getSponsorId(userId);
    }


}
