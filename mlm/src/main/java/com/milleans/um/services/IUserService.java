package com.milleans.um.services;

import com.milleans.model.User;

/**
 * Created by macbookpro on 2015-03-07.
 */
public interface IUserService {

    public User signUp(User userInfo);

    public User getUser(String userId);

}
