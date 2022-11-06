package br.org.cesar.idata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.cesar.idata.entity.Ambiente;

public interface AmbienteRepository extends JpaRepository<Ambiente, String> {
    
}
