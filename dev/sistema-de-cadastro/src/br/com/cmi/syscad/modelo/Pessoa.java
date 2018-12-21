package br.com.cmi.syscad.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.org.apache.regexp.internal.recompile;

@Entity
@Table(name="pessoa")
public class Pessoa {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String nome;
	private String endereco;
	private String telefone;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	
	@Override
	public int hashCode() {
		final int prime = 3;
		int result = 1;
		result = prime * result + ((endereco == null) ? 0: endereco.hashCode());
		result = (int) (prime * result + id);
		result = prime * result + ((nome == null) ? 0: nome.hashCode());
		result = prime * result + ((telefone == null)? 0: telefone.hashCode());
		return result;
				
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Pessoa other = (Pessoa) obj;
		if (endereco == null) {
			if (other.endereco != null) {
				return false;
			}
		}
		else if(!endereco.equals(other.endereco)) {
			return false;
		} 
		if (id != other.id) {
			return false;
		}
		if (nome == null) {
			if (other.nome != null) {
				return false;
			}
		}else if(!nome.equals(other.nome)){
			return false;
		}
		if (telefone == null) {
			if (other.telefone != null) {
				return false;
			}
		}else if(!telefone.equals(other.telefone)){
			return false;
		}
		
		return true;
	}

}
