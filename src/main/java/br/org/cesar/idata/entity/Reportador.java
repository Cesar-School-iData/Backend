package br.org.cesar.idata.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@PrimaryKeyJoinColumn(name="id")
public class Reportador extends Usuario{
    private String nome;

}