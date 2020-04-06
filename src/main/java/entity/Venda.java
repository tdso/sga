package entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbvenda")
public class Venda implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable=false)
	private Date dtVenda;
	
	@Column(nullable=false)
	private Integer qtVenda;
	
	@Column(nullable=false)
	private Double vlVenda;

	@ManyToOne(targetEntity = Ativo.class)
	//@JoinColumn(name="ativo_id", nullable=false)
	private Ativo ativo;
	
	@Column(nullable=false)
	private Double precoMedio;
	
	public Venda() {
		
	}

	public Venda(Date dtVenda, Integer qtVenda, Double vlVenda, Ativo codAtivo, Double precoMedio) {
		this.dtVenda = dtVenda;
		this.qtVenda = qtVenda;
		this.vlVenda = vlVenda;
		this.ativo = codAtivo;
		this.precoMedio = precoMedio;
	}

	public Integer getId() {
		return id;
	}
	
	public Date getDtVenda() {
		return dtVenda;
	}

	public void setDtVenda(Date dtVenda) {
		this.dtVenda = dtVenda;
	}

	public Integer getQtVenda() {
		return qtVenda;
	}

	public void setQtVenda(Integer qtVenda) {
		this.qtVenda = qtVenda;
	}

	public Double getVlVenda() {
		return vlVenda;
	}

	public void setVlVenda(Double vlVenda) {
		this.vlVenda = vlVenda;
	}

	public Ativo getCodAtivo() {
		return ativo;
	}

	public void setCodAtivo(Ativo codAtivo) {
		this.ativo = codAtivo;
	}

	public Double getPrecoMedio() {
		return precoMedio;
	}

	public void setPrecoMedio(Double precoMedio) {
		this.precoMedio = precoMedio;
	}

	@Override
	public String toString() {
		return "Venda [dtVenda=" + dtVenda + ", qtVenda=" + qtVenda + ", vlVenda=" + vlVenda + ", codAtivo=" + ativo
				+ ", precoMedio=" + precoMedio + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ativo == null) ? 0 : ativo.hashCode());
		result = prime * result + ((dtVenda == null) ? 0 : dtVenda.hashCode());
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
		Venda other = (Venda) obj;
		if (ativo == null) {
			if (other.ativo != null)
				return false;
		} else if (!ativo.equals(other.ativo))
			return false;
		if (dtVenda == null) {
			if (other.dtVenda != null)
				return false;
		} else if (!dtVenda.equals(other.dtVenda))
			return false;
		return true;
	}
	
	

}
