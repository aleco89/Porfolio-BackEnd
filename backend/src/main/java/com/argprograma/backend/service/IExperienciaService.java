
package com.argprograma.backend.service;

import com.argprograma.backend.model.Experiencia;
import java.util.List;


public interface IExperienciaService {
    public List<Experiencia> findAllExperiencia();
    public void createExperiencia (Experiencia expe);
    public void updateExperiencia (Experiencia expe);
    public void deleteExperiencia (Long id);
    public Experiencia findExperiencia(Long id);
}
