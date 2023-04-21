package com.portafolio.porf.repository;

import com.portafolio.porf.entity.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepo extends JpaRepository <Persona, Integer> {

    public List<Persona> findByEmailAndClave(String email, String clave);
    //se pueden declarar metodos extras
    
}
