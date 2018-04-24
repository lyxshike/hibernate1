package one2one_bi_pk;

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
		WifeBP wifeBP = new WifeBP();
		wifeBP.setName("wife");
		
		HusbandBP husbandUP = new HusbandBP();
		husbandUP.setId(1);
		husbandUP.setName("husband");
		husbandUP.setWifeBP(wifeBP);
		session.save(husbandUP);
		
		
		
	
		session.getTransaction().commit();
	}
	
	
}
