package ejercicios.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import ejercicios.dao.IDepartamentosDAO;
import ejercicios.dto.Departamentos;
import ejercicios.dao.IDepartamentosDAO;

public class IDepartamentosServiceImpl implements IDepartamentosService{

	@Autowired
	private IDepartamentosService iDepService;
	
	@Override
	public List<Departamentos> listDepartamentos() {
		// TODO Auto-generated method stub
		return iDepService.listDepartamentos();
	}

	@Override
	public Departamentos departamentosPorCod(int codigo) {
		// TODO Auto-generated method stub
		return iDepService.departamentosPorCod(codigo);
	}

	@Override
	public Departamentos saveDepartamentos(Departamentos departamentos) {
		// TODO Auto-generated method stub
		return iDepService.saveDepartamentos(departamentos);
	}

	@Override
	public Departamentos updateDepartamentos(int codigo, Departamentos departamentos) {
		// TODO Auto-generated method stub
		return iDepService.updateDepartamentos(codigo, departamentos);
	}

	@Override
	public void deleteDepartamentos(int codigo) {
		// TODO Auto-generated method stub
		iDepService.deleteDepartamentos(codigo);
	}
		
	@GetMapping("/all")
	public List<Departamentos> listAllDepartamentos(){
		return listDepartamentos();
	}

}
