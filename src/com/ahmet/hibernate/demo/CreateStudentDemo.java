package com.ahmet.hibernate.demo;

import java.text.ParseException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ahmet.hibernate.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) throws ParseException {
		
		// create session factory
		SessionFactory factory=new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		// create session
		Session session=factory.getCurrentSession();
		
		try {
		
            
            // create a student object
			
			// start a transaction
			session.beginTransaction();
			// save the student object
		
			// commit transaction
			session.getTransaction().commit();
			
		}
		finally {
			factory.close();
		}

	}

}
