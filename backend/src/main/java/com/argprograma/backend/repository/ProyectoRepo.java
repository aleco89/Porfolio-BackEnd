
package com.argprograma.backend.repository;

import com.argprograma.backend.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProyectoRepo extends JpaRepository<Proyecto, Long>{
    
}
