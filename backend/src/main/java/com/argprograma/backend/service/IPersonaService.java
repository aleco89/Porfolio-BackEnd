
package com.argprograma.backend.service;

import com.argprograma.backend.model.Persona;
import java.util.List;


public interface IPersonaService {
    public List<Persona> findAllPersona();
    public void createPersona (Persona persona);
    public void updatePersona (Persona persona);
    public void deletePersona (Long id);
    public Persona findPersona(Long id);
}
