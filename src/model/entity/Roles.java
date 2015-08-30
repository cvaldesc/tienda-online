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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	


}
