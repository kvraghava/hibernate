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

		Vehical vehical = new Vehical();
		vehical.setId(100);
		vehical.setName("car");
		
		TwoWheeler two = new TwoWheeler();
		two.setId(101);
		two.setName("duke");
		two.setSteeringHandle("handle");
		
		FourWheeler four = new FourWheeler();
		four.setId(102);
		four.setName("land rover");
		four.setSteeringWheel("wheel");
		
		session.save(vehical);
		session.save(two);
		session.save(four);
		
		t.commit();
		System.out.println("successfully saved");
		factory.close();
		session.close();
	}

}
