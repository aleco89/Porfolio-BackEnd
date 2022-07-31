
package com.argprograma.backend.service;

import com.argprograma.backend.model.Skill;
import com.argprograma.backend.repository.SkillRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService implements ISkillService{
    
    @Autowired
    private SkillRepo skRepo;
    
    @Override
    public List<Skill> findAllSkill() {
        return skRepo.findAll();
    }

    @Override
    public void createSkill(Skill skill) {
        skRepo.save(skill);
    }

    @Override
    public void updateSkill(Skill skill) {
        Skill sk=findSkill(skill.getId());
        sk.setSkill(skill.getSkill());
        sk.setPorcentaje(skill.getPorcentaje());
        skRepo.save(sk);
    }

    @Override
    public void deleteSkill(Long id) {
        skRepo.deleteById(id);
    }

    @Override
    public Skill findSkill(Long id) {
        return skRepo.findById(id).orElse(null);
    }
  
}
