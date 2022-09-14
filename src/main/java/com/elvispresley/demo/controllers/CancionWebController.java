/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.elvispresley.demo.controllers;

import com.elvispresley.demo.entities.Cancion;
import com.elvispresley.demo.repositories.ICancionRepository;
import com.elvispresley.demo.services.CancionService;
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
    private CancionService service;
    
    @GetMapping("/api/catrock")
    private ResponseEntity<List<Cancion>> getCancionByGeneroRock(){
        return new ResponseEntity<>(service.getAllCanciones(), HttpStatus.OK);   
    }
    
    @GetMapping("/api/catpop")
    private ResponseEntity<List<Cancion>> getCancionByGeneroPop(){
        return new ResponseEntity<>(service.getAllCanciones(), HttpStatus.OK);
    }
    
    @GetMapping("/api/catelec")
    private ResponseEntity<List<Cancion>> getCancionByGeneroElect(){
        return new ResponseEntity<>(service.getAllCanciones(), HttpStatus.OK);
    }
    
    @GetMapping("/api/catragg")
    private ResponseEntity<List<Cancion>> getCancionByGeneroRagg(){
        return new ResponseEntity<>(service.getAllCanciones(), HttpStatus.OK);
    }
}
