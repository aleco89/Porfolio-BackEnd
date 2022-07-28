
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
public class Idioma implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String idioma;
    private String nivel;

    public Idioma() {
    }

    public Idioma(Long id, String idioma, String nivel) {
        this.id = id;
        this.idioma = idioma;
        this.nivel = nivel;
    }
        
}
