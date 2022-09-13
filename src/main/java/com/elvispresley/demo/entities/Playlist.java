/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.elvispresley.demo.entities;

import java.util.List;

/**
 *
 * @author andreastefannygarciamejia
 */
class Playlist {
    
    private int id;
    private String name;
    private List<Cancion> cancion;
    private int idClient;
    //private int duracion;

    public Playlist() {
    }

    public Playlist(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Playlist(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Cancion> getCanciones() {
        return cancion;
    }

    public void setCanciones(List<Cancion> canciones) {
        this.cancion = canciones;
    }

    /*
    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    */
    
}

