package br.org.cesar.idata.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.cesar.idata.entity.Administrador;
import br.org.cesar.idata.repository.AdministradorRepository;

@Service
public class AdministradorService {

    @Autowired
    private AdministradorRepository administradorRepository;

    public Administrador cadastrarAdministrador(Administrador novoAdministrador) {
        return this.administradorRepository.save(novoAdministrador);
    }

    public List<Administrador> obterAdministradors() {

        return this.administradorRepository.findAll();
    }

    public Administrador buscarAdministradorPorId(long id) {
        System.out.println("\n\n\n\n\n\n\n" + id + "\n\n\n\n\n\n\n");
        Optional<Administrador> Administrador = this.administradorRepository.findById(id);
        
        return Administrador.orElseThrow(() -> new RuntimeException("Administrador não encontrado"));
    }
}
