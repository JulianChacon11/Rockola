/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elvispresley.demo.entities;

/**
 * Clase para la gestión de canciones
 * @author julian chacon
 */
public class Cancion {
    private Long id;
    private String nombre;
    private String artista;
    private String genero;
    private String duracion;
    private String link;

    public Cancion(String nombre, String artista, String duracion, String link) {
        this.nombre = nombre;
        this.artista = artista;
        this.duracion = duracion;
        this.link = link;
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
        return "Cancion{" + "id=" + id + ", nombre=" + nombre + ", artista=" + artista + ", genero=" + genero + ", duracion=" + duracion + ", link=" + link + '}';
    }
    
    
    public void addToPlayList(){
        System.out.println("Añadida a la playlist");
    }
    
    public void createCancion(){
        System.out.println("Canción creada");
    }
    
    public String viewCancion(Long idCancion){
        return "Mostrando cancion";
    }
    
    public Cancion updateCancion(Cancion cancion){
        System.out.println("Canción actualizada");
        return cancion;
    }
    
    public Boolean deleteCancion(Long idCancion){
        System.out.println("Canción eliminada");
        return true;
    }
}

