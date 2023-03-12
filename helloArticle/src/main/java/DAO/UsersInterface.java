/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import Models.Users;

/**
 *
 * @author dell
 */
public interface UsersInterface {
      public void SingUp(Users a);
    public Users Authe(String Email,String Pass);
    
}
