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
    protected String name;
    protected String lastName;
    protected String email;
    protected Date date_of_birth;
    protected String phone;
    protected String gender;
    protected String nationality;
    protected boolean user_status;

    public User(String name, String lastName, String email, Date date_of_birth, String phone, String gender, String nationality, boolean user_status) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.date_of_birth = date_of_birth;
        this.phone = phone;
        this.gender = gender;
        this.nationality = nationality;
        this.user_status = user_status;
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

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
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

    public boolean isUser_status() {
        return user_status;
    }

    public void setUser_status(boolean user_status) {
        this.user_status = user_status;
    }
    
    public void allowed_age(){
    
    }
    
    public void disable_account(){
    
    }
    public void update_data(){
    
    }
    
    public void log_in(){
    
    }
    
}
