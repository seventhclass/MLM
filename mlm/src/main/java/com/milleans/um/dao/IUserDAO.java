package com.milleans.um.dao;

import java.util.List;

import com.milleans.model.User;

/**
 * Created by macbookpro on 2015-03-07.
 */
public interface IUserDAO {

	public int save(User userInfo);

	public User getUser(int userId, String pwd);

	// public List<User> getUserList();
	//
	// public User getSponsor(int userId);
	//
	// public int update(User user);

}
