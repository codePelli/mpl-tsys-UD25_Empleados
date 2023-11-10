package ejercicios.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import ejercicios.dao.IEmpleadoDAO;
import ejercicios.dto.Empleados;

@Service
public class IEmpleadosServiceImpl implements IEmpleadosService{

	@Autowired
	private IEmpleadoDAO iEmplServ;
	
	@Override
	public List<Empleados> listEmpleados() {
		// TODO Auto-generated method stub
		return iEmplServ.findAll();
	}

	@Override
	public Empleados empleadosPorCod(String dni) {
		// TODO Auto-generated method stub
		return iEmplServ.findById(dni).get();
	}

	@Override
	public Empleados saveEmpleados(Empleados empleados) {
		// TODO Auto-generated method stub
		return iEmplServ.save(empleados);
	}

	@Override
	public Empleados updateEmpleados(Empleados empleados) {
		// TODO Auto-generated method stub
		return iEmplServ.save(empleados);
	}

	@Override
	public void deleteEmpleados(String dni) {
		// TODO Auto-generated method stub
		iEmplServ.deleteById(dni);
	}

}
