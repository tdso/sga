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
@Table(name="tbprovento")

public class Provento implements Serializable {

	private static final long serialVersionUID = 1L;

	public enum TipoProvento {
		JCP,
		Dividendo,
		Aluguel
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne(targetEntity = Ativo.class)
	//@JoinColumn(name="codigoAtivo", nullable=false)
	private Ativo ativo;

	@Column(name="dataProvento", nullable=false)
	private Date dtProvento;
	
	@Column(name="valorProvento", nullable=false)
	private Double valorProvento;
	
	@Column(name="qtBase", nullable=false)
	private Integer qtBase;
	
	public Provento () {
		
	}
	
	public Provento(Ativo codAtivo, Date dtProvento, Double valorProvento, Integer qtBase) {
		this.ativo = codAtivo;
		this.dtProvento = dtProvento;
		this.valorProvento = valorProvento;
		this.qtBase = qtBase;
	}

	public Integer getId() {
		return id;
	}
	
	public Ativo getCodAtivo() {
		return ativo;
	}

	public void setCodAtivo(Ativo codAtivo) {
		this.ativo = codAtivo;
	}

	public Date getDtProvento() {
		return dtProvento;
	}

	public void setDtProvento(Date dtProvento) {
		this.dtProvento = dtProvento;
	}

	public Double getValorProvento() {
		return valorProvento;
	}

	public void setValorProvento(Double valorProvento) {
		this.valorProvento = valorProvento;
	}

	public Integer getQtBase() {
		return qtBase;
	}

	public void setQtBase(Integer qtBase) {
		this.qtBase = qtBase;
	}

	@Override
	public String toString() {
		return "Provento [dtProvento=" + dtProvento + ", valorProvento=" + valorProvento + ", qtBase=" + qtBase + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ativo == null) ? 0 : ativo.hashCode());
		result = prime * result + ((dtProvento == null) ? 0 : dtProvento.hashCode());
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
		Provento other = (Provento) obj;
		if (ativo == null) {
			if (other.ativo != null)
				return false;
		} else if (!ativo.equals(other.ativo))
			return false;
		if (dtProvento == null) {
			if (other.dtProvento != null)
				return false;
		} else if (!dtProvento.equals(other.dtProvento))
			return false;
		return true;
	}
	
	
	
}
