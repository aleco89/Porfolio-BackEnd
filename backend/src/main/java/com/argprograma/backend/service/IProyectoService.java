
package com.argprograma.backend.service;

import com.argprograma.backend.model.Proyecto;
import java.util.List;


public interface IProyectoService {
    public List<Proyecto> findAllProyecto();
    public void createProyecto (Proyecto proyecto);
    public void updateProyecto (Proyecto proyecto);
    public void deleteProyecto (Long id);
    public Proyecto findProyecto(Long id);
}
