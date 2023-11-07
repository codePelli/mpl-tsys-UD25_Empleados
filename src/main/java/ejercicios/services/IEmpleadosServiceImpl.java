package ejercicios.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import ejercicios.dto.EmpleadosDTO;

public class IEmpleadosServiceImpl implements IEmpleadosService{

	@Autowired
	private IEmpleadosService iEmplServ;
	
	@Override
	public List<EmpleadosDTO> listEmpleados() {
		// TODO Auto-generated method stub
		return iEmplServ.listEmpleados();
	}

	@Override
	public EmpleadosDTO empeladosPorCod(String dni) {
		// TODO Auto-generated method stub
		return iEmplServ.empeladosPorCod(dni);
	}

	@Override
	public EmpleadosDTO saveEmpleados(EmpleadosDTO empleados) {
		// TODO Auto-generated method stub
		return iEmplServ.saveEmpleados(empleados);
	}

	@Override
	public EmpleadosDTO updateEmpleados(String dni, EmpleadosDTO departamentos) {
		// TODO Auto-generated method stub
		return iEmplServ.updateEmpleados(dni, departamentos);
	}

	@Override
	public void deleteEmpleados(String dni) {
		// TODO Auto-generated method stub
		iEmplServ.deleteEmpleados(dni);
	}
	
	@GetMapping("/all")
	public List<EmpleadosDTO> listAllEmpleados(){
		return listEmpleados();
	}

}
