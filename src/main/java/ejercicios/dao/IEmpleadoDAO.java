package ejercicios.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ejercicios.dto.EmpleadosDTO;

@Repository
public interface IEmpleadoDAO extends JpaRepository<EmpleadosDTO, String>{
}
