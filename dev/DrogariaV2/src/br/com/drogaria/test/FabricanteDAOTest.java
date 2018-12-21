package br.com.drogaria.test;

import org.junit.Test;

import br.com.drogaria.dao.FabricanteDAO;
import br.com.drogaria.domain.Fabricante;

public class FabricanteDAOTest {
	
	@Test
	public void salvar(Fabricante fabricante){
		Fabricante f1 = new Fabricante();
		f1.setDescricao("Dexcricao");
		
		Fabricante f2 = new Fabricante();
		f2.setDescricao("descricao");
		
		FabricanteDAO dao = new FabricanteDAO();
		dao.salvar(f1);
		dao.salvar(f2);
	}
	

}
