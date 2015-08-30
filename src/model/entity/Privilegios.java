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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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


   
}
