package com.example.teduniversity;

import jakarta.persistence.*;

@Entity
public class utilisateur {
    @Id
    @SequenceGenerator(
            name="utilisateur_sequence",
            sequenceName = "utilisateur_sequence" ,
            allocationSize=1
    )

    private int id;
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE ,
            generator = "utilisateur_sequence"

    )
    private String nom;
    private String prenom;
    private String mail;
    private String telephone;
    private String cin;
    private String mdp;
    private String role;

    public utlisateur() {
    }

    public utlisateur(int id, String nom, String prenom, String mail, String telephone, String cin, String mdp, String role) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.telephone = telephone;
        this.cin = cin;
        this.mdp = mdp;
        this.role = role;
    }

    @Override
    public String toString() {
        return "utlisateur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", mail='" + mail + '\'' +
                ", telephone='" + telephone + '\'' +
                ", cin='" + cin + '\'' +
                ", mdp='" + mdp + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
