
package com.portafolio.porf.controller;

import com.portafolio.porf.entity.Proyecto;
import com.portafolio.porf.service.ProyectoServi;
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
@RequestMapping ("proyecto") //localhost:8080/proyecto/
//@CrossOrigin("*")
@CrossOrigin(origins= "https://porfolioyamyla.web.app")
public class ProyectoControl {
    
    @Autowired
    ProyectoServi proServer;
    
     @GetMapping ("/lista")
    @ResponseBody
     public List <Proyecto> verProyectos(){
        return proServer.verProyectos();
    }
     
     @GetMapping ("/ver/{id}")
     @ResponseBody
      public Proyecto verProyecto(@PathVariable int id){
        return proServer.buscarProyecto(id);
    }
      
      @PostMapping ("/crear")
      @ResponseBody
      public String agregarProyecto(@RequestBody Proyecto pro) {
        proServer.crearProyecto(pro);
        return "El proyecto fue creada correctamente";
    }
      
      @DeleteMapping ("/borrar/{id}")
      public String eliminarProyecto(@PathVariable int id){
        proServer.borrarProyecto(id);
        return "El proyecto fue borrada correctamente";
    }
      @PutMapping ("/editar")
      public String modificarProyecto(@RequestBody Proyecto pro){
        proServer.editarProyecto(pro);
        return "El proyecto fue editada correctamente";
    }
    
}
