
package com.argprograma.backend.controller;

import com.argprograma.backend.model.Proyecto;
import com.argprograma.backend.service.IProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
@RequestMapping("proyecto")
public class ProyectoController {
    
    @Autowired
    private IProyectoService proyServ;
    
    @GetMapping ("/all")
    public ResponseEntity<List<Proyecto>> findAllProyecto(){
        List<Proyecto> proyectos=proyServ.findAllProyecto();
        return new ResponseEntity(proyectos, HttpStatus.OK);
    }
    
    @PostMapping ("/new")
    public ResponseEntity<?> createProyecto (@RequestBody Proyecto proy){
        proyServ.createProyecto(proy);
        return new ResponseEntity(HttpStatus.CREATED);
    }
    
    @GetMapping ("/educacion/ver/{id}")
    public ResponseEntity<Proyecto> findProyecto (@PathVariable Long id){
       Proyecto proyecto= proyServ.findProyecto(id);
       return new ResponseEntity<>(proyecto, HttpStatus.OK);
    }
    
    @PutMapping ("/edit")
    public ResponseEntity<?> updateProyecto (@RequestBody Proyecto proy){
        proyServ.updateProyecto(proy);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @DeleteMapping ("/delete/{id}")
    public ResponseEntity<?> deleteProyecto (@PathVariable Long id){
        proyServ.deleteProyecto(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }  
}
