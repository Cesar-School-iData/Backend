package br.org.cesar.idata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.cesar.idata.entity.Administrador;

public interface AdministradorRepository extends JpaRepository<Administrador, Long>{
    
}
