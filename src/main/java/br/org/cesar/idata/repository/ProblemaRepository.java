package br.org.cesar.idata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.cesar.idata.entity.Problema;

public interface ProblemaRepository extends JpaRepository<Problema, Long>{
    
}
