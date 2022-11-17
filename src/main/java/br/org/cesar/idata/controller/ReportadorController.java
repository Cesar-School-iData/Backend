package br.org.cesar.idata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.cesar.idata.entity.Reportador;
import br.org.cesar.idata.service.ReportadorService;

@RestController
@RequestMapping("/reportar")
@CrossOrigin("*")
public class ReportadorController {
    
    @Autowired
    private ReportadorService reportadorService;

    @GetMapping
    public List<Reportador> listarUsuario() {
        return this.reportadorService.obterReportadors();
    }

    @PostMapping
    public ResponseEntity<Reportador> cadastrarReportador(@RequestBody Reportador reportador) {
        Reportador novoReportador = reportadorService.cadastrarReportador(reportador);
        return new ResponseEntity<Reportador>(novoReportador, HttpStatus.CREATED); // status 201
    }

    @GetMapping("/{id}")
    public ResponseEntity<Reportador> listarPorId(@PathVariable(value = "id") long id) {
        Reportador resBusca = reportadorService.buscarReportadorPorId(id);
        return new ResponseEntity<>(resBusca, HttpStatus.OK);
    }
}
