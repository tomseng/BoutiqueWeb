package dao;

import javax.security.auth.login.Configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import tables.User;

public class UserDAO {

	public void addUserToDB(String username,String password,String email){
	try{
		org.hibernate.cfg.Configuration config = new org.hibernate.cfg.Configuration().configure();
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		//transaction
		Transaction trsc = session.beginTransaction();
		User user = new User();
		user.setEmail(email);
		user.setPassword(password);
		user.setUsername(username);
		trsc.commit();
		System.out.println("ajout en db OK");
	}
	catch (Exception e) {
		e.getMessage();
		System.out.println("err");
	}
	
	}
}
