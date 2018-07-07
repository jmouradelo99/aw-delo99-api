package br.com.delo99.api.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Livro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idlivro;
	private String titulo;
	private BigDecimal preco;
	private Integer estoque;
	private Integer idgenero;
	private Integer ideditora;
	
	
	public Integer getIdlivro() {
		return idlivro;
	}
	public void setIdlivro(Integer idlivro) {
		this.idlivro = idlivro;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public Integer getEstoque() {
		return estoque;
	}
	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}
	public Integer getIdgenero() {
		return idgenero;
	}
	public void setIdgenero(Integer idgenero) {
		this.idgenero = idgenero;
	}
	public Integer getIdeditora() {
		return ideditora;
	}
	public void setIdeditora(Integer ideditora) {
		this.ideditora = ideditora;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idlivro == null) ? 0 : idlivro.hashCode());
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
		Livro other = (Livro) obj;
		if (idlivro == null) {
			if (other.idlivro != null)
				return false;
		} else if (!idlivro.equals(other.idlivro))
			return false;
		return true;
	}
	
	
}
