package br.org.cesar.idata.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Data;

@Entity
@Data
@PrimaryKeyJoinColumn(name="id")
public class Reportador extends Usuario{
    private long problemas_reportados;

}