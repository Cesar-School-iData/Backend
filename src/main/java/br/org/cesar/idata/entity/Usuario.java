package br.org.cesar.idata.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity
@Data
public class Usuario {
    @Id
    private String email;
    @Column(nullable = false)
    private String senha;
    @Column(nullable = false)
    private String funcao; //não entendi o que seria essa função?
    private String descricao;

    @ManyToMany
    private List<Problema> problemas;
    
    public Usuario(String email, String senha, String funcao, String descricao){
        this.email = email;
        this.senha = senha;
        this.funcao = funcao;
        this.descricao = descricao;
    }
}
