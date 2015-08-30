package model.entity;

import java.io.Serializable;
import javax.persistence.*;
import model.entity.Roles;
import model.entity.DatosRegistro;;

/**
 * Entity implementation class for Entity: usuarios
 *
 */
@Entity
@Table(name="usuarios")
public class Usuarios implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	protected UsuariosPK usuariosPK; 
	
	@Basic(optional = false)
	@Column (name = "NombreUsuario")
	private String nombreUsuarios;
	
	@Basic (optional = false)
	@Column (name = "ContrasenaUsuario")
	private byte[] ContrasenaUsuario;
	
	@Basic (optional = false)
	@Column (name = "avatarUsuario")
	private String avatarUsuario;
	
	@JoinColumn(name = "datosRegistro_idRegistro" , referencedColumnName = "idRegistro")
	@ManyToOne (optional = false)
	private DatosRegistro idDatosRegistro;
	
	@JoinColumn(name = "roles_idroles" , referencedColumnName = "idroles")
	@ManyToOne (optional = false)
	private Roles idroles;
	
	public Usuarios() {
		super();
	}
	public Usuarios(UsuariosPK usuariosPK){
		this.usuariosPK = usuariosPK;
	}
	
	public Usuarios(UsuariosPK usuariosPK, String nombreUsuarios, byte[] contrasenaUsuario, String avatarUsuario){
		this.usuariosPK = usuariosPK;
		this.nombreUsuarios = nombreUsuarios;
		this.ContrasenaUsuario = contrasenaUsuario;
		this.avatarUsuario = avatarUsuario;
	}
	public Usuarios(Integer idUsuarios, int rolesIdroles){
		this.usuariosPK = new UsuariosPK(idUsuarios, rolesIdroles);
	}
	
	
	
	public UsuariosPK getUsuariosPK() {
		return usuariosPK;
	}
	public void setUsuariosPK(UsuariosPK usuariosPK) {
		this.usuariosPK = usuariosPK;
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
	public DatosRegistro getIdDatosRegistro() {
		return idDatosRegistro;
	}
	public void setIdDatosRegistro(DatosRegistro idDatosRegistro) {
		this.idDatosRegistro = idDatosRegistro;
	}
	public Roles getIdroles() {
		return idroles;
	}
	public void setIdroles(Roles idroles) {
		this.idroles = idroles;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
    public int hashCode() {
        int hash = 0;
        hash += (usuariosPK != null ? usuariosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuarios)) {
            return false;
        }
        Usuarios other = (Usuarios) object;
        if ((this.usuariosPK == null && other.usuariosPK != null) || (this.usuariosPK != null && !this.usuariosPK.equals(other.usuariosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.entities.Usuarios[ usuariosPK=" + usuariosPK + " ]";
    }
	


   
}
