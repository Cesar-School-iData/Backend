package br.org.cesar.idata.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.cesar.idata.entity.Reportador;
import br.org.cesar.idata.repository.ReportadorRepository;

@Service
public class ReportadorService {
    
    @Autowired
    private ReportadorRepository ReportadorRepository;

    public Reportador cadastrarReportador(Reportador novoReportador) {
        return this.ReportadorRepository.save(novoReportador);
    }

    public List<Reportador> obterReportadors() {

        return this.ReportadorRepository.findAll();
    }

    public Reportador buscarReportadorPorId(long uuid) {
        Optional<Reportador> Reportador = this.ReportadorRepository.findById(uuid);
        
        return Reportador.orElseThrow(() -> new RuntimeException("Reportador não encontrado"));
    }
}
