package ejercicios.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import ejercicios.Empleados;

public class IEmpleadosServiceImpl implements IEmpleadosService{

	@Autowired
	private IEmpleadosService iEmplServ;
	
	@Override
	public List<Empleados> listEmpleados() {
		// TODO Auto-generated method stub
		return iEmplServ.listEmpleados();
	}

	@Override
	public Empleados empeladosPorCod(String dni) {
		// TODO Auto-generated method stub
		return iEmplServ.empeladosPorCod(dni);
	}

	@Override
	public Empleados saveEmpleados(Empleados empleados) {
		// TODO Auto-generated method stub
		return iEmplServ.saveEmpleados(empleados);
	}

	@Override
	public Empleados updateEmpleados(String dni, Empleados departamentos) {
		// TODO Auto-generated method stub
		return iEmplServ.updateEmpleados(dni, departamentos);
	}

	@Override
	public void deleteEmpleados(String dni) {
		// TODO Auto-generated method stub
		iEmplServ.deleteEmpleados(dni);
	}
	
	@GetMapping("/all")
	public List<Empleados> listAllEmpleados(){
		return listEmpleados();
	}

}
