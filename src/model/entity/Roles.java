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
	private int idroles;
	
	@Basic (optional = false)
	@Column (name = "rolesNombre")
	private String rolesNombre;
	
	@Column (name = "rolesDescripcion")
	private String rolesDescripcion;
	
	public Roles() {
		super();
	}
   
}
