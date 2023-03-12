package DAO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author dell
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;

public class Connextion {

    public static String url = "jdbc:mysql://localhost:3306/ges_article";
    public static String password = "";
    public static String user = "root";
    public static Connection cnx = null;

    public static Connection connect() {
        if (cnx == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
                cnx = (Connection) DriverManager.getConnection(url, user, password);

            } catch (Exception ex) {
                System.out.println("eoror sur le driver");

            }

        }
        return cnx;

    }

    public static void deconnect() {
        if (cnx != null) {
            try {
                cnx.close();
                cnx = null;
            } catch (Exception ex) {
                System.out.println(ex);

            }

        }
    }

}
