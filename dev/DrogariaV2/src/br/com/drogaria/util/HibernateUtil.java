package br.com.drogaria.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

	public static final SessionFactory sessionFactory = buildSessionFactory();

	public static SessionFactory buildSessionFactory() {

		try {

			Configuration configuracao = new Configuration();
			configuracao.configure();

			ServiceRegistry servicoDeRegistro = new StandardServiceRegistryBuilder()
					.applySettings(configuracao.getProperties()).build();

			SessionFactory sessionFactory = configuracao
					.buildSessionFactory(servicoDeRegistro);

			return sessionFactory;

		} catch (Throwable ex) {

			System.out.println("falha ao criar o sessionFactory " + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
