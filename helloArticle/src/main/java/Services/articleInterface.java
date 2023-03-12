/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DAO.*;
import Models.Article;
import java.util.List;

/**
 *
 * @author dell
 */
public interface articleInterface {
    public void addArticle(Article a);
    public void deleteArticle(int code);
    public void updateArticle(Article a);
    public Article getArticleById(int code);
    public List<Article> getAllArticle();
   
}
