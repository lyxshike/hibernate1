package compositeKey;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class TeacherTest {
	public static void main(String[] args) {
		TeacherP t = new TeacherP();

		TeacherPK pk = new TeacherPK();
		pk.setId(213);
		pk.setName("shike");
		t.setPk(pk);
		
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(t);
		session.getTransaction().commit();
	}
}
