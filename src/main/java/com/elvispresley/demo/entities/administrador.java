/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import com.elvispresley.demo.entities.user;
import java.util.Date;

/**
 *
 * @author andreastefannygarciamejia
 */
 class administrator extends user{
    private String id_admin;

    public administrator(String id_admin, String name, String lastName, String email, Date date_of_birth, String phone, String gender, String nationality, boolean user_status) {
        super(name, lastName, email, date_of_birth, phone, gender, nationality, user_status);
        this.id_admin = id_admin;
    }

    public String getId_admin() {
        return id_admin;
    }

    public void setId_admin(String id_admin) {
        this.id_admin = id_admin;
    }
   

   public void create_gender(){
   
   }
   
   public void add_song(){
   
   }

    @Override
    public void update_data() {
        super.update_data(); 
    }

    @Override
    public void disable_account() {
        super.disable_account(); 
    }
   
   
    
}
