package com.portafolio.porf.controller;

import com.portafolio.porf.entity.Red;
import com.portafolio.porf.service.RedServi;
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
@RequestMapping("red") //localhost:8080/red/
//@CrossOrigin("*")
@CrossOrigin(origins= "https://porfolioyamyla.web.app")
public class RedControl {
    
    @Autowired
    RedServi reServer;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List <Red> verRedes(){
        return reServer.verRedes();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public Red verRed(@PathVariable int id){
        return reServer.buscarRed(id);
    }
    
    @PostMapping ("/crear")
    public String agregaRed(@RequestBody Red res) {
        reServer.crearRed(res);
        return "La red social fue creada con exito";
    }
    
    @DeleteMapping ("/borrar/{id}")
     public String eliminarRed(@PathVariable int id){
        reServer.borrarRed(id);
        return "La red social fue eliminada con exito";
    }
    
    @PutMapping ("/editar")
     public String modiicarRed(@RequestBody Red res){
        reServer.editarRed(res);
        return "La red social fue editado con exito";
    }
}
