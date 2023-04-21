
package com.portafolio.porf.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Capacitacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
    private String imagen;
    private String fecha;
    private String curso;

    public Capacitacion() {
    }

    public Capacitacion(String imagen, String fecha, String Curso) {
        this.imagen = imagen;
        this.fecha = fecha;
        this.curso = Curso;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }  
}
