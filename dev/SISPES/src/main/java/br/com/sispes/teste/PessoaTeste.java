package br.com.sispes.teste;

import org.junit.Test;

import br.com.sispes.dao.pessoaDAO;
import br.com.sispes.model.Pessoa;

public class PessoaTeste {
	
	@Test
	public void salvar() {
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setIdade("26");
		pessoa.setSexo("masculino");
		
		pessoaDAO dao = new pessoaDAO();
		dao.salvar(pessoa);
	}
}
