package br.com.delo99.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Autor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idautor;
	private String nome;
	private String email;
	
	public Integer getIdautor() {
		return idautor;
	}
	public void setIdautor(Integer idautor) {
		this.idautor = idautor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idautor == null) ? 0 : idautor.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autor other = (Autor) obj;
		if (idautor == null) {
			if (other.idautor != null)
				return false;
		} else if (!idautor.equals(other.idautor))
			return false;
		return true;
	}
	
	
	
}
