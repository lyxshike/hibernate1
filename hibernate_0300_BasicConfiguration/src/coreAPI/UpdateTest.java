package coreAPI;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class UpdateTest {
	static SessionFactory sessionFactory;
	static Session session;
	static{
		sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		session = sessionFactory.getCurrentSession();
	}
	public void dynamicUpdate(){
		TeacherD t = (TeacherD) session.get(TeacherD.class, 4);
		t.setId(234);
	}
	
	public void HQLupdate(){
		//TeacherD t = (TeacherD) session.get(TeacherD.class, 4);
		Query query = session.createQuery("update TeacherD s set s.name = 'z5' where s.id = 4");
	    query.executeUpdate();
	}
	public void update(){
		TeacherD t = new TeacherD();
//		t.setId(4);
	    session.update(t);
	}
	public static void main(String[] args) {
		UpdateTest up = new UpdateTest();
		
		session.beginTransaction();
		up.update();	          
		session.getTransaction().commit();	
		try{
					
		} catch (Exception e){
			System.out.println(e.getMessage());
		} finally {
			sessionFactory.close();
		}
		
	}
	
	
}
