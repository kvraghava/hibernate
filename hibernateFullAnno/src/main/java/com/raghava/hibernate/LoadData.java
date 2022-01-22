package com.raghava.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class LoadData {

	public static void main(String[] args) {
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Employee emp = session.get(Employee.class, 101);
		System.out.println("employee details=");
		System.out.println("emp id="+emp.getId());
		System.out.println("emp name="+emp.getName());
		System.out.println("emp sal="+emp.getSal());
		
		Employee emp1 = session.load(Employee.class, 103);
		System.out.println("employee details=");
		System.out.println("emp id="+emp1.getId());
		System.out.println("emp name="+emp1.getName());
		System.out.println("emp sal="+emp1.getSal());
		session.close();
		factory.close();
	}

}
