package com.raghava.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class LoadData {

	public static void main(String[] args) {

		/*
		 * Configuration configuration = new
		 * Configuration().configure("/hibernate.cfg.xml");
		 * 
		 * SessionFactory factory = configuration.buildSessionFactory();
		 */
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		// Employee emp = session.get(Employee.class, 101);
		Query query = session.createQuery("from Employee emp where emp.id = :id");
		query.setInteger("id", Integer.valueOf(101));
		List<Employee> emps = query.list();
		Employee emp = emps.get(0);
		System.out.println("employee details=");
		System.out.println("emp id=" + emp.getId());
		System.out.println("emp name=" + emp.getName());
		System.out.println("emp sal=" + emp.getSal());
		session.close();
		
		Session session2 = factory.openSession();
		Query query2 = session2.createQuery("from Employee emp where emp.id = :id");
		query2.setInteger("id", Integer.valueOf(101));
		List<Employee> emps1 = query2.list();
		Employee emp1 = emps1.get(0);
		System.out.println("employee details=");
		System.out.println("emp id=" + emp1.getId());
		System.out.println("emp name=" + emp1.getName());
		System.out.println("emp sal=" + emp1.getSal());

		factory.close();
		session.close();
	}

}
