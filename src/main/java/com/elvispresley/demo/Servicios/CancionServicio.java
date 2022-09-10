/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.elvispresley.demo.Servicios;

import com.elvispresley.demo.Repository.ICancionRepository;
import com.elvispresley.demo.entities.Cancion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author andreastefannygarciamejia
 */

@Service 
public class CancionServicio {
    
    @Autowired
    private ICancionRepository rep;
    
    public Cancion createCancion(Cancion c ){
        Cancion song = rep.save(c);
        return song;
    }
    
    public Cancion updateCancion(Cancion c){
         Cancion song = rep.save(c);
        return song;
     
    }
    
    public void deleteCancion(Cancion c){
           rep.delete(c);
    }
 
    
    public List<Cancion> searchCancion(String nombre){
        List <Cancion> listaCanciones = rep.findByCancionContaining(nombre);
        return listaCanciones;
    }
    
    public void viewCancion(Cancion c){
       
    }
   

}
