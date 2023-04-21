package com.portafolio.porf.repository;

import com.portafolio.porf.entity.sobremi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface sobremiRepo  extends JpaRepository <sobremi, Integer> {
    
}
