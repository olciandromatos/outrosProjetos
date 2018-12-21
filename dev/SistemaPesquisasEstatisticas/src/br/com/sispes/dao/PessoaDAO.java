package br.com.sispes.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.sispes.conexao.ConexaoJDBC;
import br.com.sispes.conexao.FazerConexao;
import br.com.sispes.model.Pessoa;

import com.mysql.jdbc.Connection;

public class PessoaDAO {
	
	public void salvar(Pessoa p) throws SQLException{
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO pessoa ");
		sql.append("(sexo) ");
		sql.append("VALUES (?)");
		
		Connection conexao = ConexaoJDBC.fazerConexao();
		
		PreparedStatement comando = conexao.prepareStatement(sql.toString());
		comando.setObject(1, p.getSexo());
		comando.executeUpdate();
		comando.close();
		
	}
	
	public void guardar(Pessoa pessoa){
		Session sessao = FazerConexao.getSessionFactory().openSession();
		Transaction transacao = null;
		
		try{
		transacao = sessao.beginTransaction();
		sessao.save(pessoa);
		transacao.commit();
		}catch(RuntimeException e){
			if(transacao != null){
				transacao.rollback();
			}
		}finally{
			sessao.close();
		}
	}

}
