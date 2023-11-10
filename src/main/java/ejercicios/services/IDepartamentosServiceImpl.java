package ejercicios.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import ejercicios.dao.IDepartamentoDAO;
import ejercicios.dto.Departamentos;
import ejercicios.dao.IDepartamentoDAO;

@Service
public class IDepartamentosServiceImpl implements IDepartamentosService{

	@Autowired
	private IDepartamentoDAO iDepService;
	
	@Override
	public List<Departamentos> listDepartamentos() {
		// TODO Auto-generated method stub
		return iDepService.findAll();
	}

	@Override
	public Departamentos departamentosPorCod(int codigo) {
		// TODO Auto-generated method stub
		return iDepService.findById(codigo).get();
	}

	@Override
	public Departamentos saveDepartamentos(Departamentos departamentos) {
		// TODO Auto-generated method stub
		return iDepService.save(departamentos);
	}

	@Override
	public Departamentos updateDepartamentos(Departamentos departamentos) {
		// TODO Auto-generated method stub
		return iDepService.save(departamentos);
	}

	@Override
	public void deleteDepartamentos(int codigo) {
		// TODO Auto-generated method stub
		iDepService.deleteById(codigo);
	}	

}
