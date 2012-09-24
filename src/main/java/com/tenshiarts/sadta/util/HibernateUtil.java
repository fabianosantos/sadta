package com.tenshiarts.sadta.util;

import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {
	
	public static Session getSession() {
		AnnotationConfiguration configuration = new AnnotationConfiguration();
		configuration.configure();
		Session session = configuration.buildSessionFactory().openSession();
		return session;
	}
	
}