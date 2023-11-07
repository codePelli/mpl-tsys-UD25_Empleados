package ejercicios.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Empleados")
public class EmpleadosDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="dni")
	private String dni;
	private String nombre;
	private String apellidos;
	
	public EmpleadosDTO(String dni, String nombre, String apellidos, DepartamentosDTO departamentos) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.departamentos = departamentos;
	}

	@ManyToOne
	@JoinColumn(name = "departamento")
	private DepartamentosDTO departamentos;
}
