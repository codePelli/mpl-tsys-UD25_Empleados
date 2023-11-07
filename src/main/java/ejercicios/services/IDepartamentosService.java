package ejercicios.services;

import java.util.List;

import ejercicios.Departamentos;
import ejercicios.dto.DepartamentosDTO;

public interface IDepartamentosService {
	
	List<Departamentos> listDepartamentos();
	
	Departamentos departamentosPorCod(int codigo);
	
	Departamentos saveDepartamentos(Departamentos departamentos);
	
	Departamentos updateDepartamentos(int codigo, Departamentos departamentos);
	
	public void deleteDepartamentos(int codigo);
}
