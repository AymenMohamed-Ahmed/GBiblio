/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gbiblio;

import DAO.ConnexionBD;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ayman
 */
public class livre {

    public int isbn;
    public String titre;
    public String dateParution;
    public int nbExamplaire;
    public String auteur;
    public String domaine;

    public livre() {
    }

    public livre(int isbn, String titre, String dateParution, int nbExamplaire, String auteur, String domaine) {
        this.isbn = isbn;
        this.titre = titre;
        this.dateParution = dateParution;
        this.nbExamplaire = nbExamplaire;
        this.auteur = auteur;
        this.domaine = domaine;
    }

    public void Ajouter(livre l) {
        try {
            Statement stm = ConnexionBD.seconneceter();
            String query = "INSERT INTO livre ( titre, date_produ, nb_examplaire, nom_auteur, domaine) VALUES "
                    + "('" + l.titre + "', '" + l.dateParution + "', " + l.nbExamplaire + ", '"
                    + l.auteur + "', '" + l.domaine + "')";
            stm.executeUpdate(query);
            ConnexionBD.seDeconneceter();
            System.out.println("Book added successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Supprimer(int isbn) {
        try {
            Statement stm = ConnexionBD.seconneceter();
            String query = "DELETE FROM livre WHERE isbn = " + isbn;
            int rowsAffected = stm.executeUpdate(query);
            ConnexionBD.seDeconneceter();

            if (rowsAffected > 0) {
                System.out.println("Book deleted successfully!");
            } else {
                System.out.println("No book found with the provided ISBN.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void modifier(livre l) {
        try {
            Statement stm = ConnexionBD.seconneceter();
            String query = "UPDATE livre SET titre = '" + l.titre + "', date_produ = '" + l.dateParution
                    + "', nb_examplaire = " + l.nbExamplaire + ", nom_auteur = '" + l.auteur + "', domaine = '" + l.domaine
                    + "' WHERE isbn = " + l.isbn;
            int rowsAffected = stm.executeUpdate(query);
            ConnexionBD.seDeconneceter();

            if (rowsAffected > 0) {
                System.out.println("Book modified successfully!");
            } else {
                System.out.println("No book found with the provided ISBN.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<livre> getALLLivre() {
        List<livre> ListLivre = new ArrayList<livre>();
        try {
            Statement stm = ConnexionBD.seconneceter();
            String query = "SELECT * FROM livre";
            ResultSet rs = stm.executeQuery(query);
            
            while (rs.next()) {
                int isbnRS = rs.getInt("isbn");
                String titreRS = rs.getString("titre");
                String dateParutionRS = rs.getString("date_produ");
                int nbExamplaireRS = rs.getInt("nb_examplaire");
                String auteurRS = rs.getString("nom_auteur");
                String domaineRS = rs.getString("domaine");
                
                livre book = new livre(isbnRS, titreRS, dateParutionRS, nbExamplaireRS, auteurRS, domaineRS);
                ListLivre.add(book);
            }
            
            ConnexionBD.seDeconneceter();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListLivre;
    }
    
    public List<livre> afficherParisbn(int isbn) {
        List<livre> ListLivre = new ArrayList<livre>();
        try {
            Statement stm = ConnexionBD.seconneceter();
            String query = "SELECT * FROM livre WHERE isbn = " + isbn;
            ResultSet rs = stm.executeQuery(query);
            
            while (rs.next()) {                
                int isbnRS = rs.getInt("isbn");
                String titreRS = rs.getString("titre");
                String dateParutionRS = rs.getString("date_produ");
                int nbExamplaireRS = rs.getInt("nb_examplaire");
                String auteurRS = rs.getString("nom_auteur");
                String domaineRS = rs.getString("domaine");
                
                livre book = new livre(isbnRS, titreRS, dateParutionRS, nbExamplaireRS, auteurRS, domaineRS);
                ListLivre.add(book);
            }
            
            ConnexionBD.seDeconneceter();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListLivre;
    } 
    
    public List<livre> afficherParDomaine(String domaine) {
        List<livre> ListLivre = new ArrayList<livre>();
        try {
            Statement stm = ConnexionBD.seconneceter();
            String query = "SELECT * FROM livre WHERE domaine = '" + domaine +"'";
            ResultSet rs = stm.executeQuery(query);
            
            while (rs.next()) {
                int isbnRS = rs.getInt("isbn");
                String titreRS = rs.getString("titre");
                String dateParutionRS = rs.getString("date_produ");
                int nbExamplaireRS = rs.getInt("nb_examplaire");
                String auteurRS = rs.getString("nom_auteur");
                String domaineRS = rs.getString("domaine");
                
                livre book = new livre(isbnRS, titreRS, dateParutionRS, nbExamplaireRS, auteurRS, domaineRS);
                ListLivre.add(book);
            }
            
            ConnexionBD.seDeconneceter();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListLivre;
    } 
    
    public List<livre> afficherParAuteur(String auteur) {
        List<livre> ListLivre = new ArrayList<livre>();
        try {
            Statement stm = ConnexionBD.seconneceter();
            String query = "SELECT * FROM livre WHERE nom_auteur like '" + auteur +"%'";
            ResultSet rs = stm.executeQuery(query);
            
            while (rs.next()) {                
                int isbnRS = rs.getInt("isbn");
                String titreRS = rs.getString("titre");
                String dateParutionRS = rs.getString("date_produ");
                int nbExamplaireRS = rs.getInt("nb_examplaire");
                String auteurRS = rs.getString("nom_auteur");
                String domaineRS = rs.getString("domaine");
                
                livre book = new livre(isbnRS, titreRS, dateParutionRS, nbExamplaireRS, auteurRS, domaineRS);
                ListLivre.add(book);
            }
            
            ConnexionBD.seDeconneceter();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListLivre;
    } 

}
