package br.com.sispes.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {
	public static EntityManagerFactory emf = Persistence
			.createEntityManagerFactory("sispes");
	
	public EntityManager getConnection(){
		return emf.createEntityManager();
	}
}
