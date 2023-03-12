/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DAO.*;
import Models.Article;
import java.util.List;

/**
 *
 * @author dell
 */
public class articleImp implements articleInterface{
    articleImplemants art=new articleImplemants();

    @Override
    public void addArticle(Article a) {
        art.addArticle(a);
    }

    @Override
    public void deleteArticle(int code) {
        art.deleteArticle(code);
    }

    @Override
    public void updateArticle(Article a) {
        art.updateArticle(a);
    }

    @Override
    public Article getArticleById(int code) {
       return art.getArticleById(code);
    }

    @Override
    public List<Article> getAllArticle() {
        return art.getAllArticle();
    }
    
}
