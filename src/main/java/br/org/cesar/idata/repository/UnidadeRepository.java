package br.org.cesar.idata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.cesar.idata.entity.Unidade;

public interface UnidadeRepository extends JpaRepository<Unidade, Long>{
    
}
