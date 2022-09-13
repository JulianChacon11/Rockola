/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.elvispresley.demo.Repository;

import com.elvispresley.demo.entities.Cancion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author andreastefannygarciamejia
 */

@Repository
public interface ICancionRepository extends JpaRepository<Cancion, Long>{
    
    public List <Cancion> findByCancionContaining(String nombre);
    
    
}
