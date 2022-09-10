/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.elvispresley.demo.entities;

import java.util.Date;
import java.util.List;

/**
 *
 * @author andreastefannygarciamejia
 */
public class Client extends User{
    
    private String id_client;
    private List<Playlist>  playlist;

    public Client(String name, String lastName, String email, Date date_of_birth, String phone, String gender, String nationality, boolean user_status) {
        super(name, lastName, email, date_of_birth, phone, gender, nationality, user_status);
    }

    public Client(String id_client, List<Playlist> playlist, String name, String lastName, String email, Date date_of_birth, String phone, String gender, String nationality, boolean user_status) {
        super(name, lastName, email, date_of_birth, phone, gender, nationality, user_status);
        this.id_client = id_client;
        this.playlist = playlist;
    }

    public Client(List<Playlist> playlist, String name, String lastName, String email, Date date_of_birth, String phone, String gender, String nationality, boolean user_status) {
        super(name, lastName, email, date_of_birth, phone, gender, nationality, user_status);
        this.playlist = playlist;
    }
    

    public String getId_client() {
        return id_client;
    }

    public void setId_client(String id_client) {
        this.id_client = id_client;
    }

    public List<Playlist> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(List<Playlist> playlist) {
        this.playlist = playlist;
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
    public void delete_playlist() {
        super.delete_playlist(); 
    }

    @Override
    public void update_playlist() {
        super.update_playlist();     }

    @Override
    public void create_playlist() {
        super.create_playlist(); 
    }

    @Override
    public void log_in() {
        super.log_in(); 
    }

    @Override
    public void search_playlist() {
        super.search_playlist(); 
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
