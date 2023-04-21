package com.portafolio.porf.service;

import com.portafolio.porf.entity.Habilidad;
import com.portafolio.porf.repository.HabilidadRepo;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class HabilidadServi {
    @Autowired
    public HabilidadRepo skillRepo;
    
    public List<Habilidad> verHabilidades() {
        List<Habilidad>listaHabilidades= skillRepo.findAll();
        return listaHabilidades;
    }
    
    public Habilidad buscarHabilidad(int id) {
        //si no encuentra la persona devuelve nulo (null)
        Habilidad skill = skillRepo.findById(id).orElse(null);
        return skill;
    }
    
    public void crearHabilidad(Habilidad skill) {
    skillRepo.save(skill);
    }
    
    public void borrarHabilidad(int id) {
        skillRepo.deleteById(id);
    }
    
    public void editarHabilidad(Habilidad skill) {
    skillRepo.save(skill);
    }

}
