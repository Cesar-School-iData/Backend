package br.org.cesar.idata.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@PrimaryKeyJoinColumn(name="usuario_id")
public class Administrador extends Usuario{
    @Column(nullable = false)
    private String senha;

}
