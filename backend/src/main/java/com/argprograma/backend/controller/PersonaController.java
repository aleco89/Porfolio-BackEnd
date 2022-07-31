
package com.argprograma.backend.controller;

import com.argprograma.backend.model.Persona;
import com.argprograma.backend.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("persona")
public class PersonaController {
    @Autowired
    private IPersonaService persoServ;
    
    @GetMapping ("/all")
    public ResponseEntity<List<Persona>> findAllPersona(){
        List<Persona> personas=persoServ.findAllPersona();
        return new ResponseEntity(personas, HttpStatus.OK);
    }
    
    @PostMapping ("/new")
    public ResponseEntity<?> createPersona (@RequestBody Persona persona){
        persoServ.createPersona(persona);
        return new ResponseEntity(HttpStatus.CREATED);
    }
    
    @GetMapping ("/ver/{id}")
    public ResponseEntity<Persona> findPersona (@PathVariable Long id){
       Persona persona= persoServ.findPersona(id);
       return new ResponseEntity<>(persona, HttpStatus.OK);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("/edit")
    public ResponseEntity<?> updatePersona (@RequestBody Persona persona){
        persoServ.updatePersona(persona);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @DeleteMapping ("/delete/{id}")
    public ResponseEntity<?> deletePersona (@PathVariable Long id){
        persoServ.deletePersona(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }  
}
