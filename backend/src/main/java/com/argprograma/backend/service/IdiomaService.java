
package com.argprograma.backend.service;

import com.argprograma.backend.model.Idioma;
import com.argprograma.backend.repository.IdiomaRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdiomaService implements IIdiomaService{
    @Autowired
    private IdiomaRepo idiRepo;
    
    @Override
    public List<Idioma> findAllIdioma() {
        return idiRepo.findAll();
    }

    @Override
    public void createIdioma(Idioma idioma) {
        idiRepo.save(idioma);
    }

    @Override
    public void updateIdioma(Idioma idioma) {
        Idioma idi=findIdioma(idioma.getId());
        idi.setIdioma(idioma.getIdioma());
        idi.setNivel(idioma.getNivel());
        idiRepo.save(idi);
    }

    @Override
    public void deleteIdioma(Long id) {
        idiRepo.deleteById(id);
    }

    @Override
    public Idioma findIdioma(Long id) {
        return idiRepo.findById(id).orElse(null);
    }
}
