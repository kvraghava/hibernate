package com.raghava.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Configuration configuration = new Configuration().configure("/hibernate.cfg.xml");
        //Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  

		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		Employee e1 = new Employee();
		e1.setId(102);
		e1.setName("suresh");
		e1.setSal(110000);
		session.save(e1);
		t.commit();
		System.out.println("successfully saved");
		factory.close();
		session.close();
	}

}
