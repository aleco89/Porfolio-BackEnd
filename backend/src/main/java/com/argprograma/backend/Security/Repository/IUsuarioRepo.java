
package com.argprograma.backend.Security.Repository;

import com.argprograma.backend.Security.Entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;



public interface IUsuarioRepo extends JpaRepository <Usuario, Long>{
    Optional<Usuario>findByNombreUsuario (String nombreUsuario);
    boolean existsByNombreUsuario(String nombreUsuario);
    boolean existsByEmail(String email);
    
}
