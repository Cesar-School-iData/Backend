package br.org.cesar.idata.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
    private String especialização;
    @Column(nullable = false)
    private String status; // tlavez poderia botar um bool aqui

    public Problema(String categoria, String especialização, String status){
        this.categoria = categoria;
        this.especialização = especialização;
        this.status = status;
    }
}
