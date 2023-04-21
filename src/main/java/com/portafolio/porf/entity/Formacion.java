package com.portafolio.porf.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Formacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String institucion;
    private String logo;
    private String fechainicio;
    private String fechafinal;
    private String descripcion;

    public Formacion() {
    }

    public Formacion(String institucion, String logo, String fechainicio, String fechafinal, String descripcion) {
        this.institucion = institucion;
        this.logo = logo;
        this.fechainicio = fechainicio;
        this.fechafinal = fechafinal;
        this.descripcion = descripcion;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }
    
     public String getlogo() {
        return logo;
    }

    public void setlogo(String logo) {
        this.logo = logo;
    }
    
     public String getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(String fechainicio) {
        this.fechainicio = fechainicio;
    }
    
    public String getFechafinal() {
        return fechafinal;
    }

    public void setFechafinal(String fechafinal) {
        this.fechafinal = fechafinal;
    }  
    
     public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }  
}
