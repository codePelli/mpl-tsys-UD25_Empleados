package ejercicios.services;

import java.util.List;

import ejercicios.dto.EmpleadosDTO;

public interface IEmpleadosService {

	List<EmpleadosDTO> listEmpleados();
	
	EmpleadosDTO empeladosPorCod(String dni);
	
	EmpleadosDTO saveEmpleados(EmpleadosDTO empleados);
	
	EmpleadosDTO updateEmpleados(String dni, EmpleadosDTO departamentos);
	
	public void deleteEmpleados(String dni);
}
