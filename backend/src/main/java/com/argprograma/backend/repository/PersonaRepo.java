
package com.argprograma.backend.repository;

import com.argprograma.backend.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonaRepo extends JpaRepository <Persona, Long>{
    
}
