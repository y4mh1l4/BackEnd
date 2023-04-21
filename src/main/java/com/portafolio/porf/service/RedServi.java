package com.portafolio.porf.service;

import com.portafolio.porf.entity.Red;
import com.portafolio.porf.repository.RedRepo;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RedServi {
    
    @Autowired
    public RedRepo reRepo;
    
    public List<Red> verRedes() {
        List<Red> listaRedes= reRepo.findAll();
        return listaRedes;
    }
    
    public Red buscarRed(int id) {
        Red re = reRepo.findById(id).orElse(null);
        return re;
    }
    
    public void crearRed(Red re) {
        reRepo.save(re);
    }
    
    public void borrarRed (int id) {
        reRepo.deleteById(id);
    }
    
    public void editarRed(Red re) {
            reRepo.save(re);
    } 
}
