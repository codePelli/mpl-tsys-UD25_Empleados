package ejercicios.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import ejercicios.dao.IDepartamentosDAO;
import ejercicios.dto.DepartamentosDTO;

public class IDepartamentosServiceImpl implements IDepartamentosService{

	@Autowired
	private IDepartamentosService iDepService;
	
	@Override
	public List<DepartamentosDTO> listDepartamentos() {
		// TODO Auto-generated method stub
		return iDepService.listDepartamentos();
	}

	@Override
	public DepartamentosDTO departamentosPorCod(int codigo) {
		// TODO Auto-generated method stub
		return iDepService.departamentosPorCod(codigo);
	}

	@Override
	public DepartamentosDTO saveDepartamentos(DepartamentosDTO departamentos) {
		// TODO Auto-generated method stub
		return iDepService.saveDepartamentos(departamentos);
	}

	@Override
	public DepartamentosDTO updateDepartamentos(int codigo, DepartamentosDTO departamentos) {
		// TODO Auto-generated method stub
		return iDepService.updateDepartamentos(codigo, departamentos);
	}

	@Override
	public void deleteDepartamentos(int codigo) {
		// TODO Auto-generated method stub
		iDepService.deleteDepartamentos(codigo);
	}
		
	@GetMapping("/all")
	public List<DepartamentosDTO> listAllDepartamentos(){
		return listDepartamentos();
	}

}
