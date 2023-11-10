package ejercicios.services;

import java.util.List;

import ejercicios.dto.Empleados;

public interface IEmpleadosService {

	List<Empleados> listEmpleados();
	
	Empleados empleadosPorCod(String dni);
	
	Empleados saveEmpleados(Empleados empleados);
	
	Empleados updateEmpleados(Empleados departamentos);
	
	public void deleteEmpleados(String dni);
}
