package br.org.cesar.idata.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Unidade {
    
    @Id
    private String predio;
    
    public Unidade(String predio){
        this.predio = predio;
    }
}
