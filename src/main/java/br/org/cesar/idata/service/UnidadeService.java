package br.org.cesar.idata.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.cesar.idata.entity.Unidade;
import br.org.cesar.idata.repository.UnidadeRepository;

@Service
public class UnidadeService {
    @Autowired
    private UnidadeRepository unidadeRepository;

    public Unidade cadastrarUnidade(Unidade novoUnidade) {
        return this.unidadeRepository.save(novoUnidade);
    }

    public List<Unidade> obterUnidades() {

        return this.unidadeRepository.findAll();
    }

    public Unidade buscarUnidadePorId(long uuid) {
        Optional<Unidade> Unidade = this.unidadeRepository.findById(uuid);
        
        return Unidade.orElseThrow(() -> new RuntimeException("Unidade não encontrado"));
    }
}
