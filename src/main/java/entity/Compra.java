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
@Table(name="tbcompra")
public class Compra implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(nullable=false)
	private Date dtCompra;
	
	@Column(nullable=false)
	private Integer qtCompra;
	
	@Column(nullable=false)
	private Double vlCompra;
	
	@ManyToOne(targetEntity = Ativo.class)
	//@JoinColumn(name="ativo_id", nullable=false)
	private Ativo ativo;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	public Compra() {
		
	}
		
	public Compra(Date dtCompra, Integer qtCompra, Double vlCompra, Ativo codAtivo) {
		this.dtCompra = dtCompra;
		this.qtCompra = qtCompra;
		this.vlCompra = vlCompra;
		this.ativo = codAtivo;
	}

	public Integer getId() {
		return id;
	}
	
	public Date getDtCompra() {
		return dtCompra;
	}
	public void setDtCompra(Date dtCompra) {
		this.dtCompra = dtCompra;
	}
	public Integer getQtCompra() {
		return qtCompra;
	}
	public void setQtCompra(Integer qtCompra) {
		this.qtCompra = qtCompra;
	}
	public Double getVlCompra() {
		return vlCompra;
	}
	public void setVlCompra(Double vlCompra) {
		this.vlCompra = vlCompra;
	}
	public Ativo getCodAtivo() {
		return ativo;
	}
	public void setCodAtivo(Ativo codAtivo) {
		this.ativo = codAtivo;
	}

	@Override
	public String toString() {
		return "Compra [dtCompra=" + dtCompra + ", qtCompra=" + qtCompra + ", vlCompra=" + vlCompra + ", codAtivo="
				+ ativo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ativo == null) ? 0 : ativo.hashCode());
		result = prime * result + ((dtCompra == null) ? 0 : dtCompra.hashCode());
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
		Compra other = (Compra) obj;
		if (ativo == null) {
			if (other.ativo != null)
				return false;
		} else if (!ativo.equals(other.ativo))
			return false;
		if (dtCompra == null) {
			if (other.dtCompra != null)
				return false;
		} else if (!dtCompra.equals(other.dtCompra))
			return false;
		return true;
	}
	
	

}
