
package com.argprograma.backend.controller;

import com.argprograma.backend.model.Idioma;
import com.argprograma.backend.service.IIdiomaService;
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
@RequestMapping("idioma")
public class IdiomaController {
    
    @Autowired
    private IIdiomaService idiServ;
    
    @GetMapping ("/all")
    public ResponseEntity<List<Idioma>> findAllIdioma(){
        List<Idioma> idiomas=idiServ.findAllIdioma();
        return new ResponseEntity(idiomas, HttpStatus.OK);
    }
    
    @PostMapping ("/new")
    public ResponseEntity<?> createIdioma (@RequestBody Idioma idioma){
        idiServ.createIdioma(idioma);
        return new ResponseEntity(HttpStatus.CREATED);
    }
    
    @GetMapping ("/educacion/ver/{id}")
    public ResponseEntity<Idioma> findIdioma (@PathVariable Long id){
       Idioma educacion= idiServ.findIdioma(id);
       return new ResponseEntity<>(educacion, HttpStatus.OK);
    }
    
    @PutMapping ("/edit")
    public ResponseEntity<?> updateIdioma (@RequestBody Idioma idioma){
        idiServ.updateIdioma(idioma);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @DeleteMapping ("/delete/{id}")
    public ResponseEntity<?> deleteIdioma (@PathVariable Long id){
        idiServ.deleteIdioma(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }  
}
