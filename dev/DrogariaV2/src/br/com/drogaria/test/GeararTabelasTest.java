package br.com.drogaria.test;

import org.junit.Test;

import br.com.drogaria.util.HibernateUtil;

public class GeararTabelasTest {
	
	@Test
	public void gerar(){
		HibernateUtil.getSessionFactory();
		HibernateUtil.getSessionFactory().close();
	}

}
