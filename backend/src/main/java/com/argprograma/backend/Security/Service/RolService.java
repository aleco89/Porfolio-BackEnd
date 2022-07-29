
package com.argprograma.backend.Security.Service;

import com.argprograma.backend.Security.Entity.Rol;
import com.argprograma.backend.Security.Enums.RolNombre;
import com.argprograma.backend.Security.Repository.IRolRepo;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    private IRolRepo rolRepo;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return rolRepo.findByRolNombre(rolNombre);
    }
    public void save(Rol rol){
        rolRepo.save(rol);
    }
}
