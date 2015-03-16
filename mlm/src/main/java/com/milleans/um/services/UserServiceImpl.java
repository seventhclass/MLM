package com.milleans.um.services;

import javax.websocket.server.ServerEndpoint;

import org.springframework.stereotype.Service;

import com.milleans.model.User;
import com.milleans.um.dao.IUserDAO;

/**
 * Created by macbookpro on 2015-03-07.
 */
@Service("userServices")
public class UserServiceImpl implements IUserService {

	private IUserDAO userDao;

	@Override
	public int signUp(User userInfo) {
		System.out.println(">>>>>>>>>>>>>>");
		return 0;
	}

	@Override
	public User login(int userId, String pwd) {
		return null;
	}
}
