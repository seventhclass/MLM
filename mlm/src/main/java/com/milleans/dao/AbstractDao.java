package com.milleans.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by macbookpro on 2015-03-13.
 */
public abstract class AbstractDao {

	@Autowired
	private SessionFactory sessionFactory;

	public Object save(Object object) {
		this.getCurrentSession().save(object);
		return object;
	}

	public void delete(Object object) {
		this.getCurrentSession().delete(object);
	}

	public void update(Object object) {
		this.getCurrentSession().update(object);
	}

	// public List<T> getItemById(String id){
	// Criteria criteria=this.getCurrentSession().createCriteria(T);
	//
	// }

	public Session getCurrentSession() {
		return this.sessionFactory.getCurrentSession();
	}
}
