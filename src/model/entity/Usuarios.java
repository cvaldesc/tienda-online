package model.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Usuarios
 *
 */
@Entity
@Table(name="usuarios")
public class Usuarios implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private int idUsuarios;
	
	@Basic(optional = false)
	@Column (name = "NombreUsuario")
	private String nombreUsuarios;
	
	@Basic (optional = false)
	@Column (name = "ContrasenaUsuario")
	private byte[] ContrasenaUsuario;
	
	@Basic (optional = false)
	@Column (name = "avatarUsuario")
	private String avatarUsuario;

	public Usuarios() {
		super();
	}
   
}
