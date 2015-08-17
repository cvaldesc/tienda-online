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
	@Basic(optional = false)
	@Column (name="idUsuarios")
	private Integer idUsuarios;
	
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
	public Usuarios(Integer idUsuarios){
		this.idUsuarios = idUsuarios;
	}
	
	public Usuarios(Integer idUsuarios, String nombreUsuarios, byte[] contrasenaUsuario, String avatarUsuario){
		this.idUsuarios = idUsuarios;
		this.nombreUsuarios =nombreUsuarios;
		this.ContrasenaUsuario = contrasenaUsuario;
		this.avatarUsuario = avatarUsuario;
	}
	
	public Integer getIdUsuarios() {
		return idUsuarios;
	}


	public void setIdUsuarios(Integer idUsuarios) {
		this.idUsuarios = idUsuarios;
	}


	public String getNombreUsuarios() {
		return nombreUsuarios;
	}


	public void setNombreUsuarios(String nombreUsuarios) {
		this.nombreUsuarios = nombreUsuarios;
	}


	public byte[] getContrasenaUsuario() {
		return ContrasenaUsuario;
	}


	public void setContrasenaUsuario(byte[] contrasenaUsuario) {
		ContrasenaUsuario = contrasenaUsuario;
	}


	public String getAvatarUsuario() {
		return avatarUsuario;
	}


	public void setAvatarUsuario(String avatarUsuario) {
		this.avatarUsuario = avatarUsuario;
	}



   
}
