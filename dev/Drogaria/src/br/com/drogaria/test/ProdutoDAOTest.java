package br.com.drogaria.test;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;

import br.com.drogaria.dao.ProdutoDAO;
import br.com.drogaria.domain.Fabricante;
import br.com.drogaria.domain.Produto;

public class ProdutoDAOTest {
	
	
	@Test
	@Ignore
	public void salvar() throws SQLException{
		Produto p = new Produto();
		p.setDescricao("apracoo 6 unidades");
		p.setPreco(3.12);
		p.setQuantidade(10l);
		
		
		Fabricante f = new Fabricante();
		f.setCodigo(13l);
		
		p.setFabricante(f);
		
		ProdutoDAO dao = new ProdutoDAO();
		dao.salvar(p);
		
	}
	
	@Test
	@Ignore
	public void listar() throws SQLException{
		ProdutoDAO dao = new ProdutoDAO();
		ArrayList<Produto> lista = dao.listar();
		
		for (Produto produto : lista) {
			System.out.println("Codigo: "+ produto.getCodigo());
			System.out.println("Descricao: " + produto.getDescricao());
			System.out.println("Quantidade: "+ produto.getQuantidade());
			System.out.println("Preco: "+ produto.getPreco());
			System.out.println("Fabricante:  "+produto.getFabricante().getCodigo());
			System.out.println();
		}
	}
	
	@Test
	@Ignore
	public void excluir() throws SQLException{
		Produto p = new Produto();
		p.setCodigo(1l);
		
		ProdutoDAO dao = new ProdutoDAO();
		dao.excluir(p);
	}
	
	@Test
	public void editar() throws SQLException{
		Produto p = new Produto();
		p.setCodigo(4l);
		p.setDescricao("comprimido acarial 10 unidades");
		p.setQuantidade(20l);
		p.setPreco(5.99);
		
		Fabricante f = new Fabricante();
		f.setCodigo(14l);
		
		p.setFabricante(f);
		
		ProdutoDAO dao = new ProdutoDAO();
		dao.editar(p);
	}
}
