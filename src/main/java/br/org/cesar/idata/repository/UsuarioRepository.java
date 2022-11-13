package br.org.cesar.idata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.cesar.idata.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
}
