package com.portafolio.porf.repository;

import com.portafolio.porf.entity.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadRepo extends JpaRepository <Habilidad, Integer>{
    
}
