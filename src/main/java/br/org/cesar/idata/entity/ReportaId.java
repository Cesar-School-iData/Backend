package br.org.cesar.idata.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Embeddable
public class ReportaId implements Serializable{
    @ManyToOne
    private Problema problema;
    @ManyToOne
    private Reportador reportador;
}
