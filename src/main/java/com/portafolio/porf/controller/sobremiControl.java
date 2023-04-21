package com.portafolio.porf.controller;

import com.portafolio.porf.entity.sobremi;
import com.portafolio.porf.service.sobremiServi;
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
@RequestMapping ("sobremi") //localhost:8080/sobremi/
//@CrossOrigin ("*")
@CrossOrigin(origins= "https://porfolioyamyla.web.app")
public class sobremiControl {
    
    @Autowired
    sobremiServi miServer;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List <sobremi> versobremis(){
        return miServer.versobremis();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public sobremi versobremi(@PathVariable int id){
        return miServer.buscarsobremi(id);
    }
    
    @PostMapping ("/crear")
    public String agregarsobremi(@RequestBody sobremi mi) {
        miServer.crearsobremi(mi);
        return "Sobre mi fue creada correctamente";
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String eliminarsobremi(@PathVariable int id){
        miServer.borrarsobremi(id);
        return "Sobre mi fue borrada correctamente";
    }
    
    @PutMapping ("/editar")
    public String modificarsobremi(@RequestBody sobremi mi){
        miServer.editarsobremi(mi);
        return "Sobre mi fue editada correctamente";
    }   
}
