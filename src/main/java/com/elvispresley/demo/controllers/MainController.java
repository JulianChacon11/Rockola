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
        rock.addAttribute("CategoriaRock", servicio.getAllCanciones());
        return "catrock";
        }
    @GetMapping("/catpop")
    public String Pop(){
        return "catpop";
        }
    @GetMapping("/catelec")
    public String Electronica(){
        return "catelec";
        }
    @GetMapping("/catragg")
    public String Raggetton(){
        return "catragg";
        }
    }

