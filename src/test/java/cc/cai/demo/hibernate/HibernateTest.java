package cc.cai.demo.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;

import cc.cai.demo.hibernate.entity.Event;
import cc.cai.demo.hibernate.entity.Person;
import cc.cai.demo.hibernate.entity.one2one.IdCard;
import cc.cai.demo.hibernate.entity.one2one.User;
import cc.cai.demo.hibernate.util.HibernateUtil;

/**
 * Unit test for simple App.
 */
public class HibernateTest {
   
	@Test
	public void hibernateTest(){
		
//		SessionFactory sf=HibernateUtil.getSessionFactory();
//		Session session=sf.getCurrentSession();
//		session.beginTransaction();
//		Event event=(Event)session.get(Event.class, new Long(1));
//		System.out.println("title:"+event.getTitle()+"|date:"+event.getDate());
//		Person p=(Person)session.get(Person.class, new Long(1));
//		p.getEvents().add(event);
//		session.getTransaction().commit();
//		Event event=new Event();
//		event.setDate(new Date());
//		event.setTitle("localhost:8080");
//		session.beginTransaction();
//		session.save(event);
//		session.getTransaction().commit();
		
	}
	@Test
	public void one2oneTest(){
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.getCurrentSession();
		//查询主表信息
		session.beginTransaction();
		IdCard idCard=(IdCard)session.get(IdCard.class, new Long(1));
		System.out.println("idCard:"+idCard.getCardNum());
		System.out.println("name:"+idCard.getUser().getName());
//		

//		User user=(User)session.get(User.class, new Long(1));
//		String hql="from User u where u.userId=:userId";
////		User user=(User)session.createQuery(hql).setParameter("userId", new Long(1)).list().get(0);
//		System.out.println("userName:"+user.getName()+" cardNumber is :"+user.getIdCard().getCardNum());
	}
}
