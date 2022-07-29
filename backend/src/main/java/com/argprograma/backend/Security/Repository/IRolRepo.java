
package com.argprograma.backend.Security.Repository;

import com.argprograma.backend.Security.Entity.Rol;
import com.argprograma.backend.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;



public interface IRolRepo extends JpaRepository <Rol, Long>{
    Optional<Rol>findByRolNombre(RolNombre rolNombre);
}
