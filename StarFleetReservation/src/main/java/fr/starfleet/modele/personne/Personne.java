package fr.starfleet.modele.personne;

import java.io.Serializable;

public abstract class Personne implements Serializable {
    private final String nom;
    private final String prenom;
    private final String identifiant;

    public Personne(String nom, String prenom, String identifiant) {
        this.nom = nom;
        this.prenom = prenom;
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public abstract String getDescription();
}
