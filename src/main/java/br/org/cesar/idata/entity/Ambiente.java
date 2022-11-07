package br.org.cesar.idata.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Ambiente {
    
    @Id
    @Column(name = "id")
    private String codigo;
    @Column(nullable = false)
    private int andar;
    @Column(nullable = false)
    private String espaco;
    @Column(nullable = false)
    private int numero;

    @ManyToOne
    private Unidade unidade;

    public Ambiente(String codigo, int andar, String espaco, int numero){
        this.codigo = codigo;
        this.andar = andar;
        this.espaco = espaco;
        this.numero = numero;
    }
}
