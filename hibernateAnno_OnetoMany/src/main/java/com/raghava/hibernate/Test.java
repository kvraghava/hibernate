package com.raghava.hibernate;

import java.util.ArrayList;
import java.util.List;

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
		
		Vehicle vehicle =new Vehicle();
		vehicle.setVehicleName("Avenger");		
		session.save(vehicle);
		Vehicle vehicle2 =new Vehicle();
		vehicle2.setVehicleName("car");
		session.save(vehicle2);
		
		List<Vehicle> vehicles = new ArrayList<>();
		vehicles.add(vehicle);
		vehicles.add(vehicle2);
		
		Employee e1 = new Employee();
		//e1.setId(101);
		e1.setName("raghava");
		e1.setSal(110000);
		e1.setVehicle(vehicles);		
		session.save(e1);
		
		t.commit();
		System.out.println("successfully saved");
		factory.close();
		session.close();
	}

}
