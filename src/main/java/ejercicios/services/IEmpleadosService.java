package ejercicios.services;

import java.util.List;

<<<<<<< HEAD
import ejercicios.dto.Empleados;
=======
import ejercicios.Empleados;

public interface IEmpleadosService {

	List<Empleados> listEmpleados();
	
	Empleados empeladosPorCod(String dni);
	
	Empleados saveEmpleados(Empleados empleados);
	
	Empleados updateEmpleados(String dni, Empleados departamentos);
	
	public void deleteEmpleados(String dni);
}
