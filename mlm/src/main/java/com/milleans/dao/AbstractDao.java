package com.milleans.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by macbookpro on 2015-03-13.
 */
public abstract class AbstractDao {

	@Autowired
	protected SessionFactory sessionFactory;

}
