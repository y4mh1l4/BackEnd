package com.portafolio.porf.controller;

import com.portafolio.porf.entity.Capacitacion;
import com.portafolio.porf.service.CapacitacionServi;
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
@RequestMapping ("capacitacion") //localhost:8080/capacitacion/
//@CrossOrigin("*")
@CrossOrigin(origins= "https://porfolioyamyla.web.app")
public class CapacitacionControl {
    @Autowired
    CapacitacionServi capaSever;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List <Capacitacion> verCapacitaciones(){
        return capaSever.verCapacitaciones();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public Capacitacion verCapacitacion(@PathVariable int id){
        return capaSever.buscarCapacitacion(id);
    }
    
    @PostMapping ("/crear")
    public String agregarCapacitacion(@RequestBody Capacitacion curso) {
        capaSever.crearCapacitacion(curso);
        return "El curso fue creada correctamente";
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String eliminarCapacitacion(@PathVariable int id){
        capaSever.borrarCapacitacion(id);
        return "El curso fue borrada correctamente";
    }
    
    @PutMapping("/editar")
    public String modificarCapacitacion(@RequestBody Capacitacion curso){
        capaSever.editarCapacitacion(curso);
        return "El curso fue editada correctamente";
    }  
}
