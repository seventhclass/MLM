package com.milleans.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

/**
 * Created by macbookpro on 2015-03-13.
 */
public abstract class AbstractDao {

	@Autowired
	protected SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	protected void persist(Objects entity) {
		this.getSession().persist(entity);
	}

	protected void delete(Object entity) {
		this.getSession().delete(entity);
	}

}
