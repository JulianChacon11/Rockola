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
public class User {

    private int id;
    private String name;
    private String lastName;
    private String email;
    private Date dateOfBirth;
    private String phone;
    private String gender;
    private String nationality;
    private boolean userStatus;

    public User() {
    }

    public User(int id, String name, String lastName, String email, Date dateOfBirth, String phone, String gender, String nationality, boolean userStatus) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.gender = gender;
        this.nationality = nationality;
        this.userStatus = userStatus;
    }

    public User(String name, String lastName, String email, Date dateOfBirth, String phone, String gender, String nationality, boolean userStatus) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.gender = gender;
        this.nationality = nationality;
        this.userStatus = userStatus;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public boolean isUserStatus() {
        return userStatus;
    }

    public void setUserStatus(boolean userStatus) {
        this.userStatus = userStatus;
    }
    
    public void allowed_age(){
    
    }
    
    public void disable_account(){
    
    }
    public void update_data(){
    
    }
    
    public void log_in(){
    
    }
    
    public void create_playlist(){
        
    }
    
     public void update_playlist(){
    }
     
     public void search_playlist(){
    }
    
     public void delete_playlist(){
    }
     
    public void play_playlist(){
    }
    
    public void stop_playlist(){
    }
    
}
