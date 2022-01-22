package com.raghava.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration().configure("/hibernate.cfg.xml");

		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		Employee e1 = new Employee();
		//e1.setId(101);
		e1.setName("raghava");
		e1.setSal(110000);
		
		Vehicle vehicle =new Vehicle();
		vehicle.setVehicleName("Avenger");	
		vehicle.setEmp(e1);
		Vehicle vehicle2 =new Vehicle();
		vehicle2.setVehicleName("car");
		vehicle2.setEmp(e1);
		
		session.save(vehicle);
		session.save(vehicle2);
		session.save(e1);
		
		t.commit();
		System.out.println("successfully saved");
		factory.close();
		session.close();
	}

}
