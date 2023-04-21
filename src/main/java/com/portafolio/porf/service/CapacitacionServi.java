package com.portafolio.porf.service;

import com.portafolio.porf.entity.Capacitacion;
import com.portafolio.porf.repository.CapacitacionRepo;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class CapacitacionServi {
    @Autowired
    public CapacitacionRepo capasRepo;
    
    public List<Capacitacion> verCapacitaciones() {
        List<Capacitacion>listaCapacitaciones= capasRepo.findAll();
        return listaCapacitaciones;
    }
    
    public Capacitacion buscarCapacitacion(int id) {
        //si no encuentra la persona devuelve nulo (null)
        Capacitacion capas = capasRepo.findById(id).orElse(null);
        return capas;
    }
    
    public void crearCapacitacion(Capacitacion capas) {
    capasRepo.save(capas);
    }
    
    public void borrarCapacitacion(int id) {
        capasRepo.deleteById(id);
    }
    
    public void editarCapacitacion(Capacitacion capas) {
    capasRepo.save(capas);
    } 
}
