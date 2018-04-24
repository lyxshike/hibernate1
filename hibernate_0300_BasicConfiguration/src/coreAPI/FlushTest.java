package coreAPI;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class FlushTest {
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
		t.setName("12343");
		   //默认commit之后， 就会出问题。。。。
		//session.getTransaction().commit();
		t.setName("23234");
		
		
		
		session.getTransaction().commit();
	}
	
	
}
