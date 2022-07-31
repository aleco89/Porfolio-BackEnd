
package com.argprograma.backend.service;

import com.argprograma.backend.model.Experiencia;
import com.argprograma.backend.repository.ExperienciaRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{
    @Autowired
    private ExperienciaRepo expeRepo;
    
    @Override
    public List<Experiencia> findAllExperiencia() {
        return expeRepo.findAll();
    }

    @Override
    public void createExperiencia(Experiencia expe) {
        expeRepo.save(expe);
    }

    @Override
    public void updateExperiencia(Experiencia expe) {
        Experiencia experiencia=findExperiencia(expe.getId());
        experiencia.setTrabajo(expe.getTrabajo());
        experiencia.setDescripcionTrabajo(expe.getDescripcionTrabajo());
        experiencia.setPeriodo(expe.getPeriodo());
        experiencia.setLugar(expe.getLugar());
        experiencia.setLogo(expe.getLogo());
        expeRepo.save(experiencia);
    }

    @Override
    public void deleteExperiencia(Long id) {
        expeRepo.deleteById(id);
    }

    @Override
    public Experiencia findExperiencia(Long id) {
        return expeRepo.findById(id).orElse(null);
    }
}
