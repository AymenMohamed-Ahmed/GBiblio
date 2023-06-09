/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package IHM;

import com.mycompany.gbiblio.livre;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ayman
 */
public class GestionLivre extends javax.swing.JFrame {

    /**
     * Creates new form GestionLivre
     */
    public GestionLivre() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_titre = new javax.swing.JTextField();
        txt_isbn = new javax.swing.JTextField();
        txt_nbexmp = new javax.swing.JTextField();
        txt_auteur = new javax.swing.JTextField();
        cbox_domaine = new javax.swing.JComboBox<>();
        date_production = new javax.swing.JSpinner();
        btn_saveActionPerformed = new javax.swing.JButton();
        btn_editActionPerformed = new javax.swing.JButton();
        btn_deleteActionPerformed = new javax.swing.JButton();
        btn_cancelActionPerformed = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_rechercheISBN = new javax.swing.JTextField();
        txt_rechercheDomaine = new javax.swing.JTextField();
        txt_rechercheAuteur = new javax.swing.JTextField();
        searchbyisbnActionPerformed = new javax.swing.JButton();
        searchbydomaineActionPerformed = new javax.swing.JButton();
        searchbyauteurActionPerformed = new javax.swing.JButton();
        btn_showallActionPerformed = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        booklistes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Gestion des Livres");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("ISBN:");

        jLabel3.setText("Titre:");

        jLabel4.setText("Date de production:");

        jLabel5.setText("Nombre d'examplaire:");

        jLabel6.setText("Nom de l'auteur:");

        jLabel7.setText("Domaine:");

        txt_titre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_titreActionPerformed(evt);
            }
        });

        txt_isbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_isbnActionPerformed(evt);
            }
        });

        txt_nbexmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nbexmpActionPerformed(evt);
            }
        });

        txt_auteur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_auteurActionPerformed(evt);
            }
        });

        cbox_domaine.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Informatique", "Industrie", "Comptabilite", "Mathematique", "Chimie", "Roman", "Management" }));

        date_production.setModel(new javax.swing.SpinnerDateModel());

        btn_saveActionPerformed.setActionCommand("Enregistrer");
        btn_saveActionPerformed.setLabel("Enregistrer");
        btn_saveActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformedActionPerformed(evt);
            }
        });

        btn_editActionPerformed.setText("Modifier");
        btn_editActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformedActionPerformed(evt);
            }
        });

        btn_deleteActionPerformed.setText("Supprimer");
        btn_deleteActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformedActionPerformed(evt);
            }
        });

        btn_cancelActionPerformed.setText("Annuler");
        btn_cancelActionPerformed.setToolTipText("");
        btn_cancelActionPerformed.setActionCommand("Listes_exemplaires");
        btn_cancelActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_auteur)
                    .addComponent(txt_nbexmp)
                    .addComponent(txt_titre)
                    .addComponent(txt_isbn)
                    .addComponent(cbox_domaine, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(date_production, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_saveActionPerformed, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(btn_editActionPerformed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_deleteActionPerformed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btn_cancelActionPerformed, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txt_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txt_titre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(date_production, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txt_nbexmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txt_auteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_saveActionPerformed)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_editActionPerformed)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_deleteActionPerformed)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cancelActionPerformed)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(cbox_domaine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Recherche des Livres");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setText("ISBN:");

        jLabel10.setText("Domaine:");

        jLabel11.setText("Nom de l'auteur:");

        txt_rechercheISBN.setToolTipText("");
        txt_rechercheISBN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_rechercheISBNKeyPressed(evt);
            }
        });

        txt_rechercheDomaine.setToolTipText("");
        txt_rechercheDomaine.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_rechercheDomaineKeyPressed(evt);
            }
        });

        txt_rechercheAuteur.setToolTipText("");
        txt_rechercheAuteur.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_rechercheAuteurKeyPressed(evt);
            }
        });

        searchbyisbnActionPerformed.setText("Rechercher");
        searchbyisbnActionPerformed.setActionCommand("RechercherISBN");
        searchbyisbnActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbyisbnActionPerformedActionPerformed(evt);
            }
        });

        searchbydomaineActionPerformed.setText("Rechercher");
        searchbydomaineActionPerformed.setActionCommand("RechercherDomaine");
        searchbydomaineActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbydomaineActionPerformedActionPerformed(evt);
            }
        });

        searchbyauteurActionPerformed.setText("Rechercher");
        searchbyauteurActionPerformed.setActionCommand("RechercherAuteur");
        searchbyauteurActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbyauteurActionPerformedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_rechercheAuteur, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(146, 146, 146)
                        .addComponent(txt_rechercheISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_rechercheDomaine, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchbyisbnActionPerformed)
                    .addComponent(searchbydomaineActionPerformed)
                    .addComponent(searchbyauteurActionPerformed))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_rechercheISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchbyisbnActionPerformed)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_rechercheDomaine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchbydomaineActionPerformed)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_rechercheAuteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchbyauteurActionPerformed)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_showallActionPerformed.setText("Afficher tous les livres");
        btn_showallActionPerformed.setActionCommand("Afficher_tous_livres");
        btn_showallActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_showallActionPerformedActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Recherche des Livres");

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        booklistes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ISBN", "Titre", "Date Parution", "Nombre Examplaire", "Auteur", "Domaine"
            }
        ));
        booklistes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                booklistesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(booklistes);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(283, 283, 283))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addGap(30, 30, 30)
                                .addComponent(btn_showallActionPerformed)))
                        .addGap(15, 15, 15)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btn_showallActionPerformed)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_titreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_titreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_titreActionPerformed

    private void txt_isbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_isbnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_isbnActionPerformed

    private void txt_nbexmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nbexmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nbexmpActionPerformed

    private void txt_auteurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_auteurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_auteurActionPerformed

    private void btn_saveActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformedActionPerformed
        // Create a new livre object
        livre l = new livre();

        // Get the input values from your GUI components
        int isbn = Integer.parseInt(txt_isbn.getText());
        String titre = txt_titre.getText();
        java.util.Date dateParution = (java.util.Date) date_production.getValue();
        int nbExamplaire = Integer.parseInt(txt_nbexmp.getText());
        String auteur = txt_auteur.getText();
        String domaine = cbox_domaine.getSelectedItem().toString();

        // Set the values for the livre object
        l.isbn = isbn;
        l.titre = titre;

        // Convert the java.util.Date to a formatted string
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = dateFormat.format(dateParution);
        l.dateParution = formattedDate;

        l.nbExamplaire = nbExamplaire;
        l.auteur = auteur;
        l.domaine = domaine;

        l.Ajouter(l);
        JOptionPane.showMessageDialog(null, "Ajouté avec succès", "Insertion", JOptionPane.INFORMATION_MESSAGE);
        booklistes.removeAll();
        Actualiser();
        vider();
    }//GEN-LAST:event_btn_saveActionPerformedActionPerformed

    private void btn_editActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformedActionPerformed
        // TODO add your handling code here:
        livre l = new livre();

        int isbn = Integer.parseInt(txt_isbn.getText());
        String titre = txt_titre.getText();
        java.util.Date dateParution = (java.util.Date) date_production.getValue();
        int nbExamplaire = Integer.parseInt(txt_nbexmp.getText());
        String auteur = txt_auteur.getText();
        String domaine = cbox_domaine.getSelectedItem().toString();

        // Set the values for the livre object
        l.isbn = isbn;
        l.titre = titre;

        // Convert the java.util.Date to a formatted string
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = dateFormat.format(dateParution);
        l.dateParution = formattedDate;

        l.nbExamplaire = nbExamplaire;
        l.auteur = auteur;
        l.domaine = domaine;

        // Call the modifier method to update the record in the database
        l.modifier(l);

        // Show a success message
        JOptionPane.showMessageDialog(null, "Modifié avec succès", "Modification", JOptionPane.INFORMATION_MESSAGE);

        booklistes.removeAll();
        Actualiser();
        vider();
    }//GEN-LAST:event_btn_editActionPerformedActionPerformed

    private void btn_deleteActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformedActionPerformed
        // TODO add your handling code here:

        livre l = new livre();

        int isbn = Integer.parseInt(txt_isbn.getText());

        l.Supprimer(isbn);

        // Complete Code Here
        booklistes.removeAll();
        Actualiser();
        vider();

    }//GEN-LAST:event_btn_deleteActionPerformedActionPerformed

    private void btn_cancelActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformedActionPerformed
        // TODO add your handling code here:
        vider();
    }//GEN-LAST:event_btn_cancelActionPerformedActionPerformed

    private void btn_showallActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showallActionPerformedActionPerformed
        // TODO add your handling code here:
        Actualiser();
        vider();
    }//GEN-LAST:event_btn_showallActionPerformedActionPerformed

    private void booklistesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booklistesMouseClicked
        // TODO add your handling code here:

        // Get the selected row index
        int selectedRowIndex = booklistes.getSelectedRow();

        // Retrieve the data from the selected row
        String isbnString = booklistes.getValueAt(selectedRowIndex, 0).toString();
        int isbn = Integer.parseInt(isbnString);
        String titre = booklistes.getValueAt(selectedRowIndex, 1).toString();
        String nbExamplaire = booklistes.getValueAt(selectedRowIndex, 3).toString();
        String auteur = booklistes.getValueAt(selectedRowIndex, 4).toString();
        String domaine = booklistes.getValueAt(selectedRowIndex, 5).toString();

        // Display the data in the respective text areas
        txt_isbn.setText(String.valueOf(isbn));
        txt_titre.setText(titre);
        txt_nbexmp.setText(String.valueOf(nbExamplaire));
        txt_auteur.setText(auteur);
        cbox_domaine.setSelectedItem(domaine);
    }//GEN-LAST:event_booklistesMouseClicked

    private void searchbyisbnActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbyisbnActionPerformedActionPerformed
        // TODO add your handling code here:
        booklistes.removeAll();
        vider();
        Rechercherisbn();
        txt_rechercheISBN.setText("");
    }//GEN-LAST:event_searchbyisbnActionPerformedActionPerformed

    private void searchbydomaineActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbydomaineActionPerformedActionPerformed
        // TODO add your handling code here:
        booklistes.removeAll();
        vider();
        RechercherDomaine();
        txt_rechercheDomaine.setText("");
    }//GEN-LAST:event_searchbydomaineActionPerformedActionPerformed

    private void searchbyauteurActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbyauteurActionPerformedActionPerformed
        // TODO add your handling code here:
        booklistes.removeAll();
        vider();
        RechercherAuteur();
        txt_rechercheAuteur.setText("");
    }//GEN-LAST:event_searchbyauteurActionPerformedActionPerformed

    private void txt_rechercheDomaineKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_rechercheDomaineKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            searchbydomaineActionPerformedActionPerformed(null);
        }
    }//GEN-LAST:event_txt_rechercheDomaineKeyPressed

    private void txt_rechercheAuteurKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_rechercheAuteurKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            searchbyauteurActionPerformedActionPerformed(null);
        }
    }//GEN-LAST:event_txt_rechercheAuteurKeyPressed

    private void txt_rechercheISBNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_rechercheISBNKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            searchbyisbnActionPerformedActionPerformed(null);
        }
    }//GEN-LAST:event_txt_rechercheISBNKeyPressed

    /**
     * @param args the command line arguments
     */
    public void vider() {
        txt_isbn.setText("");
        txt_titre.setText("");
        txt_nbexmp.setText("");
        txt_auteur.setText("");
        cbox_domaine.setSelectedIndex(0);
        date_production.setValue(new java.util.Date());
    }

    public void Actualiser() {
        livre l = new livre();
        // Retrieve the list of livre objects based on ISBN
        List<livre> livres = l.getALLLivre();

        // Initialize the 2D array to store the table data
        String[][] tab = new String[livres.size()][6];

        // Populate the 2D array with the livre data
        for (int i = 0; i < livres.size(); i++) {
            l = livres.get(i);
            tab[i] = new String[]{String.valueOf(l.isbn), l.titre, l.dateParution, String.valueOf(l.nbExamplaire), l.auteur, l.domaine};
        }
        String[] entet = new String[]{"ISBN", "Titre", "Date Parution", "NombreExemplaire", "Auteur", "Domaine"};
        booklistes.setModel(new javax.swing.table.DefaultTableModel(tab, entet));
    }

    public void Rechercherisbn() {
        livre l = new livre();

        String isbnString = txt_rechercheISBN.getText();
        int isbn = Integer.parseInt(isbnString);

        // Retrieve the list of livre objects based on ISBN
        List<livre> livres = l.afficherParisbn(isbn);

        // Initialize the 2D array to store the table data
        String[][] tab = new String[livres.size()][6];

        // Populate the 2D array with the livre data
        for (int i = 0; i < livres.size(); i++) {
            l = livres.get(i);
            tab[i] = new String[]{String.valueOf(l.isbn), l.titre, l.dateParution, String.valueOf(l.nbExamplaire), l.auteur, l.domaine};
        }

        String[] entet = new String[]{"ISBN", "Titre", "Date Parution", "NombreExemplaire", "Auteur", "Domaine"};
        booklistes.setModel(new javax.swing.table.DefaultTableModel(tab, entet));
    }

    public void RechercherDomaine() {
        livre l = new livre();

        String domaine = txt_rechercheDomaine.getText();

        // Retrieve the list of livre objects based on ISBN
        List<livre> livres = l.afficherParDomaine(domaine);

        // Initialize the 2D array to store the table data
        String[][] tab = new String[livres.size()][6]; // Assuming there are 6 columns in the table

        // Populate the 2D array with the livre data
        for (int i = 0; i < livres.size(); i++) {
            l = livres.get(i);
            tab[i] = new String[]{String.valueOf(l.isbn), l.titre, l.dateParution, String.valueOf(l.nbExamplaire), l.auteur, l.domaine};
        }

        String[] entet = new String[]{"ISBN", "Titre", "Date Parution", "NombreExemplaire", "Auteur", "Domaine"};
        booklistes.setModel(new javax.swing.table.DefaultTableModel(tab, entet));
    }

    public void RechercherAuteur() {
        livre l = new livre();

        String auteur = txt_rechercheAuteur.getText();

        // Retrieve the list of livre objects based on ISBN
        List<livre> livres = l.afficherParAuteur(auteur);

        // Initialize the 2D array to store the table data
        String[][] tab = new String[livres.size()][6]; // Assuming there are 6 columns in the table

        // Populate the 2D array with the livre data
        for (int i = 0; i < livres.size(); i++) {
            l = livres.get(i);
            tab[i] = new String[]{String.valueOf(l.isbn), l.titre, l.dateParution, String.valueOf(l.nbExamplaire), l.auteur, l.domaine};
        }

        String[] entet = new String[]{"ISBN", "Titre", "Date Parution", "NombreExemplaire", "Auteur", "Domaine"};
        booklistes.setModel(new javax.swing.table.DefaultTableModel(tab, entet));
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionLivre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionLivre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionLivre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionLivre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionLivre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable booklistes;
    private javax.swing.JButton btn_cancelActionPerformed;
    private javax.swing.JButton btn_deleteActionPerformed;
    private javax.swing.JButton btn_editActionPerformed;
    private javax.swing.JButton btn_saveActionPerformed;
    private javax.swing.JButton btn_showallActionPerformed;
    private javax.swing.JComboBox<String> cbox_domaine;
    private javax.swing.JSpinner date_production;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchbyauteurActionPerformed;
    private javax.swing.JButton searchbydomaineActionPerformed;
    private javax.swing.JButton searchbyisbnActionPerformed;
    private javax.swing.JTextField txt_auteur;
    private javax.swing.JTextField txt_isbn;
    private javax.swing.JTextField txt_nbexmp;
    private javax.swing.JTextField txt_rechercheAuteur;
    private javax.swing.JTextField txt_rechercheDomaine;
    private javax.swing.JTextField txt_rechercheISBN;
    private javax.swing.JTextField txt_titre;
    // End of variables declaration//GEN-END:variables
}
