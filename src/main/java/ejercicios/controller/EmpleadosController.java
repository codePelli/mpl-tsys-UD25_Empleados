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

@RestController
@RequestMapping("/empleados")
public class EmpleadosController {

	    IEmpleadosService empleadosService;

	    @GetMapping("/all")
	    public List<Empleados> listarEmpleados() {
	        return empleadosService.listEmpleados();
	    }

	    @PostMapping("/add")
	    public Empleados salvarEmpleado(@RequestBody Empleados empleado) {
	        return empleadosService.saveEmpleados(empleado);
	    }

	    @GetMapping("/{DNI}")
	    public Empleados empleadoXID(@PathVariable(name = "DNI") String DNI) {
	    	
	        Empleados empleadoPorId = empleadosService.empleadosPorCod(DNI);
	        System.out.println("Empleado XID: " + empleadoPorId);
	        return empleadoPorId;
	    }

	    @PutMapping("/{DNI}")
	    public Empleados actualizarEmpleado(@PathVariable(name = "DNI") String DNI, @RequestBody Empleados empleado) {
	    	
	        Empleados empleadoSeleccionado = empleadosService.empleadosPorCod(DNI);
	        empleadoSeleccionado.setNombre(empleado.getNombre());
	        empleadoSeleccionado.setApellidos(empleado.getApellidos());
	        empleadoSeleccionado.setDepartamentos(empleado.getDepartamentos());
	        
	        return empleadosService.updateEmpleados(DNI, empleadoSeleccionado);
	    }

	    @DeleteMapping("/{DNI}")
	    public void eliminarEmpleado(@PathVariable(name = "DNI") String DNI) {
	    	
	        empleadosService.deleteEmpleados(DNI);
	        System.out.println("Empleado eliminado");
	    }
	}