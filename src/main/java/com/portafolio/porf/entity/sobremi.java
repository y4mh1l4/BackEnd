package com.portafolio.porf.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class sobremi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titulo;
    
    @Lob
    @Column(length=1000)
    private String contenido;

    public sobremi() {
    }

    public sobremi(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
    }
    
     public int getId() {
        return id;
    }
    
     public void setId(int id) {
        this.id = id;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public  String getContenido() {
        return contenido;
    }
    
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

}
