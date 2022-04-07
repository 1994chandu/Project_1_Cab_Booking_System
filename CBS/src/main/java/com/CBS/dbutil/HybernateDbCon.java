package com.CBS.dbutil;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HybernateDbCon {
	
	public static SessionFactory getSessionFactory() {
	SessionFactory sessionFactory =new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	
	
	return sessionFactory;
	}

}




