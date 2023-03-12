/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Models.Users;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dell
 */
public class UsersImplement implements UsersInterface {

    public Connection cnx;
    private Statement stm;
    private String sql = "";

    public UsersImplement() {
        cnx = Connextion.connect();

        try {
            stm = cnx.createStatement();
        } catch (Exception ex) {
            System.out.println("erore sur la creation du statment");
        }

    }

    @Override
    public void SingUp(Users u) {
         sql="insert into users(Email,passworde,type) values('"+u.getEmail()+"','"+u.getPassworde()+"','"+
                u.getType()+"');";
        try{
            stm.executeUpdate(sql);
        }
        catch(Exception ex){
            System.out.println("ERROR sur insert");
            
        }
    }

    @Override
    public Users Authe(String Email, String Pass) {
 Users s=null;
        sql="select * from users where Email='"+Email+"' and passworde="+Pass;
        try
        {
         ResultSet set=stm.executeQuery(sql);
         set.next();
         s=new Users(set.getInt("id"),set.getString("Email"),
         set.getString("passworde"),set.getString("type"));

        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        
    }
        return s;    }

}
