package com.mindtree.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mindtree.model.Player;
import com.mindtree.model.Team;

public class MccUtils {
	public static Session createConnection() {
		Configuration configuration = new Configuration()
				.configure()
				.addAnnotatedClass(Team.class)
				.addAnnotatedClass(Player.class);
		
		//SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		SessionFactory sf = configuration.buildSessionFactory(); 
		Session session = sf.openSession(); 
		return session;
	}
}
