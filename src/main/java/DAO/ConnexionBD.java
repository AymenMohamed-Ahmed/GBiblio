/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author ayman
 */
public class ConnexionBD {

    static String url = "jdbc:mysql://localhost:3306/biblio";
    static String login = "root";
    static String password = "";
    static Statement stm = null;
    static Connection cnx = null;

    public static Statement seconneceter() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cnx = DriverManager.getConnection(url, login, password);
            stm = cnx.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return stm;
    }

    public static void seDeconneceter() {
        try {
            cnx.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
