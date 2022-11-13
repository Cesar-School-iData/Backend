package br.org.cesar.idata.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Reporta {
    @EmbeddedId
    private ReportaId id;
    @Column(nullable = false)
    private LocalDateTime data_hora;
    private String observação;
}
