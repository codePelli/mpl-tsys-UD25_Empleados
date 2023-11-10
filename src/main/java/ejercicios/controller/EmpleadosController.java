package ejercicios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ejercicios.dto.Empleados;
import ejercicios.services.IEmpleadosService;
import ejercicios.services.IEmpleadosServiceImpl;

@RestController
@RequestMapping("/empleados")
public class EmpleadosController {

		@Autowired
	    IEmpleadosServiceImpl empleadosService;

	    @GetMapping("/list")
	    public List<Empleados> listarEmpleados() {
	    	
	        return empleadosService.listEmpleados();
	    }

	    @PostMapping("/add")
	    public Empleados salvarEmpleado(@RequestBody Empleados empleado) {
	        return empleadosService.saveEmpleados(empleado);
	    }

	    @GetMapping("/{dni}")
	    public Empleados empleadoXID(@PathVariable(name = "dni") String dni) {
	    	
	        Empleados empleadoPorId = empleadosService.empleadosPorCod(dni);
	        System.out.println("Empleado XID: " + empleadoPorId);
	        return empleadoPorId;
	    }

	    @PutMapping("/{dni}")
	    public Empleados actualizarEmpleado(@PathVariable(name = "dni") String dni, @RequestBody Empleados empleado) {
	    	
	        Empleados empleadoSeleccionado = empleadosService.empleadosPorCod(dni);
	        empleadoSeleccionado.setNombre(empleado.getNombre());
	        empleadoSeleccionado.setApellidos(empleado.getApellidos());
	        empleadoSeleccionado.setDepartamentos(empleado.getDepartamentos());
	        
	        return empleadosService.updateEmpleados(empleadoSeleccionado);
	    }

	    @DeleteMapping("/{dni}")
	    public void eliminarEmpleado(@PathVariable(name = "dni") String dni) {
	    	
	        empleadosService.deleteEmpleados(dni);
	        System.out.println("Empleado eliminado");
	    }
	}