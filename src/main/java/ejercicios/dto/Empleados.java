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
public class Empleados {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="dni")
	private String dni;
	private String nombre;
	private String apellidos;
	
	public Empleados(String dni, String nombre, String apellidos, Departamentos departamentos) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.departamentos = departamentos;
	}

	@ManyToOne
	@JoinColumn(name = "Departamentos")
	private Departamentos departamentos;
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Departamentos getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(Departamentos departamentos) {
		this.departamentos = departamentos;
	}
}
