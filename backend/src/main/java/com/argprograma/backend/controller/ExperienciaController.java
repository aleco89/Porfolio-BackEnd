/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argprograma.backend.controller;

import com.argprograma.backend.model.Experiencia;
import com.argprograma.backend.service.IExperienciaService;
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
@RequestMapping("experiencia")
public class ExperienciaController {
    @Autowired
    private IExperienciaService expeServ;
    
    @GetMapping ("/all")
    public ResponseEntity<List<Experiencia>> findAllExperiencia(){
        List<Experiencia> experiencias=expeServ.findAllExperiencia();
        return new ResponseEntity(experiencias, HttpStatus.OK);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/new")
    public ResponseEntity<?> createExperiencia (@RequestBody Experiencia expe){
        expeServ.createExperiencia(expe);
        return new ResponseEntity(HttpStatus.CREATED);
    }
    
    @GetMapping ("/ver/{id}")
    public ResponseEntity<Experiencia> findExperiencia (@PathVariable Long id){
       Experiencia experiencia= expeServ.findExperiencia(id);
       return new ResponseEntity<>(experiencia, HttpStatus.OK);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("/edit")
    public ResponseEntity<?> updateExperiencia (@RequestBody Experiencia expe){
        expeServ.updateExperiencia(expe);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/delete/{id}")
    public ResponseEntity<?> deleteExperiencia (@PathVariable Long id){
        expeServ.deleteExperiencia(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }  
}
