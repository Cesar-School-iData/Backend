package br.org.cesar.idata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.cesar.idata.entity.Administrador;
import br.org.cesar.idata.service.AdministradorService;

@RestController
@RequestMapping("/adm")
public class AdministradorController {
    @Autowired
    private AdministradorService administradorService;

    @GetMapping
    public List<Administrador> listarUsuario() {
        return this.administradorService.obterAdministradors();
    }

    @PostMapping
    public ResponseEntity<Administrador> cadastrarAdministrador(@RequestBody Administrador Administrador) {
        Administrador novoAdministrador = administradorService.cadastrarAdministrador(Administrador);
        return new ResponseEntity<Administrador>(novoAdministrador, HttpStatus.CREATED); // status 201
    }

    @GetMapping("/{id}")
    public ResponseEntity<Administrador> listarPorId(@PathVariable(value = "id") long id) {
        Administrador resBusca = administradorService.buscarAdministradorPorId(id);
        return new ResponseEntity<>(resBusca, HttpStatus.OK);
    }
}
