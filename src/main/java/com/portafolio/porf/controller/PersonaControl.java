package com.portafolio.porf.controller;

import com.portafolio.porf.entity.Persona;
import com.portafolio.porf.service.PersonaServi;
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
@RequestMapping("persona") //localhost:8080/persona/
//@CrossOrigin("*")
@CrossOrigin(origins= "https://porfolioyamyla.web.app")
public class PersonaControl {
    
    @Autowired
    PersonaServi persoServ;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List <Persona> verPersonas(){
        return persoServ.verPersonas();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public Persona verPersona(@PathVariable int id){
        return persoServ.buscarPersona(id);
    }
    
    @PostMapping ("/crear")
    public String agregarPersona(@RequestBody Persona pers) {
        persoServ.crearPersona(pers);
        return "La persona fue creada correctamente";
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String eliminarPersona(@PathVariable int id){
        persoServ.borrarPersona(id);
        return "La persona fue borrada correctamente";
    }
    
    @PutMapping("/editar")
    public String modificarPersona(@RequestBody Persona pers){
        persoServ.editarPersona(pers);
        return "La persona fue editada correctamente";
    }
    
    //login
    @PostMapping ("autentication/login")
    public Persona loginPersona(@RequestBody Persona pers) {
        return persoServ.loginPersona(pers.getEmail(), pers.getClave());
    }
    
}
