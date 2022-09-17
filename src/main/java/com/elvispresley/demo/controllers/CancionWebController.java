/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.elvispresley.demo.controllers;

import com.elvispresley.demo.entities.Cancion;
import com.elvispresley.demo.entities.Genero;
import com.elvispresley.demo.repositories.ICancionRepository;
import com.elvispresley.demo.services.CancionService;
import com.elvispresley.demo.services.GeneroService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author andreastefannygarciamejia
 */
@RestController
public class CancionWebController {
    @Autowired
    private ICancionRepository repository;
    
    @Autowired
    private CancionService servicio;
    
    @Autowired
    private GeneroService service;
    
    @GetMapping("/api/catrock")
    private ResponseEntity<List<Cancion>> getCancionByGeneroRock(){
        Genero genero = service.getGeneroById(1).get(0);
        return new ResponseEntity<>(servicio.getCancionByGenero(genero), HttpStatus.OK);   
    }
    
    @GetMapping("/api/catpop")
    private ResponseEntity<List<Cancion>> getCancionByGeneroPop(){
        Genero genero = service.getGeneroById(2).get(0);
        return new ResponseEntity<>(servicio.getCancionByGenero(genero), HttpStatus.OK);
    }
    
    @GetMapping("/api/catelec")
    private ResponseEntity<List<Cancion>> getCancionByGeneroElect(){
      Genero genero = service.getGeneroById(4).get(0);
        return new ResponseEntity<>(servicio.getCancionByGenero(genero), HttpStatus.OK);
    }
    
    @GetMapping("/api/catragg")
    private ResponseEntity<List<Cancion>> getCancionByGeneroRagg(){
        Genero genero = service.getGeneroById(3).get(0);
        return new ResponseEntity<>(servicio.getCancionByGenero(genero), HttpStatus.OK);
    }
}
