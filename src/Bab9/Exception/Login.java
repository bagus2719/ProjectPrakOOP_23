/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab9.Exception;

/**
 *
 * @author ASUS
 */
public class Login {
    private String username, password;
    public String name;
    public Login(){
        name = "Bagus Tri Al Ahmadi";
        username  = "Bagus";
        password = "Bagus23";
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
    boolean cekLogin(String Username, String Password){
        if (username.equals(getUsername()) && password.equals(getPassword())){
            return true;
        }
        return false;
    }
}
