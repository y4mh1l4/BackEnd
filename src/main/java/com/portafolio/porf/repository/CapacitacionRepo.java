package com.portafolio.porf.repository;

import com.portafolio.porf.entity.Capacitacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CapacitacionRepo extends JpaRepository <Capacitacion, Integer> {
    
}
