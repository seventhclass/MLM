package com.milleans.um.dao;

import com.milleans.dao.AbstractDao;
import com.milleans.model.User;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
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
        //Transaction tx = session.beginTransaction();
        session.save(user);
        //tx.commit();
        //session.close();
        return user;
    }

    @Override
    public List<User> getAllUser() {
        return null;
    }

    @Override
    public User getUser(String userId) {

        Criteria criteria = this.getCurrentSession().createCriteria(User.class);
        criteria.add(Restrictions.eq("userId", userId));

        List<User> list = criteria.list();

        if (list == null || list.size() == 0) {
            return null;
        } else
            return list.get(0);
    }

    @Override
    public String getEmail(String email) {

        Criteria criteria = this.getCurrentSession().createCriteria(User.class);
        criteria.add(Restrictions.eq("email", email));
        List<User> list = criteria.list();

        if (list == null || list.size() == 0) {
            return null;
        } else {
            User tmp = (User) list.get(0);
            return tmp.getEmail();
        }
    }

    @Override
    public String getSponsorId(String sponsorId) {

        Criteria criteria = this.getCurrentSession().createCriteria(User.class);
        criteria.add(Restrictions.eq("sponsorid", sponsorId));

        List<User> list = criteria.list();

        if (list == null || list.size() == 0) {
            return null;
        } else {
            User tmp = (User) list.get(0);
            return tmp.getSponsorId();
        }


    }

    @Override
    public String getRefenerceId(String userId) {
        return null;
    }


}
