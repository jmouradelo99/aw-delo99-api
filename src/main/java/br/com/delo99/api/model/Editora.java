package br.com.delo99.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Editora {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ideditora;
	private String nome;
	private String fone;
	private String email;
	
	
	public Integer getIdeditora() {
		return ideditora;
	}
	public void setIdeditora(Integer ideditora) {
		this.ideditora = ideditora;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
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
		result = prime * result + ((ideditora == null) ? 0 : ideditora.hashCode());
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
		Editora other = (Editora) obj;
		if (ideditora == null) {
			if (other.ideditora != null)
				return false;
		} else if (!ideditora.equals(other.ideditora))
			return false;
		return true;
	}
	
	
	
	
}
