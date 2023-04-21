package com.portafolio.porf.repository;

import com.portafolio.porf.entity.Red;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedRepo extends JpaRepository <Red, Integer> {
 
}
