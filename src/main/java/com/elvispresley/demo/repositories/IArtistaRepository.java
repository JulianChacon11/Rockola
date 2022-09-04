/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elvispresley.demo.repositories;

import com.elvispresley.demo.entities.Artista;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *Interfaz para el repositorio de artistas
 * @author Julian Chacon
 */
public interface IArtistaRepository extends JpaRepository<Artista, Integer> {
    
    public List<Artista> findArtistaByNombreContaining(String nombre);
}
