package com.portafolio.porf.service;

import com.portafolio.porf.entity.sobremi;
import com.portafolio.porf.repository.sobremiRepo;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class sobremiServi {

    @Autowired
    public sobremiRepo miRepo;
    
    public List<sobremi> versobremis() {
        List<sobremi>listasobremis=miRepo.findAll();
        return listasobremis;
    }
    
    public sobremi buscarsobremi(int id) {
        sobremi mis = miRepo.findById(id).orElse(null);
         return mis;
    }
    
    public void crearsobremi(sobremi mis) {
    miRepo.save(mis);
    }
    
    public void borrarsobremi(int id) {
        miRepo.deleteById(id);
    }
    
    public void editarsobremi(sobremi mis) {
    miRepo.save(mis);
    }
}
