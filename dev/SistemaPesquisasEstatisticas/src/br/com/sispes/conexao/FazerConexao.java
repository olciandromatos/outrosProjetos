package br.com.sispes.conexao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class FazerConexao {
	
public static SessionFactory FabricaDeSessões = CriarFabricaDeSeSsão();
	
	public static SessionFactory getSessionFactory() {
		return FabricaDeSessões;
	}

	public static SessionFactory CriarFabricaDeSeSsão() {

		try {

			Configuration configuracao = new Configuration().configure();
			

			ServiceRegistry Registro = new StandardServiceRegistryBuilder()
					.applySettings(configuracao.getProperties()).build();

			SessionFactory FabricaLocal = configuracao
					.buildSessionFactory(Registro);

			return FabricaLocal;

		} catch (Throwable ex) {

			System.out.println("falha ao criar a fabrica de sessão " + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
}
