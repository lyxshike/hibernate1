package one2many_uni;

import java.util.HashSet;
import java.util.Set;

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
	
		User1 user1 = new User1();
		user1.setName("user1");
		
		Set<User1> set = new HashSet<User1>();
		set.add(user1);
		Group1 group1 = new Group1();
		group1.setName("group1");
		group1.setUser(set);
		
		session.save(group1);
		
		
		
	
		session.getTransaction().commit();
	}
	
	
}
