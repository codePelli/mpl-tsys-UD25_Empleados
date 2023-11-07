package ejercicios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ejercicios.services.IDepartamentosService;

@RestController
@RequestMapping("/departamentos")
public class DepartamentosController {

	@Autowired
	private IDepartamentosService departamentoService;
}
