
package com.argprograma.backend.service;

import com.argprograma.backend.model.Idioma;
import java.util.List;


public interface IIdiomaService {
    public List<Idioma> findAllIdioma();
    public void createIdioma (Idioma idioma);
    public void updateIdioma (Idioma idioma);
    public void deleteIdioma (Long id);
    public Idioma findIdioma(Long id);
}
