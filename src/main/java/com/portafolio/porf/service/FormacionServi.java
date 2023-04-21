package com.portafolio.porf.service;

import com.portafolio.porf.entity.Formacion;
import com.portafolio.porf.repository.FormacionRepo;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class FormacionServi {
    @Autowired
    public FormacionRepo forsRepo;
    
    public List<Formacion> verFormaciones() {
        List<Formacion>listaFormaciones= forsRepo.findAll();
        return listaFormaciones;
    }
    
    public Formacion buscarFormacion(int id) {
        //si no encuentra la persona devuelve nulo (null)
        Formacion fors = forsRepo.findById(id).orElse(null);
        return fors;
    }
    
    public void crearFormacion(Formacion fors) {
    forsRepo.save(fors);
    }
    
    public void borrarFormacion(int id) {
        forsRepo.deleteById(id);
    }
    
    public void editarFormacion(Formacion fors) {
    forsRepo.save(fors);
    }  

    public void cambiarFormacion(Formacion form) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
