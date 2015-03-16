package com.milleans.um.dao;

import com.milleans.dao.AbstractDao;
import com.milleans.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by macbookpro on 2015-03-07.
 */

@Repository("userDao")
public class UserDAOImpl extends AbstractDao implements IUserDAO {
    @Override
    public int update(User userInfo) {
        return 0;
    }

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public List<User> getAllUser() {
        return null;
    }

    @Override
    public User getUser(int userId) {
        return null;
    }

}

