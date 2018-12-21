package br.com.sispes.dao;

import javax.persistence.EntityManager;

import br.com.sispes.model.Pessoa;
import br.com.sispes.util.Conexao;

public class pessoaDAO {
	
	EntityManager em = new Conexao().getConnection();
	
	public void salvar(Pessoa pessoa){
		em.getTransaction().begin();
		em.persist(pessoa);
		em.getTransaction().commit();
		em.close();
	}
	
	public void remove(){
		
	}

}
