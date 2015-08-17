package model.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: DatosRegistro
 *
 */
@Entity
@Table (name ="datosregistro")


public class DatosRegistro implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Basic (optional = false)
	@Column ( name ="idRegistro")
	@GeneratedValue
	private Integer idRegistro;
	@Basic (optional = false)
	@Column ( name ="Nombre")
	private String nombre;
	@Basic (optional = false)
	@Column ( name ="ApellidoPaterno")
	private String apellidoPaterno;
	@Basic (optional = false)
	@Column ( name ="ApellidoMaterno")
	private String apellidoMaterno;
	@Basic (optional = false)
	@Column ( name ="Pais")
	private String pais;
	@Basic (optional = false)
	@Column ( name ="region")
	private String region;
	@Basic (optional = false)
	@Column ( name ="Ciudad")
	private String ciudad;
	@Basic (optional = false)
	@Column ( name ="Calle")
	private String calle;
	@Basic (optional = false)
	@Column ( name ="numeroCalle")
	private Integer numeroCalle;
	@Basic (optional = false)
	@Column ( name ="Departamento")
	private String departamento;
	@Basic (optional = false)
	@Column ( name ="Telefono")
	private Integer telefono;
	@Basic (optional = false)
	@Column ( name ="CodigoPostal")
	private Integer codigoPostal;
	@Basic (optional = false)
	@Column ( name ="Correo")
	private String correo;
	
	public DatosRegistro() {
		super();
	}
	public DatosRegistro(Integer idRegistro){
		this.idRegistro = idRegistro; 
	}
	public DatosRegistro(Integer idRegistro, String nombre, String apellidoPaterno, String apellidoMaterno, String pais, String region, String ciudad, String calle, int numeroCalle, String departamento, int telefono, int codigoPostal, String correo){
		this.idRegistro = idRegistro;
	    this.nombre = nombre;
	    this.apellidoPaterno = apellidoPaterno;
	    this.apellidoMaterno = apellidoMaterno;
	    this.pais = pais;
	    this.region = region;
	    this.ciudad = ciudad;
	    this.calle = calle;
	    this.numeroCalle = numeroCalle;
	    this.departamento = departamento;
	    this.telefono = telefono;
	    this.codigoPostal = codigoPostal;
	    this.correo = correo;
	}
	public Integer getIdRegistro() {
		return idRegistro;
	}
	public void setIdRegistro(Integer idRegistro) {
		this.idRegistro = idRegistro;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public Integer getNumeroCalle() {
		return numeroCalle;
	}
	public void setNumeroCalle(Integer numeroCalle) {
		this.numeroCalle = numeroCalle;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public Integer getTelefono() {
		return telefono;
	}
	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}
	public Integer getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(Integer codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
}
