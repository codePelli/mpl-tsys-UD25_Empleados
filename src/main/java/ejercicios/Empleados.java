package ejercicios;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Empleados")
public class Empleados {
	@Id
	private String dni;
	private String nombre;
	private String apellidos;
	
	@ManyToOne
	@JoinColumn(name = "departamento")
	private Departamentos departamentos;
}
