package br.org.cesar.idata.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.cesar.idata.entity.Ambiente;
import br.org.cesar.idata.entity.Unidade;
import br.org.cesar.idata.repository.AmbienteRepository;

@Service
public class AmbienteService {
    @Autowired
    private AmbienteRepository ambienteRepository;

    @Autowired
    private UnidadeService unidadeService;

    public Ambiente cadastrarAmbiente(Ambiente novoAmbiente) {
        Unidade unidade = this.unidadeService.buscarUnidadePorId(novoAmbiente.getUnidade().getId());

        novoAmbiente.setUnidade(unidade);
        return this.ambienteRepository.save(novoAmbiente);
    }

    public List<Ambiente> obterAmbientes() {

        return this.ambienteRepository.findAll();
    }

    public Ambiente buscarAmbientePorId(long uuid) {
        Optional<Ambiente> Ambiente = this.ambienteRepository.findById(uuid);
        
        return Ambiente.orElseThrow(() -> new RuntimeException("Ambiente não encontrado"));
    }
}
