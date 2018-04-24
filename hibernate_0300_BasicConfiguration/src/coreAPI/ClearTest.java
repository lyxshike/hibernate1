package coreAPI;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ClearTest {
    static	SessionFactory sessionFactory ;
	
	@BeforeClass
	public static void init(){
		sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
	}
	@AfterClass
	public static void destroy(){
	    sessionFactory.close(); 	
	}
	@Test
	public void testClear(){
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		TeacherD t = (TeacherD) session.load(TeacherD.class, 4);
		System.out.println(t.getName());
		session.clear();
		
		TeacherD t2 = (TeacherD) session.load(TeacherD.class, 4);
		System.out.println(t2.getName());
		session.getTransaction().commit();
	}
	
	
}
