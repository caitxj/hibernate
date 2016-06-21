package cc.cai.demo.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	public static SessionFactory sessionFactory=buildSessionFactory();
			
	private static SessionFactory buildSessionFactory(){
		return new Configuration().configure().buildSessionFactory();
	}
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
}
