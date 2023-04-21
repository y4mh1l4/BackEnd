package com.portafolio.porf.repository;

import com.portafolio.porf.entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepo extends JpaRepository <Proyecto, Integer> {
    
}
