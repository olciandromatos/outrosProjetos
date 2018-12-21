package br.com.sispes.conexao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class FazerConexao {
	
public static SessionFactory FabricaDeSess�es = CriarFabricaDeSeSs�o();
	
	public static SessionFactory getSessionFactory() {
		return FabricaDeSess�es;
	}

	public static SessionFactory CriarFabricaDeSeSs�o() {

		try {

			Configuration configuracao = new Configuration().configure();
			

			ServiceRegistry Registro = new StandardServiceRegistryBuilder()
					.applySettings(configuracao.getProperties()).build();

			SessionFactory FabricaLocal = configuracao
					.buildSessionFactory(Registro);

			return FabricaLocal;

		} catch (Throwable ex) {

			System.out.println("falha ao criar a fabrica de sess�o " + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
}
