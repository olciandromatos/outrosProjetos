package br.com.cmi.syscad.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import br.com.cmi.syscad.modelo.Pessoa;
import br.com.cmi.syscad.util.HibernateUtil;

public class PessoaDao {
	private Session sessao;
	
	// Adicionar
	public void adicionar(Pessoa pessoa){
		sessao = HibernateUtil.getSessionFactory().openSession();
		
		try {
			sessao.beginTransaction();
			sessao.save(pessoa);
			sessao.getTransaction().commit();
			
		} finally{
			sessao.close();
		}
	}
	
	// Alterar
	public void alterar(Pessoa pessoa) {
		sessao = HibernateUtil.getSessionFactory().openSession();
		
		try {
			sessao = HibernateUtil.getSessionFactory().openSession();
			sessao.beginTransaction();
			sessao.saveOrUpdate(pessoa);
			sessao.getTransaction();
			
		} finally {
			sessao.close();
		}
	}
	
	//Remover
	public void remover(Pessoa pessoa){
		sessao = HibernateUtil.getSessionFactory().openSession();
		
		try {
			sessao = HibernateUtil.getSessionFactory().openSession();
			sessao.beginTransaction();
			sessao.delete(pessoa);
			sessao.getTransaction();
			
		} finally {
			sessao.close();
		}
	}
	
	//Listar
	
	@SuppressWarnings("rawtypes")
	public List listar(){
		sessao = HibernateUtil.getSessionFactory().openSession();
		
		try {
			Criteria cri = sessao.createCriteria(Pessoa.class);
			return cri.list();
			
		} finally {
			sessao.close();
		}
	}

}
