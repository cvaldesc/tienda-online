package model.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Privilegios
 *
 */
@Entity
@Table (name="privilegios")

public class Privilegios implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id 
	@Basic (optional = false)
	@Column (name ="idPrivilegios")
	private Integer idPrivilegios;
	
	@Column (name ="nombrePrivilegios")
	private String nombrePrivilegios;
	
	@Column (name ="detallePrivilegios")
	private String detallePrivilegios;
	
	public Privilegios() {
		super();
	}

	public Integer getIdPrivilegios() {
		return idPrivilegios;
	}

	public void setIdPrivilegios(Integer idPrivilegios) {
		this.idPrivilegios = idPrivilegios;
	}

	public String getNombrePrivilegios() {
		return nombrePrivilegios;
	}

	public void setNombrePrivilegios(String nombrePrivilegios) {
		this.nombrePrivilegios = nombrePrivilegios;
	}

	public String getDetallePrivilegios() {
		return detallePrivilegios;
	}

	public void setDetallePrivilegios(String detallePrivilegios) {
		this.detallePrivilegios = detallePrivilegios;
	}
   
}
