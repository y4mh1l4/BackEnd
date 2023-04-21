package com.portafolio.porf.service;

import com.portafolio.porf.entity.Experiencia;
import com.portafolio.porf.repository.ExperienciaRepo;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class ExperienciaServi {
    
    @Autowired
    public ExperienciaRepo expeRepo;
    
    public List<Experiencia> verExperincias() {
        List<Experiencia>listaExperiencias= expeRepo.findAll();
        return listaExperiencias;
    } 
    
    public Experiencia buscarExperiencia(int id) {
        //si no encuentra la persona devuelve nulo (null)
        Experiencia expe = expeRepo.findById(id).orElse(null);
        return expe;
    }
    
     public void crearExperiencia(Experiencia expe) {
    expeRepo.save(expe);
    }
     
    public void borrarExperiencia(int id) {
        expeRepo.deleteById(id);
    }
    
    public void editarExperiencia(Experiencia expe) {
    expeRepo.save(expe);
    }  

}
