/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elvispresley.demo.controllers;

import com.elvispresley.demo.services.CancionService;
import com.elvispresley.demo.services.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Julian Chacon
 */
//
@Controller
public class MainController {
    
    @Autowired
 private CancionService servicio;
    
    @Autowired
    
    private GeneroService service;
 
    @GetMapping("/")
    public String cargarPaginaPrincipal(){
        return "index";
        }
    @GetMapping("/login")
    public String iniciarSesion(){
        return "login";
        }
    
    @GetMapping("/registro")
    public String registro(){
        return "registro";
        }
    
    @GetMapping("/catrock")
    public String Rock(Model rock){
      rock.addAttribute("catragg", service.getAllGeneros());
      return "catrock";
    }
    @GetMapping("/catpop")
    public String Pop(Model pop){
        pop.addAttribute("/catpop", servicio.getAllCanciones());
        return "catpop";
        }
    @GetMapping("/catelec")
    public String Electronica(Model elec){
        elec.addAttribute("/catelec", servicio.getAllCanciones());
        return "catelec";
        }
    @GetMapping("/catragg")
    public String Raggetton(Model ragg){
        ragg.addAttribute("canciones", servicio.getAllCanciones());
        return "catragg";
        }
     @GetMapping("/playlist")
    public String PlayList(){
        return "playlist";
        }
    @GetMapping("/artistas")
    public String Artistas(){
        return "artistas";
        }
    @GetMapping("/generos")
    public String Generos(){
        return "generos";
        }   
    
    }

