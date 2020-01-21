package dao;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.User;

public class LoginDAO {
	
	SessionFactory factory = new Configuration().configure().buildSessionFactory();

	public User vratiUseraLogIn(String userName, String password) {
		
		
		User user = new User();
	
		Query query = factory.getCurrentSession().createQuery("From User where userName :x AND password = :y");
		query.setParameter("x", userName);
		query.setParameter("y", password);
		
		Session sesija = factory.openSession();
	
			List<User> useri = query.getResultList();
			if(useri.isEmpty()) {
				return null;
			}else if (useri.size()==1) {
				return useri.get(0);	
			} else {
				return null; 
			}
			
	}
}


