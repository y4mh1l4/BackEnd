package com.portafolio.porf.controller;

import com.portafolio.porf.entity.Experiencia;
import com.portafolio.porf.service.ExperienciaServi;
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
@RequestMapping ("experiencia") //localhost:8080/experiencia/
//@CrossOrigin("*")
@CrossOrigin(origins= "https://porfolioyamyla.web.app")
public class ExperienciaControl {
    
    @Autowired
    ExperienciaServi expeServ;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List <Experiencia> verExperiencias(){
        return expeServ.verExperincias();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public Experiencia verExperiencia(@PathVariable int id){
        return expeServ.buscarExperiencia(id);
    }
    
    @PostMapping ("/crear")
    public String agregarExperiencia(@RequestBody Experiencia expe) {
        expeServ.crearExperiencia(expe);
        return "Experiencia fue creado correctamente";
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String eliminaExperiencia(@PathVariable int id){
        expeServ.borrarExperiencia(id);
        return "Experiencia fue borrada correctamente";
    }
    
    @PutMapping ("/editar")
    public String modificarExperiencia(@RequestBody Experiencia expe){
        expeServ.editarExperiencia(expe);
        return "Experiencia fue editada correctamente";
    }
}
