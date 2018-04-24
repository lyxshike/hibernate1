package coreAPI;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class GetTest {
	static SessionFactory sessionFactory;
	static Session session;
	static{
		sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		session = sessionFactory.getCurrentSession();
	}
	
	public static void main(String[] args) {
		session.beginTransaction();
		TeacherD t = (TeacherD) session.get(TeacherD.class, 4);
	
          
		session.getTransaction().commit();
		System.out.println(t.getClass());
		sessionFactory.close();
	}
}
