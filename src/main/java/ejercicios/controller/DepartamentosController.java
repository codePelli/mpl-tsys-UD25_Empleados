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

import ejercicios.dto.Departamentos;
import ejercicios.services.IDepartamentosService;
import ejercicios.services.IDepartamentosServiceImpl;

@RestController
@RequestMapping("/departamentos")
public class DepartamentosController {
	
	@Autowired
    IDepartamentosServiceImpl departamentosService;

    @GetMapping("/list")
    public List<Departamentos> listarDepartamentos() {
    	
        return departamentosService.listDepartamentos();
    }

    @PostMapping("/add")
    public Departamentos salvarDepartamento(@RequestBody Departamentos departamento) {
    	
        return departamentosService.saveDepartamentos(departamento);
    }

    @GetMapping("/{codigo}")
    public Departamentos departamentoXID(@PathVariable(name = "codigo") Integer codigo) {
    	
        Departamentos departamentoXID = departamentosService.departamentosPorCod(codigo);
        System.out.println("Departamento XID: " + departamentoXID);
        return departamentoXID;
    }

    @PutMapping("/{codigo}")
    public Departamentos actualizarDepartamento(@PathVariable(name = "codigo") Integer codigo, @RequestBody Departamentos departamento) {
    	
        Departamentos departamentoSeleccionado = departamentosService.departamentosPorCod(codigo);
        departamentoSeleccionado.setNombre(departamento.getNombre());
        departamentoSeleccionado.setPresupuesto(departamento.getPresupuesto());
        return departamentosService.updateDepartamentos(departamentoSeleccionado);
    }

    @DeleteMapping("/{codigo}")
    public void eliminarDepartamento(@PathVariable(name = "codigo") Integer codigo) {
    	
        departamentosService.deleteDepartamentos(codigo);
        System.out.println("Departamento eliminado");
    }
}
