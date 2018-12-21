package br.com.sispes.conexao;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class ConexaoJDBC {
	private static final String USUARIO = "root"; // usuario banco postgres heroku = erpsbchkmqqknn
	private static final String SENHA = "root"; // senha banco postgres heroku = QeEB7D_02WPQkvfcAGM4Jw4F48
	private static final String URL = "jdbc:mysql://localhost:3306/sispes"; // heroku = jdbc:postgresql://localhost:5432/sispes
	
	public static Connection fazerConexao()throws SQLException{
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		Connection conexao = (Connection) DriverManager.getConnection(URL, USUARIO, SENHA);
		return conexao;
	}
}
