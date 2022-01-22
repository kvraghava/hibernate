package com.raghava.hibernate;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.cache.jcache.JCacheRegionFactory;
import org.ehcache.jsr107.EhcacheCachingProvider;

public class HibernateUtil {
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
				Configuration configuration = new Configuration();
				Properties settings = new Properties();
				settings.put(Environment.DRIVER, "oracle.jdbc.driver.OracleDriver");
				settings.put(Environment.URL, "jdbc:oracle:thin:@localhost:1521:xe");
				settings.put(Environment.USER, "kvraghava");
				settings.put(Environment.PASS, "raghava");
				settings.put(Environment.DIALECT, "org.hibernate.dialect.Oracle9Dialect");

				settings.put(Environment.SHOW_SQL, "true");
				// settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "true");
				settings.put(Environment.USE_SECOND_LEVEL_CACHE, "true");
				settings.put(Environment.USE_QUERY_CACHE, "true");
				// Specify cache region factory class
				settings.put(Environment.CACHE_REGION_FACTORY, JCacheRegionFactory.class);
				// Specify cache provider
				settings.put("hibernate.javax.cache.provider", EhcacheCachingProvider.class);
				

				settings.put(Environment.HBM2DDL_AUTO, "update");

				configuration.setProperties(settings);
				configuration.addAnnotatedClass(Employee.class);

				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
						.applySettings(configuration.getProperties()).build();

				sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return sessionFactory;
	}
}
