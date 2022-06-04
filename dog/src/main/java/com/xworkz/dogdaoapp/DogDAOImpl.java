package com.xworkz.dogdaoapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.dogapp.Dog;

public class DogDAOImpl implements DogDAO {

	@Override
	public void saveDogDao() {
		// TODO Auto-generated method stub
Configuration configuration = new Configuration();
        
		configuration.configure("Connection.cfg.xml");
		
		configuration.addAnnotatedClass(Dog.class);
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		Session session = sessionFactory.openSession(); 
		
	//	Dog dog1  = new Dog(1,"charlie","Male","Lab","Black",56.32);
		
		Transaction transaction = session.beginTransaction(); 
		        
	//	session.save(dog);
		transaction.commit();
		session.close();
		sessionFactory.close();
		
	}
       @Override
	public void getDogById(int dogID) {
		// TODO Auto-generated method stub
		
Configuration configuration = new Configuration();
	    
		configuration.configure("Connection.cfg.xml");
		
		configuration.addAnnotatedClass(Dog.class);
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
	//	Dog dog  = new Dog(1,"charlie","Male","Lab","Black",56.32);
		
		Transaction transaction = session.beginTransaction(); 
		    
		Dog dog = session.get(Dog.class, 1);
		System.out.println("the entity is " + dog.getBreed());
		
		transaction.commit();
		session.close();
		sessionFactory.close();
		
		
	}

}
