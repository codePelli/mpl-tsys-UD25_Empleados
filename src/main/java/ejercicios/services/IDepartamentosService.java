package ejercicios.services;

import java.util.List;

import ejercicios.dto.DepartamentosDTO;

public interface IDepartamentosService {
	
	List<DepartamentosDTO> listDepartamentos();
	
	DepartamentosDTO departamentosPorCod(int codigo);
	
	DepartamentosDTO saveDepartamentos(DepartamentosDTO departamentos);
	
	DepartamentosDTO updateDepartamentos(int codigo, DepartamentosDTO departamentos);
	
	public void deleteDepartamentos(int codigo);
}
