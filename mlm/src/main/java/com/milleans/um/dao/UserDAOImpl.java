package com.milleans.um.dao;

import com.milleans.dao.AbstractDao;
import com.milleans.model.User;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by macbookpro on 2015-03-07.
 */

@Repository("userDao")
@Transactional
public class UserDAOImpl extends AbstractDao implements IUserDAO {

	@Override
	public int update(User userInfo) {
		return 0;
	}

	@Override
	public User save(User user) {
		Session session = this.getCurrentSession();
		// Transaction tx = session.beginTransaction();
		session.save(user);
		// tx.commit();
		// session.close();
		return user;
	}

	@Override
	public List<User> getAllUser() {
		return null;
	}

	@Override
	public User getUser(int userId) {

		User user = (User) this.getCurrentSession().get(User.class, userId);

		return user;
	}

}
