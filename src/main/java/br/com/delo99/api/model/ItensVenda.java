package br.com.delo99.api.model;

import java.math.BigDecimal;

import javax.persistence.Entity;

@Entity
public class ItensVenda {

	private Integer idvenda;
	private Integer idlivro;
	private Integer qtd;
	private BigDecimal subtotal;
	
	
	public Integer getIdvenda() {
		return idvenda;
	}
	public void setIdvenda(Integer idvenda) {
		this.idvenda = idvenda;
	}
	public Integer getIdlivro() {
		return idlivro;
	}
	public void setIdlivro(Integer idlivro) {
		this.idlivro = idlivro;
	}
	public Integer getQtd() {
		return qtd;
	}
	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}
	public BigDecimal getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idvenda == null) ? 0 : idvenda.hashCode());
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
		ItensVenda other = (ItensVenda) obj;
		if (idvenda == null) {
			if (other.idvenda != null)
				return false;
		} else if (!idvenda.equals(other.idvenda))
			return false;
		return true;
	}
	
	
	
}
