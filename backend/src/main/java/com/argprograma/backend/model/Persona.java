
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
public class Persona implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private String profesion;
    private String sobreMi;
    private String lugarResidencia;
    private String fotoPerfil;
    private String fotoPortada;
    private String email;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String profesion, String sobreMi, String lugarResidencia, String fotoPerfil, String fotoPortada, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
        this.sobreMi = sobreMi;
        this.lugarResidencia = lugarResidencia;
        this.fotoPerfil = fotoPerfil;
        this.fotoPortada = fotoPortada;
        this.email = email;
    }

    
    

}
