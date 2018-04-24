package coreAPI;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class DeleteTest {
	public static void main(String[] args) {
		TeacherD t = new TeacherD();
//		t.setId(4);
//		t.setName("t1");
//		t.setTitle("middle");
//		t.setBirthDate(new Date());
		
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
//		session.save(t);
		
		//TeacherD t1 = (TeacherD) session.get(TeacherD.class, 3);
		//session.evict(t1);
		session.delete(t);
		session.getTransaction().commit();
		sessionFactory.close();
	}
}
