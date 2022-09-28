package br.edu.ifms.escola.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifms.escola.model.Escola;

@Repository
public interface EscolaRepository extends JpaRepository<Escola, Integer>{

}
