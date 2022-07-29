
package com.argprograma.backend.Security.Service;

import com.argprograma.backend.Security.Entity.Usuario;
import com.argprograma.backend.Security.Repository.IUsuarioRepo;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    private IUsuarioRepo usuarioRepo;

    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return usuarioRepo.findByNombreUsuario(nombreUsuario);
    }
    public void save(Usuario usuario){
        usuarioRepo.save(usuario);
    }
    
    public boolean existsByEmail(String email){
        return usuarioRepo.existsByEmail(email);
    }
    
    public boolean existsByNombreUsuario(String nombreUsuario){
        return usuarioRepo.existsByNombreUsuario(nombreUsuario);
    }
    
}
