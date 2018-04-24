package compositeKey;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestStudent {
	private static SessionFactory sessionFactory;
    @BeforeClass 
	public static void init(){
	 sessionFactory = new Configuration().configure().buildSessionFactory();
	}
    
    @AfterClass
    public static void destroy(){
    	sessionFactory.close();
    }
    
    @Test
    public void test(){
    	Session session = sessionFactory.getCurrentSession();
    	Transaction tran = session.beginTransaction();
    	StudentPK stuPK = new StudentPK();
    	stuPK.setId(123);
    	stuPK.setName("alvin");
    	Student stu = new Student();
    	stu.setPk(stuPK);
    	session.save(stu);
    	tran.commit();
    	
    }
}
