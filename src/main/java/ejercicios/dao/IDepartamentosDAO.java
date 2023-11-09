package ejercicios.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ejercicios.dto.Departamentos;

@Repository
public interface IDepartamentosDAO extends JpaRepository<Departamentos, Integer>{
}
