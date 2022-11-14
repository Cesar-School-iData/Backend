package br.org.cesar.idata.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.cesar.idata.entity.Administrador;
import br.org.cesar.idata.entity.Ambiente;
import br.org.cesar.idata.entity.Problema;
import br.org.cesar.idata.repository.ProblemaRepository;

@Service
public class ProblemaService {
    
    @Autowired
    private ProblemaRepository problemaRepository;
    
    @Autowired
    private AdministradorService administradorService;

    @Autowired
    private AmbienteService ambienteService;

    public Problema cadastrarProblema(Problema novoProblema) {
        Administrador administrador = this.administradorService.buscarAdministradorPorId(novoProblema.getAdministrador().getId());
        Ambiente ambiente = this.ambienteService.buscarAmbientePorId(novoProblema.getAmbiente().getId());

        novoProblema.setAdministrador(administrador);
        novoProblema.setAmbiente(ambiente);

        return this.problemaRepository.save(novoProblema);
    }

    public List<Problema> obterProblema() {

        return this.problemaRepository.findAll();
    }

    public Problema buscarProblemaPorId(Long uuid) {
        Optional<Problema> Problema = this.problemaRepository.findById(uuid);
        
        return Problema.orElseThrow(() -> new RuntimeException("Problema não encontrado"));
    }

    /*public Problema atualizarProblema(long id, Problema ProblemaAtualizado) {
        Problema Problema = this.buscarProblemaPorId(id);

        User user = this.userService.buscarUserPorId(ProblemaAtualizado.getUser().getUuid());

        Problema.setTitle(ProblemaAtualizado.getTitle());
        Problema.setResume(ProblemaAtualizado.getResume());
        Problema.setText(ProblemaAtualizado.getText());
        ProblemaAtualizado.setSlug(PREFIX_SLUG + slug);
        Problema.setRegisteredAt(LocalDateTime.now());
        ProblemaAtualizado.setUser(user);

        return this.problemaRepository.save(Problema);
    }*/

    public void deletarProblema(long id) {
        this.buscarProblemaPorId(id);
        this.problemaRepository.deleteById(id);
    }
}
