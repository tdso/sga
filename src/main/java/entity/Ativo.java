package entity;

import java.io.Serializable;
import java.io.ObjectInputFilter.Status;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbAtivo")
public class Ativo implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="codigoAtivo", nullable=false, length=6)
	private String codigoAtivo;
	
	@Column(name="qtAtivo", nullable=false)
	private Integer qtAtivo;
	
	@Column(name="precoMedioAtivo", nullable=false)
	private Double precoMedio;
	
	@Enumerated
	@Column(name="status", nullable=true)
	private StatusAtivo status;
	
	public Ativo() {
		
	}
	
	public Ativo (String ativo, Integer qtde, Double precomedio) {
		this.codigoAtivo = ativo;
		this.qtAtivo = qtde;
		this.precoMedio = precomedio;
		this.status = StatusAtivo.Ativo;
	}
	
	public String getCodigoAtivo() {
		return codigoAtivo;
	}
	public void setCodigoAtivo(String codigoAtivo) {
		this.codigoAtivo = codigoAtivo;
	}
	public Integer getQtAtivo() {
		return qtAtivo;
	}
	public void setQtAtivo(Integer qtAtivo) {
		this.qtAtivo = qtAtivo;
	}
	public Double getPrecoMedio() {
		return precoMedio;
	}
	public void setPrecoMedio(Double precoMedio) {
		this.precoMedio = precoMedio;
	}

	@Override
	public String toString() {
		return "Ativo [codigoAtivo=" + codigoAtivo + ", qtAtivo=" + qtAtivo + ", precoMedio=" + precoMedio + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoAtivo == null) ? 0 : codigoAtivo.hashCode());
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
		Ativo other = (Ativo) obj;
		if (codigoAtivo == null) {
			if (other.codigoAtivo != null)
				return false;
		} else if (!codigoAtivo.equals(other.codigoAtivo))
			return false;
		return true;
	}
	
	

}
