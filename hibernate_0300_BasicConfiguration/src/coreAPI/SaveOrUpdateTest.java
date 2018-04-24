package coreAPI;

import javax.imageio.spi.ServiceRegistry;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

public class SaveOrUpdateTest {
	static SessionFactory sessionFactory;
	static{
		
		sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();	
	}
    public void testSaveOrUpdate(){
    	
    	Session session = sessionFactory.getCurrentSession();
    	TeacherD t = new TeacherD();
    	t.setName("SaveOrUpdate");
    	session.beginTransaction();
    	session.saveOrUpdate(t);
    	session.getTransaction().commit();			
    }
	public static void main(String[] args) {
		SaveOrUpdateTest up = new SaveOrUpdateTest();
		try{
			up.testSaveOrUpdate();
			
			
		} catch (Exception e){
			System.out.println(e.getMessage());
		} finally {
			sessionFactory.close();
		}
		
	}
	
	
}
