package model.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;



@Embeddable
public class UsuariosPK implements Serializable{
	

	private static final long serialVersionUID = 1L;

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column (name="idUsuarios")
	private Integer idUsuarios;
	
	@Basic(optional = false)
	@Column(name = "roles_idroles")
	private int rolesIdroles;

	public UsuariosPK() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UsuariosPK(Integer idUsuarios, int rolesIdroles) {
		this.idUsuarios = idUsuarios;
		this.rolesIdroles = rolesIdroles;
	}
	
	public Integer getIdUsuarios() {
		return idUsuarios;
	}

	public void setIdUsuarios(Integer idUsuarios) {
		this.idUsuarios = idUsuarios;
	}

	public int getRolesIdroles() {
		return rolesIdroles;
	}

	public void setRolesIdroles(int rolesIdroles) {
		this.rolesIdroles = rolesIdroles;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idUsuarios == null) ? 0 : idUsuarios.hashCode());
		result = prime * result + rolesIdroles;
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
		UsuariosPK other = (UsuariosPK) obj;
		if (idUsuarios == null) {
			if (other.idUsuarios != null)
				return false;
		} else if (!idUsuarios.equals(other.idUsuarios))
			return false;
		if (rolesIdroles != other.rolesIdroles)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "UsuariosPK [idUsuarios=" + idUsuarios + ", rolesIdroles=" + rolesIdroles + "]";
	}
	
	
	
}
