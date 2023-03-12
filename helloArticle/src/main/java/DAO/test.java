/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DAO;

import Models.Article;
import Models.Users;
import java.util.List;

/**
 *
 * @author dell
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        articleImplemants a=new articleImplemants();
//        Article art;
//        art=new Article(2,"jjjjj",1900,4);
//
//         a.addArticle(art);
//        //a.updateArticle(art);
//        //a.addArticle();
//        List<Article> ar=a.getAllArticle();
//        for(int i=0;i<ar.size();i++){
//            System.out.println(ar.get(i).getDesignation());
//        }
          UsersImplement a=new UsersImplement();
         // Users s=new Users(0,"hello","1234", "Admineee");
        
          
          Users s= new Users(0, "", "", "");
             s=    a.Authe("hello","1234");
          System.out.println(s.getEmail());
    }
    
}
