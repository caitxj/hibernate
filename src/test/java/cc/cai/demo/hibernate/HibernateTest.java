package cc.cai.demo.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import cc.cai.demo.hibernate.entity.Event;
import cc.cai.demo.hibernate.entity.Person;
import cc.cai.demo.hibernate.util.HibernateUtil;

/**
 * Unit test for simple App.
 */
public class HibernateTest {
   
	@Test
	public void hibernateTest(){
		
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.getCurrentSession();
		session.beginTransaction();
		Event event=(Event)session.get(Event.class, new Long(1));
		System.out.println("title:"+event.getTitle()+"|date:"+event.getDate());
		Person p=(Person)session.get(Person.class, new Long(1));
		p.getEvents().add(event);
		session.getTransaction().commit();
//		Event event=new Event();
//		event.setDate(new Date());
//		event.setTitle("localhost:8080");
//		session.beginTransaction();
//		session.save(event);
//		session.getTransaction().commit();
		
	}
}
