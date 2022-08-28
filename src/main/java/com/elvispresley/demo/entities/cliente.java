/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import com.elvispresley.demo.entities.user;
import java.util.Date;
import java.util.List;

/**
 *
 * @author andreastefannygarciamejia
 */

class client extends user{
    
    private String id_client;

    public client(String id_client, String name, String lastName, String email, Date date_of_birth, String phone, String gender, String nationality, boolean user_status) {
        super(name, lastName, email, date_of_birth, phone, gender, nationality, user_status);
        this.id_client = id_client;
    }

    public String getId_client() {
        return id_client;
    }

    public void setId_client(String id_client) {
        this.id_client = id_client;
    }
    
   
    @Override
    public void update_data(){
    
    }
    
    @Override
    public void disable_account(){
    
    }
   
}
