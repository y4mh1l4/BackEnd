
package com.portafolio.porf.service;

import com.portafolio.porf.entity.Proyecto;
import com.portafolio.porf.repository.ProyectoRepo;
import jakarta.transaction.Transactional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Transactional
public class ProyectoServi {
    
    @Autowired
    public ProyectoRepo proRepo;

   public List<Proyecto> verProyectos() {
        List<Proyecto>listaProyectos= proRepo.findAll();
        return listaProyectos;
    }
    public Proyecto buscarProyecto(int id) {
        //si no encuentra la persona devuelve nulo (null)
        Proyecto pro = proRepo.findById(id).orElse(null);
        return pro;
    }
    
    public void crearProyecto(Proyecto pro) {
    proRepo.save(pro);
    }
    
    public void borrarProyecto(int id) {
        proRepo.deleteById(id);
    }
    
    public void editarProyecto(Proyecto pro) {
    proRepo.save(pro);
    } 
}
