/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entities;

/**
 *
 * @author bilel
 */
public class Utilisateur {
    private int id_user;
    private String nom_user;
    private String prenom_user;
    private int tel_user;
    private String email_user;
    private String mdp_user;
     private String pdp;
    private String roles;

    public Utilisateur(int id_user, String nom_user, String prenom_user, int tel_user, String email_user, String mdp_user, String pdp, String roles) {
        this.id_user = id_user;
        this.nom_user = nom_user;
        this.prenom_user = prenom_user;
        this.tel_user = tel_user;
        this.email_user = email_user;
        this.mdp_user = mdp_user;
        this.pdp = pdp;
        this.roles = roles;
    }

    public Utilisateur(String nom_user, String prenom_user, int tel_user, String email_user, String mdp_user, String pdp, String roles) {
        this.nom_user = nom_user;
        this.prenom_user = prenom_user;
        this.tel_user = tel_user;
        this.email_user = email_user;
        this.mdp_user = mdp_user;
        this.pdp = pdp;
        this.roles = roles;
    }

    public Utilisateur(String nom_user, String prenom_user, int tel_user, String email_user, String mdp_user, String pdp) {
        this.nom_user = nom_user;
        this.prenom_user = prenom_user;
        this.tel_user = tel_user;
        this.email_user = email_user;
        this.mdp_user = mdp_user;
        this.pdp = pdp;
    }

    public Utilisateur() {
        
    }

    public int getId_user() {
        return id_user;
    }

    public Utilisateur(int id_user, String nom_user, String prenom_user, int tel_user, String email_user, String mdp_user, String pdp) {
        this.id_user = id_user;
        this.nom_user = nom_user;
        this.prenom_user = prenom_user;
        this.tel_user = tel_user;
        this.email_user = email_user;
        this.mdp_user = mdp_user;
        this.pdp = pdp;
    }

    public String getNom_user() {
        return nom_user;
    }

    public String getPrenom_user() {
        return prenom_user;
    }

    public int getTel_user() {
        return tel_user;
    }

    public String getEmail_user() {
        return email_user;
    }

    public String getMdp_user() {
        return mdp_user;
    }

    public String getPdp() {
        return pdp;
    }

    public String getRoles() {
        return roles;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public void setNom_user(String nom_user) {
        this.nom_user = nom_user;
    }

    public void setPrenom_user(String prenom_user) {
        this.prenom_user = prenom_user;
    }

    public void setTel_user(int tel_user) {
        this.tel_user = tel_user;
    }

    public void setEmail_user(String email_user) {
        this.email_user = email_user;
    }

    public void setMdp_user(String mdp_user) {
        this.mdp_user = mdp_user;
    }

    public void setPdp(String pdp) {
        this.pdp = pdp;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
   
    

   

     
}
