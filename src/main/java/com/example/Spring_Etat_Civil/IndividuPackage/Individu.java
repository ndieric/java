package com.example.Spring_Etat_Civil.IndividuPackage;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="individuTable")
public class Individu {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id_indvidu;
    private String nom_individu;

    private String prenom_individu;
    private Date naissance_individu;
    private String etat_civil;

    public Individu(){

    }

    public Individu(String nom_individu, String prenom_individu, Date naissance_individu, String etat_civil) {
        this.nom_individu = nom_individu;
        this.prenom_individu = prenom_individu;
        this.naissance_individu = naissance_individu;
        this.etat_civil = etat_civil;
    }
    

    public Long getId_indvidu() {
        return id_indvidu;
    }

    public void setId_indvidu(Long id_indvidu) {
        this.id_indvidu = id_indvidu;
    }

    public String getNom_individu() {
        return nom_individu;
    }

    public void setNom_individu(String nom_individu) {
        this.nom_individu = nom_individu;
    }

    public String getPrenom_individu() {
        return prenom_individu;
    }

    public void setPrenom_individu(String prenom_individu) {
        this.prenom_individu = prenom_individu;
    }

    public Date getNaissance_individu() {
        return naissance_individu;
    }

    public void setNaissance_individu(Date naissance_individu) {
        this.naissance_individu = naissance_individu;
    }

    public String getEtat_civil() {
        return etat_civil;
    }

    public void setEtat_civil(String etat_civil) {
        this.etat_civil = etat_civil;
    }

    @Override
    public String toString() {
        return "Individu [etat_civil=" + etat_civil + ", id_indvidu=" + id_indvidu + ", naissance_individu="
                + naissance_individu + ", nom_individu=" + nom_individu + ", prenom_individu=" + prenom_individu + "]";
    }

    public static List<Individu> trouverIndividu() {
        return null;
    }
    
    
    
    
}
