package br.org.cesar.idata.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Problema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String categoria;
    @Column(nullable = false)
    private String especificacao;
    @Column(nullable = false)
    private int status; // tlavez poderia botar um bool aqui

    @ManyToOne
    private Ambiente ambiente;
    @ManyToOne
    private Administrador administrador;
}
