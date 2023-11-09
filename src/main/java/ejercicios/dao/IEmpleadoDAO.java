package ejercicios.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ejercicios.dto.Empleados;

@Repository
public interface IEmpleadoDAO extends JpaRepository<Empleados, String>{
}
