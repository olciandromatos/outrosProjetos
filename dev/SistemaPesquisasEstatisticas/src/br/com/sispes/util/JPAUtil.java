package br.com.sispes.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static EntityManagerFactory gerenciamentoDaFabricaDeEntidade = 
			Persistence.createEntityManagerFactory("sispes");
	
	public EntityManager getEntityManager(){
		return gerenciamentoDaFabricaDeEntidade.createEntityManager();
	}
}
