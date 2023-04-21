package com.portafolio.porf.controller;

import com.portafolio.porf.entity.Habilidad;
import com.portafolio.porf.service.HabilidadServi;
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
@RequestMapping ("habilidad") //localhost:8080/habilidad/
//@CrossOrigin("*")
@CrossOrigin(origins= "https://porfolioyamyla.web.app")
public class HabilidadControl {
    
    @Autowired
    HabilidadServi habilServer;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List <Habilidad> verHabilidades(){
        return habilServer.verHabilidades();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public Habilidad verHabilidad(@PathVariable int id){
        return habilServer.buscarHabilidad(id);
    }
    
    
    @PostMapping ("/crear")
    public String agregarHabilidad(@RequestBody Habilidad habil) {
        habilServer.crearHabilidad(habil);
        return "La habilidad fue creada correctamente";
    }
    
    @DeleteMapping ("/borrar/{id}")
     public String eliminarHabilidad(@PathVariable int id){
        habilServer.borrarHabilidad(id);
        return "La habilidad fue borrada correctamente";
    }
     
    @PutMapping ("/editar")
    public String modificarHabildad(@RequestBody Habilidad habil){
        habilServer.editarHabilidad(habil);
        return "La habilidad fue editada correctamente";
    }
}
