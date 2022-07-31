
package com.argprograma.backend.service;

import com.argprograma.backend.model.Proyecto;
import com.argprograma.backend.repository.ProyectoRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService{
    
    @Autowired
    private ProyectoRepo proyRepo;
    
    @Override
    public List<Proyecto> findAllProyecto() {
        return proyRepo.findAll();
    }

    @Override
    public void createProyecto(Proyecto proy) {
        proyRepo.save(proy);
    }

    @Override
    public void updateProyecto(Proyecto proy) {
        Proyecto proyecto=findProyecto(proy.getId());
        proyecto.setNombre(proy.getNombre());
        proyecto.setComitente(proy.getComitente());
        proyecto.setDescripcion(proy.getDescripcion());
        proyecto.setFoto(proy.getFoto());
        proyRepo.save(proyecto);
    }

    @Override
    public void deleteProyecto(Long id) {
        proyRepo.deleteById(id);
    }

    @Override
    public Proyecto findProyecto(Long id) {
        return proyRepo.findById(id).orElse(null);
    }
  
}
