package com.milleans.um.services;

import com.milleans.model.User;

/**
 * Created by macbookpro on 2015-03-07.
 */
public interface IUserService {

    public int signUp(User userInfo);

    public User login(int userId, String pwd);
}
