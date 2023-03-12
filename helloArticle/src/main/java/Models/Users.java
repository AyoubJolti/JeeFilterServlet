/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author dell
 */
public class Users {

    private int id;
    private String Email;
    private String passworde ;
    private String type;

    public Users(int id, String Email, String passworde, String type) {
        this.id = id;
        this.Email = Email;
        this.passworde = passworde;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassworde() {
        return passworde;
    }

    public void setPassworde(String passworde) {
        this.passworde = passworde;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
 
    
}
