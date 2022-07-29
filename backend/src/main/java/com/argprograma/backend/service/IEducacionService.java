
package com.argprograma.backend.service;

import com.argprograma.backend.model.Educacion;
import java.util.List;


public interface IEducacionService {
    public List<Educacion> findAllEducacion();
    public void createEducacion (Educacion edu);
    public void updateEducacion (Educacion edu);
    public void deleteEducacion (Long id);
    public Educacion findEducacion(Long id);
}
