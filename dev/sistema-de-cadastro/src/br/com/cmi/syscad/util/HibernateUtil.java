package br.com.cmi.syscad.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	public static final SessionFactory sessao = buildSession();
	
	private static SessionFactory buildSession(){
		
		try {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			
			return cfg.buildSessionFactory();
		} catch (Throwable e) {
			System.out.println("Não deu \n" + e);
			throw new ExceptionInInitializerError();
		}
	}
	
	public static SessionFactory getSessionFactory(){
		return sessao;
	}

}
