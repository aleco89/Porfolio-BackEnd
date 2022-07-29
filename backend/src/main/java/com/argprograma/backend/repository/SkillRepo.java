
package com.argprograma.backend.repository;

import com.argprograma.backend.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SkillRepo extends JpaRepository <Skill, Long>{
    
}
