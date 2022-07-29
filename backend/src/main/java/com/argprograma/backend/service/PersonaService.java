
package com.argprograma.backend.service;

import com.argprograma.backend.model.Persona;
import com.argprograma.backend.repository.PersonaRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{
   
    @Autowired
    private PersonaRepo persoRepo;
    
    @Override
    public List<Persona> findAllPersona() {
        return persoRepo.findAll();
    }

    @Override
    public void createPersona(Persona persona) {
        persoRepo.save(persona);
    }

    @Override
    public void updatePersona(Persona edu) {
        persoRepo.save(edu);
    }

    @Override
    public void deletePersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        return persoRepo.findById(id).orElse(null);
    }
   
}
