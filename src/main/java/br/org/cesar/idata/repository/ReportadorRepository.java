package br.org.cesar.idata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.cesar.idata.entity.Reportador;

public interface ReportadorRepository extends JpaRepository<Reportador, Long>{
    
}
