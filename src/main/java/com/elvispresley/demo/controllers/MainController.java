/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elvispresley.demo.controllers;

import com.elvispresley.demo.services.CancionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Julian Chacon
 */
@Controller
public class MainController {
    
    private CancionService servicio;
    @GetMapping("/")
    public String cargarPaginaPrincipal(){
        return "index";
        }
    @GetMapping("/login")
    public String iniciarSesión(){
        return "login";
        }
    
    @GetMapping("/registro")
    public String registro(){
        return "registro";
        }
    @GetMapping("/catrock")
    public String Rock(Model rock){
        rock.addAttribute("/catrock", servicio.getCancionByGenero(4));
        return "/catrock";
    } 
    @GetMapping("/catpop")
    public String Pop(Model pop){
        pop.addAttribute("/catpop", servicio.getCancionByGenero(1));
        return "catpop";
        }
    @GetMapping("/catelec")
    public String Electronica(Model elec){
        elec.addAttribute("/catelec", servicio.getCancionByGenero(2));
        return "catelec";
        }
    @GetMapping("/catragg")
    public String Raggetton(Model ragg){
        ragg.addAttribute("/catragg", servicio.getCancionByGenero(3));
        return "catragg";
        }
    }

