package com.portafolio.porf.repository;

import com.portafolio.porf.entity.Formacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormacionRepo extends JpaRepository <Formacion, Integer> {
    
}
