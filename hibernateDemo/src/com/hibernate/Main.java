package com.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml").addAnnotatedClass(Person.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
		session.beginTransaction();
		//from Person p where age='34' or age='35'
		//from Person p where p.firstname LIKE '%l%'
		
		// Bu bölüm sql databseden dataları çekmek için yazılmıştır.
		
//		List<Person> persons = session.createQuery("from Person p ORDER BY p.firstname").getResultList();
//		
//		for (Person person : persons) {
//			System.out.println(person.getFirstname());
//		}
		// // Bu bölüm sql database  data eklemek, silmek, update etmek için yazılmıştır.
		
		// INSERT		
		/*
		 * Person person = new Person();
		 * person.setFirstname("Servet"); person.setLastname("KARTAL");
		 * person.setAge(33); person.setEmp_id(5);
		 * 
		 * session.save(person);
		 */
		
		// UPDATE
		/*
		 * Person person = session.get(Person.class,1); person.setAge(5);
		 * 
		 * session.save(person);
		 */
		
		// DELETE 
		/*
		 * Person person = session.get(Person.class,1); session.delete(person);
		 * 
		 * session.getTransaction().commit();
		 */
		System.out.println("Kişi silindi");
			
		}finally {
			
			factory.close();
		}

	}

}
