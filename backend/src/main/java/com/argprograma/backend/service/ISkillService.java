
package com.argprograma.backend.service;

import com.argprograma.backend.model.Skill;
import java.util.List;


public interface ISkillService {
    public List<Skill> findAllSkill();
    public void createSkill (Skill skill);
    public void updateSkill (Skill skill);
    public void deleteSkill (Long id);
    public Skill findSkill(Long id);
}
