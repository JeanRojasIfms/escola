package br.edu.ifms.escola.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifms.escola.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer>{

}
