package br.com.cmi.syscad.bean;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;




import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.cmi.syscad.dao.PessoaDao;
import br.com.cmi.syscad.modelo.Pessoa;

@ManagedBean(name="pessoaBean")
@ViewScoped
public class PessoaBean {
	
	Pessoa pessoa = new Pessoa();
	
	List pessoas = new ArrayList<>();
	
	// Construtor
	public PessoaBean() {
		pessoas = new PessoaDao().listar();
		pessoa = new Pessoa();
	}
	
	// metodos dos botoes
	public void inserir(ActionEvent actionEvent){
		new PessoaDao().alterar(pessoa);
		pessoas = new PessoaDao().listar();
		pessoa = new Pessoa();
	}
	
	public void alterar(){
		new PessoaDao().alterar(pessoa);
		pessoas = new PessoaDao().listar();
		pessoa = new Pessoa();
	}
	
	public void excluir(){
		new PessoaDao().remover(pessoa);
		pessoas = new PessoaDao().listar();
		pessoa = new Pessoa();
	}
	

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public List getPessoas() {
		return pessoas;
	}

	public void setPessoas(List pessoas) {
		this.pessoas = pessoas;
	}
	
	

}
