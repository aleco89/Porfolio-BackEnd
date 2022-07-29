
package com.argprograma.backend.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Experiencia implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String experiencia;
    private String periodo;
    private String descripcionTrabajo;
    private String lugar;
    private String logo;

    public Experiencia() {
    }

    public Experiencia(Long id, String experiencia, String periodo, String descripcionTrabajo, String lugar, String logo) {
        this.id = id;
        this.experiencia = experiencia;
        this.periodo = periodo;
        this.descripcionTrabajo = descripcionTrabajo;
        this.lugar = lugar;
        this.logo = logo;
    }
    
    

}
