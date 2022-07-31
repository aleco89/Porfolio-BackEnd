
package com.argprograma.backend.controller;

import com.argprograma.backend.model.Educacion;
import com.argprograma.backend.service.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
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
@CrossOrigin(origins={"http://localhost:4200","https://argprograma-c17ae.web.app"})
@RequestMapping("educacion")
public class EducacionController {
    
    @Autowired
    private IEducacionService eduServ;
    
    @GetMapping ("/all")
    public ResponseEntity<List<Educacion>> findAllEducacion(){
        List<Educacion> educaciones=eduServ.findAllEducacion();
        return new ResponseEntity(educaciones, HttpStatus.OK);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/new")
    public ResponseEntity<?> createEducacion (@RequestBody Educacion edu){
        eduServ.createEducacion(edu);
        return new ResponseEntity(HttpStatus.CREATED);
    }
    
    @GetMapping ("/ver/{id}")
    public ResponseEntity<Educacion> findEducacion (@PathVariable Long id){
       Educacion educacion= eduServ.findEducacion(id);
       return new ResponseEntity<>(educacion, HttpStatus.OK);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("/edit")
    public ResponseEntity<?> updateEducacion (@RequestBody Educacion edu){
        eduServ.updateEducacion(edu);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/delete/{id}")
    public ResponseEntity<?> deleteEducacion (@PathVariable Long id){
        eduServ.deleteEducacion(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }      
    
    
}
