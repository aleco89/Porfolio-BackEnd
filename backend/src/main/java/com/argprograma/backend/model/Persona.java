
package com.argprograma.backend.model;

import java.io.Serializable;
import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Persona implements Serializable {
    private Long id;
    private String nombre;
    private String apellido;
    private String sobreMi;
    private String lugarResidencia;
    private String urlFotoPerfil;
    private String urlFotoPortada;
    private String email;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String sobreMi, String lugarResidencia, String urlFotoPerfil, String urlFotoPortada, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sobreMi = sobreMi;
        this.lugarResidencia = lugarResidencia;
        this.urlFotoPerfil = urlFotoPerfil;
        this.urlFotoPortada = urlFotoPortada;
        this.email = email;
    }
    
    

}
