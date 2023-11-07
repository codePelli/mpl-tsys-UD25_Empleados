package ejercicios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ejercicios.services.IEmpleadosService;

@RestController
@RequestMapping("/empleados")
public class EmpleadosController {

	@Autowired
	private IEmpleadosService empleadoService;
}
