package ejercicios.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

<<<<<<< HEAD
import ejercicios.dto.Empleados;
=======
import ejercicios.Empleados;

@Repository
public interface IEmpleadoDAO extends JpaRepository<Empleados, String>{
}
