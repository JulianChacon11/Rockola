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
    
    private String name;
    private List<Cancion> cancion;
    private int duracion;

    public Playlist(String name, List<Cancion> canciones, int duracion) {
        this.name = name;
        this.cancion = canciones;
        this.duracion = duracion;
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

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
}

