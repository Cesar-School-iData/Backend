package br.org.cesar.idata.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

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

    public Usuario(String email, String senha, String funcao, String descricao){
        this.email = email;
        this.senha = senha;
        this.funcao = funcao;
        this.descricao = descricao;
    }
}
