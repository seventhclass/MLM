package com.milleans.um.dao;

import java.util.List;

import com.milleans.model.User;

import java.util.List;

/**
 * Created by macbookpro on 2015-03-07.
 */
public interface IUserDAO {


    public int update(User userInfo);

    public User save(User user);

    public List<User> getAllUser();

    public User getUser(int userId);


}