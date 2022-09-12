/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elvispresley.demo.services;

import com.elvispresley.demo.entities.Cancion;
import com.elvispresley.demo.entities.Genero;
import com.elvispresley.demo.repositories.ICancionRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Clase para los servicios de la clase Cancion
 * @author Julian Chacon
 */
@Service
public class CancionService {
    
    @Autowired
    private ICancionRepository cancionRepository;
    
    public Cancion addCancion(Cancion c){
        Cancion cancion = cancionRepository.save(c);
        return cancion;
    }
    
    public Cancion updateCancion(Cancion c){
        Cancion cancion = cancionRepository.save(c);
        return cancion;
    }
    
    public List<Cancion> getAllCanciones(){
        List<Cancion> canciones = cancionRepository.findAll();
        return canciones;
    }
    public Cancion viewCancion(int id){
       Cancion c = cancionRepository.findById(id).get();
       return c;
    }
    
    public List<Cancion> getCancionByNombre(String nombre){
        List<Cancion> canciones = cancionRepository.findCancionByNombreContaining(nombre);
        return canciones;
    }
    
     public List<Cancion> getCancionByGenero(Integer id){
        List<Cancion> canciones = cancionRepository.findCancionByGeneroContaining(id);
        return canciones;
    }
    public void deleteCancion(Cancion c){
        cancionRepository.deleteById(c.getId());
    }
}
