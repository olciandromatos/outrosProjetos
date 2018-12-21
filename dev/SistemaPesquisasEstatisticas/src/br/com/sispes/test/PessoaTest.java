package br.com.sispes.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

import br.com.sispes.dao.PessoaDAO;
import br.com.sispes.model.Pessoa;

public class PessoaTest {
	
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sispes");
		EntityManager em = emf.createEntityManager();
		Pessoa p = new Pessoa();
	
		p.setEstadoCivil("casado");
		p.setIdade("15");
		
		
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		em.close();
	}
	
	@Test
	public void salvar(){
		//EntityManagerFactory emf = Persistence.createEntityManagerFactory("sispes");
		//EntityManager em = emf.createEntityManager();
		
		Pessoa p = new Pessoa();
	
		p.setEstadoCivil("casado");
		p.setIdade("15");
		
		PessoaDAO dao = new PessoaDAO();
		dao.guardar(p);
		//em.getTransaction().begin();
		//em.persist(p);
		//em.getTransaction().commit();
		//em.close();
	}

}
