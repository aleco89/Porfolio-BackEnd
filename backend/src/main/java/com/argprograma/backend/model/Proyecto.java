
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
public class Proyecto implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String comitente;
    private String descripcion;
    private String foto;

    public Proyecto() {
    }

    public Proyecto(Long id, String nombre, String comitente, String descripcion, String foto) {
        this.id = id;
        this.nombre = nombre;
        this.comitente = comitente;
        this.descripcion = descripcion;
        this.foto = foto;
    }
    
    
 
}
