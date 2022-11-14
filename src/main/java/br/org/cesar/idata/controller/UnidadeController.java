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

import br.org.cesar.idata.entity.Unidade;
import br.org.cesar.idata.service.UnidadeService;

@RestController
@RequestMapping("/unidade")
public class UnidadeController {
    @Autowired
    private UnidadeService unidadeService;

    @GetMapping
    public List<Unidade> listarUsuario() {
        return this.unidadeService.obterUnidades();
    }

    @PostMapping
    public ResponseEntity<Unidade> cadastrarUnidade(@RequestBody Unidade Unidade) {
        Unidade novoUnidade = unidadeService.cadastrarUnidade(Unidade);
        return new ResponseEntity<Unidade>(novoUnidade, HttpStatus.CREATED); // status 201
    }

    @GetMapping("/{id}")
    public ResponseEntity<Unidade> listarPorId(@PathVariable(value = "id") long id) {
        Unidade resBusca = unidadeService.buscarUnidadePorId(id);
        return new ResponseEntity<>(resBusca, HttpStatus.OK);
    }
}
