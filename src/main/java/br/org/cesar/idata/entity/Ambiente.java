package br.org.cesar.idata.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
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

    public Ambiente(String codigo, int andar, String espaco, int numero){
        this.codigo = codigo;
        this.andar = andar;
        this.espaco = espaco;
        this.numero = numero;
    }
}
