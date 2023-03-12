/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Models.Article;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author dell
 */
public class articleImplemants implements articleInterface{
    
    public  Connection cnx;
    private Statement stm;
    private String sql = "";

    public articleImplemants() {
        cnx = Connextion.connect();

        try
        {
        stm=cnx.createStatement();
        }catch(Exception ex){
            System.out.println("erore sur la creation du statment");
        }
    }

    @Override
    public void addArticle(Article a) {
        sql="insert into article(designation,prix,qte) values('"+a.getDesignation()+"','"+a.getPrix()+"','"+
                a.getQte()+"');";
        try{
            stm.executeUpdate(sql);
        }
        catch(Exception ex){
            System.out.println("ERROR sur insert");
            
        }
    }

    @Override
    public void deleteArticle(int code) {
        sql="delete from article where id="+code;
        try{
            stm.executeUpdate(sql);
        }
        catch(Exception ex){
            System.out.println("ERROR sur delete");
            
        }
        
    }

    @Override
    public void updateArticle(Article a) {
        sql="update article set designation='"+a.getDesignation()+"',prix='"+a.getPrix()+
                "',qte='"+a.getQte()+"' where id='"+a.getId()+"';";
        try{
            stm.executeUpdate(sql);
        }
        catch(Exception ex){
            System.out.println("ERROR sur update");
            
        }
    }

    @Override
    public Article getArticleById(int code) {
        Article a=null;
        sql="select * from article where id="+code;
        try
        {
         ResultSet set=stm.executeQuery(sql);
         set.next();
         a=new Article(set.getInt("id"),set.getString("designation"),
         set.getDouble("prix"),set.getInt("qte"));

        }
        catch(Exception ex){
            System.out.println("error sur recherhcer");
        
    }
        return a;
    }

    @Override
    public List<Article> getAllArticle() {
        List<Article> lst=new ArrayList<Article>();
        sql="select * from article";
        try{
         ResultSet set=stm.executeQuery(sql);
         while(set.next()){
             lst.add(new Article(set.getInt("id"),set.getString("designation"),
             set.getDouble("prix"),set.getInt("qte")));
         }
            
        }
        catch(Exception ex){
            
        }
        return lst;
        
    }
    
    
    
}
