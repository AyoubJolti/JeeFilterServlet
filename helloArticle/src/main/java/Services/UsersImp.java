/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DAO.UsersImplement;
import Models.Users;

/**
 *
 * @author dell
 */
public class UsersImp implements UsersInterface{
UsersImplement u=new UsersImplement();
    public UsersImp() {
        
    }
    

    @Override
    public void SingUp(Users a) {
        u.SingUp(a);
    }

    @Override
    public Users Authe(String Email, String Pass) {
        return u.Authe(Email, Pass);
    }
    
    
}
