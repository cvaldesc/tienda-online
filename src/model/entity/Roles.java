package model.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Roles
 *
 */
@Entity
@Table (name = "roles")
public class Roles implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Basic (optional = false)
	@Column (name = "idroles")
	private Integer idroles;
	
	@Basic (optional = false)
	@Column (name = "rolesNombre")
	private String rolesNombre;
	
	@Column (name = "rolesDescripcion")
	private String rolesDescripcion;
	
	public Roles() {
		super();
	}
	public Roles(Integer idroles){
		this.idroles = idroles;
	}
	
	public Roles(Integer idroles, String rolesNombre, String rolesDescripcion){
		this.idroles = idroles;
		this.rolesNombre = rolesNombre;
		this.rolesDescripcion = rolesDescripcion;
	}
	

	public Integer getIdroles() {
		return idroles;
	}

	public void setIdroles(Integer idroles) {
		this.idroles = idroles;
	}

	public String getRolesNombre() {
		return rolesNombre;
	}

	public void setRolesNombre(String rolesNombre) {
		this.rolesNombre = rolesNombre;
	}

	public String getRolesDescripcion() {
		return rolesDescripcion;
	}

	public void setRolesDescripcion(String rolesDescripcion) {
		this.rolesDescripcion = rolesDescripcion;
	}
	
   
}
