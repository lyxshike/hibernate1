package one2one_uni_pk;

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
		WifeUP wifeUP = new WifeUP();
		
		wifeUP.setName("wife");
		
		HusbandUP husbandUP = new HusbandUP();
		husbandUP.setId(1);
		husbandUP.setName("husband");
		husbandUP.setWifeUP(wifeUP);
		session.save(husbandUP);
		
		
		
	
		session.getTransaction().commit();
	}
	
	
}
