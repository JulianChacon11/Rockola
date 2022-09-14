/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elvispresley.demo.repositories;

import com.elvispresley.demo.entities.Cancion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *Interfaz para el repositorio de canciones
 * @author Julian Chacon
 */
@Repository
public interface ICancionRepository extends JpaRepository<Cancion, Integer>{
    
    public List<Cancion> findCancionByContaining(String nombre);
}
