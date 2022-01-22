package com.raghava.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LoadData {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration().configure("/hibernate.cfg.xml");
		
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Employee emp = session.get(Employee.class, 101);
		System.out.println("employee details=");
		System.out.println("emp id="+emp.getId());
		System.out.println("emp name="+emp.getName());
		System.out.println("emp sal="+emp.getSal());
		session.close();
		System.out.println("emp Address size="+emp.getAdds().size());
	}

}
