package com.portafolio.porf.controller;

import com.portafolio.porf.entity.Formacion;
import com.portafolio.porf.service.FormacionServi;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("formacion") //localhost:8080/formacion/
//@CrossOrigin("*")
@CrossOrigin(origins= "https://porfolioyamyla.web.app")
public class FormacionControl {
    
    @Autowired
    FormacionServi formarServer;
    
    @GetMapping ("/lista")
    @ResponseBody
     public List <Formacion> verFormaciones(){
        return formarServer.verFormaciones();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public Formacion verFormacion(@PathVariable int id){
        return formarServer.buscarFormacion(id);
    }
    
    @PostMapping ("/crear")
    public String agregrarFormacion (@RequestBody Formacion form){
      formarServer.crearFormacion(form);
        return "La Formacion fue creada correctamente";  
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String eliminarFormacion(@PathVariable int id){
        formarServer.borrarFormacion(id);
        return "La Formacion fue borrada correctamente";
    }
    
    @PutMapping ("/editar")
    public String modificarFormacion(@RequestBody Formacion form){
        formarServer.editarFormacion(form);
        return "La Formacion fue editada correctamente";
    }  
}
