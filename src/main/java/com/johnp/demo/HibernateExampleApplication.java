package com.johnp.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateExampleApplication.class, args);
		
		Alien a = new Alien(1,"John","123");
		
		Configuration config = new Configuration();
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(a);
		
		session.close();
		
	}

}
