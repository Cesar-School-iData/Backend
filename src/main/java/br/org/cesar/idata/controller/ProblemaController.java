package br.org.cesar.idata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.cesar.idata.entity.Problema;
import br.org.cesar.idata.service.ProblemaService;

@RestController
@RequestMapping("/problema")
public class ProblemaController {
    @Autowired
    private ProblemaService problemaService;

    @GetMapping
    public List<Problema> listarUsuario() {
        return this.problemaService.obterProblema();
    }

    @PostMapping
    public ResponseEntity<Problema> cadastrarProblema(@RequestBody Problema problema) {
        Problema novoProblema = this.problemaService.cadastrarProblema(problema);
        return new ResponseEntity<Problema>(novoProblema, HttpStatus.CREATED); // status 201
    }

    @GetMapping("/{id}")
    public ResponseEntity<Problema> listarPorId(@PathVariable(value = "id") long id) {
        Problema resBusca = problemaService.buscarProblemaPorId(id);
        return new ResponseEntity<>(resBusca, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarUser(@PathVariable Long id) {
        this.problemaService.deletarProblema(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
