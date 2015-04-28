package com.milleans.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by macbookpro on 2015-03-13.
 */
@Transactional
public abstract class AbstractDao implements IDao {

    @Autowired
    private SessionFactory sessionFactory;

//	public Object save(Object object) {
//		this.getCurrentSession().save(object);
//		return object;
//	}


    public void save(Object object) {
        this.getCurrentSession().save(object);
    }

    public void remove(Object object) {
        this.getCurrentSession().delete(object);
    }

    public void update(Object object) {
        this.getCurrentSession().saveOrUpdate(object);
    }

    // public List<T> getItemById(String id){
    // Criteria criteria=this.getCurrentSession().createCriteria(T);
    //
    // }

    public Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }
}
