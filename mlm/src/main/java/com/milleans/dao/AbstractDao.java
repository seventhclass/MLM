package com.milleans.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class AbstractDao {

	private SessionFactory sessionFactory;

	protected Session getSessionFactory() {
		return sessionFactory.getCurrentSession();
	}

	public void persist(Object entity) {
		this.getSessionFactory().persist(entity);
	}

	public void delete(Object entity) {
		this.getSessionFactory().delete(entity);
	}

}
