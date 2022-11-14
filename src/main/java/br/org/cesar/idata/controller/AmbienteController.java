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

import br.org.cesar.idata.entity.Ambiente;
import br.org.cesar.idata.service.AmbienteService;

@RestController
@RequestMapping("/ambiente")
public class AmbienteController {
    @Autowired
    private AmbienteService ambienteService;

    @GetMapping
    public List<Ambiente> listarUsuario() {
        return this.ambienteService.obterAmbientes();
    }

    @PostMapping
    public ResponseEntity<Ambiente> cadastrarAmbiente(@RequestBody Ambiente Ambiente) {
        Ambiente novoAmbiente = ambienteService.cadastrarAmbiente(Ambiente);
        return new ResponseEntity<Ambiente>(novoAmbiente, HttpStatus.CREATED); // status 201
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ambiente> listarPorId(@PathVariable(value = "id") long id) {
        Ambiente resBusca = ambienteService.buscarAmbientePorId(id);
        return new ResponseEntity<>(resBusca, HttpStatus.OK);
    }
}
