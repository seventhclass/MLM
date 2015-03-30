package com.milleans.um.services;

import com.milleans.model.User;
import com.milleans.um.dao.IUserDAO;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by macbookpro on 2015-03-07.
 */

@Service("userService")
public class UserServiceImpl implements IUserService {

	static Logger log = Logger.getLogger(UserServiceImpl.class.getName());

	@Autowired
	private IUserDAO userDAO;

	@Override
	@Transactional
	public User signUp(User userInfo) {
		log.info("userService signUp-----------------");
		User user = userDAO.save(userInfo);
		log.info("userService signUp done-----------");
		return user;
	}

	@Transactional
	@Override
	public User login(int userId, String pwd) {
		System.out.println(" service login----");
		return null;
	}
}
