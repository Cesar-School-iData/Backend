package br.org.cesar.idata.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class ReportaId implements Serializable{
    private long problema;
    private long reportador;
}
