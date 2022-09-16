/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elvispresley.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Clase para la gestión de canciones
 * @author Julian Chacon
 */
//
@Entity(name = "tcanciones")
public class Cancion {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;
    
    @Column(name = "duracion", length = 5, nullable = false)
    private String duracion;
    
    @Column(name = "link", length = 200, nullable = false)
    private String link;
    
    @Column(name = "id_genero")
    private int id_genero;
    
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_genero", insertable = false, updatable = false)
    private Genero genero;


    public Cancion() {
    }

    public Cancion(int id, String nombre, String duracion, String link) {
        this.id = id;
        this.nombre = nombre;
        this.duracion = duracion;
        this.link = link;
    }

   
    public Cancion(String nombre, String duracion, String link, int id_genero) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.link = link;
        this.id_genero = id_genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "Cancion{" + "id=" + id + ", nombre=" + nombre + ", duracion=" + duracion + ", link=" + link + '}';
    }
    
    
}

