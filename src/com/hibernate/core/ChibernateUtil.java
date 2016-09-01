package com.hibernate.core;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ChibernateUtil {
	public static Configuration configuration = null;
	static SessionFactory sessionfactory;

	static {
		configuration = new Configuration();
		configuration = configuration.configure();
		sessionfactory = configuration.buildSessionFactory();
	}

	public static SessionFactory getSessionFctory() {

		return sessionfactory;
	}

}
