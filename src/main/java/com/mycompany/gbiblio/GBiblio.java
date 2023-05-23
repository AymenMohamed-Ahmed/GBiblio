/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gbiblio;
import DAO.ConnexionBD;

import java.sql.*;
import java.util.List;

/**
 *
 * @author ayman
 */
public class GBiblio {

    public static void main(String[] args) {
//        Statement statement = ConnexionBD.seconneceter();
//        if (statement != null) {
//            System.out.println("Connection successful!");
//            ConnexionBD.seDeconneceter();
//            System.out.println("Disconnected.");
//        } else {
//            System.out.println("Failed to connect to the database.");
//        }
        
        // Create a new livre object with book details
        livre book = new livre(1, "Example Book", "2022-01-01", 5, "John Doe", "Fiction");
        
        // Call the Ajouter method to add the book to the database
//        book.Ajouter(book);
//        book.Supprimer(1);
//        book.modifier(2, "Example Book 2", "2022-01-02", 6, "John Does", "Action");

//        List<livre> allBooks = book.getALLLivre();
//        
//        // Print the details of each book
//        for (livre b : allBooks) {
//            System.out.println("ISBN: " + b.isbn);
//            System.out.println("Title: " + b.titre);
//            System.out.println("Publication Date: " + b.dateParution);
//            System.out.println("Number of Copies: " + b.nbExamplaire);
//            System.out.println("Author: " + b.auteur);
//            System.out.println("Domain: " + b.domaine);
//            System.out.println();
//        }
        
        List<livre> matchingBooks = book.afficherParisbn(2);
        
        if (matchingBooks.isEmpty()) {
            System.out.println("No books found with the provided ISBN.");
        } else {
            System.out.println("Matching Books:");
            for (livre b : matchingBooks) {
                System.out.println("ISBN: " + b.isbn);
                System.out.println("Title: " + b.titre);
                System.out.println("Publication Date: " + b.dateParution);
                System.out.println("Number of Copies: " + b.nbExamplaire);
                System.out.println("Author: " + b.auteur);
                System.out.println("Domain: " + b.domaine);
                System.out.println();
            }
        }
        
    }
}
