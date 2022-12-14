
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
public class Educacion implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String educacion;
    private String periodo;
    private String institucion;
    private String logoInstitucion;

    public Educacion() {
    }

    public Educacion(Long id, String educacion, String periodo, String institucion, String logoInstitucion) {
        this.id = id;
        this.educacion = educacion;
        this.periodo = periodo;
        this.institucion = institucion;
        this.logoInstitucion = logoInstitucion;
    }

    
    
}
