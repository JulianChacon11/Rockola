/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.elvispresley.demo.entities;

import java.util.Date;

/**
 *
 * @author andreastefannygarciamejia
 */
public class Administrator extends User{
    
    private int id;
    
    public Administrator() {
    }

    public Administrator(int id, String name, String lastName, String email, Date dateOfBirth, String phone, String gender, String nationality, boolean userStatus) {
        super(name, lastName, email, dateOfBirth, phone, gender, nationality, userStatus);
        this.id = id;
    }

    public Administrator(String name, String lastName, String email, Date dateOfBirth, String phone, String gender, String nationality, boolean userStatus) {
        super(name, lastName, email, dateOfBirth, phone, gender, nationality, userStatus);
    }
    
    
    public int getId_admin() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void update_data() {
        super.update_data(); 
    }

    @Override
    public void disable_account() {
        super.disable_account();  
    
    }
    
    @Override
    public void log_in() {
        super.log_in();
    }
    
    public void add_songs(){
    
    }
    
    public void add_gender(){
    
    }
   
    public void delete_song(){
    
    }

    @Override
    public void delete_playlist() {
        super.delete_playlist(); 
    }

    @Override
    public void search_playlist() {
        super.search_playlist(); 
    }

    @Override
    public void update_playlist() {
        super.update_playlist(); 
    }

    @Override
    public void create_playlist() {
        super.create_playlist(); 
    }

    @Override
    public void stop_playlist() {
        super.stop_playlist(); 
    }

    @Override
    public void play_playlist() {
        super.play_playlist(); 
    }
    
    
    
}