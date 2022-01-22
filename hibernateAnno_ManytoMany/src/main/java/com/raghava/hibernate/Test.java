package com.raghava.hibernate;

import java.util.ArrayList;

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
		// e1.setId(101);
		e1.setName("raghava");
		e1.setSal(110000);

		Employee e2 = new Employee();
		// e1.setId(101);
		e2.setName("suresh");
		e2.setSal(100000);

		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("Avenger");

		ArrayList<Employee> emps = new ArrayList<>();
		emps.add(e1);
		emps.add(e2);
		vehicle.setEmps(emps);

		Vehicle vehicle2 = new Vehicle();
		vehicle2.setVehicleName("car");
		vehicle2.setEmps(emps);

		ArrayList<Vehicle> vehicles = new ArrayList<>();
		vehicles.add(vehicle);
		vehicles.add(vehicle2);

		e1.setVehicle(vehicles);
		e2.setVehicle(vehicles);

		session.save(vehicle);
		session.save(vehicle2);
		session.save(e1);
		session.save(e2);
		t.commit();
		System.out.println("successfully saved");
		factory.close();
		session.close();
	}

}
