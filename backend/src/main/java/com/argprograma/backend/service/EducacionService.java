
package com.argprograma.backend.service;

import com.argprograma.backend.model.Educacion;
import com.argprograma.backend.repository.EducacionRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService{

    @Autowired
    private EducacionRepo eduRepo;
    
    @Override
    public List<Educacion> findAllEducacion() {
        return eduRepo.findAll();
    }

    @Override
    public void createEducacion(Educacion edu) {
        eduRepo.save(edu);
    }

    @Override
    public void updateEducacion(Educacion edu) {
        eduRepo.save(edu);
    }

    @Override
    public void deleteEducacion(Long id) {
        eduRepo.deleteById(id);
    }

    @Override
    public Educacion findEducacion(Long id) {
        return eduRepo.findById(id).orElse(null);
    }
    
}
