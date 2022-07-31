
package com.argprograma.backend.controller;

import com.argprograma.backend.model.Skill;
import com.argprograma.backend.service.ISkillService;
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
@RequestMapping("skill")
public class SkillController {
    
    @Autowired
    private ISkillService skServ;
    
    @GetMapping ("/all")
    public ResponseEntity<List<Skill>> findAllSkill(){
        List<Skill> skills=skServ.findAllSkill();
        return new ResponseEntity(skills, HttpStatus.OK);
    }
    
    @PostMapping ("/new")
    public ResponseEntity<?> createSkill (@RequestBody Skill skill){
        skServ.createSkill(skill);
        return new ResponseEntity(HttpStatus.CREATED);
    }
    
    @GetMapping ("/ver/{id}")
    public ResponseEntity<Skill> findSkill (@PathVariable Long id){
       Skill skill= skServ.findSkill(id);
       return new ResponseEntity<>(skill, HttpStatus.OK);
    }
    
    @PutMapping ("/edit")
    public ResponseEntity<?> updateSkill (@RequestBody Skill skill){
        skServ.updateSkill(skill);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @DeleteMapping ("/delete/{id}")
    public ResponseEntity<?> deleteSkill (@PathVariable Long id){
        skServ.deleteSkill(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }  
}
