package com.portafolio.porf.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class Red {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
   private String usuario;
   private String icono;

  
    public int getId() {
        return id;
    }
    
     public void setId(int id) {
        this.id = id;
    }
     
     public String getusuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }   
    
    public String geticono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }   
}
