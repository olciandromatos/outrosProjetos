package br.com.sispes.bean;

import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.sispes.dao.PessoaDAO;
import br.com.sispes.model.Pessoa;

@ManagedBean(name="MBPessoa")
@ViewScoped
public class PessoaMBean {
	private Pessoa pessoa;

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public void prepararNovo(){
		pessoa = new Pessoa();
	}
	
	public void novo(Pessoa pessoa){
		
		
		try {
			PessoaDAO dao = new PessoaDAO();
			dao.salvar(pessoa);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void salvar(Pessoa pessoa){
		
	}
}
