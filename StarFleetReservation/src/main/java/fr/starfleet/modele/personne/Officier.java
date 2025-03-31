package fr.starfleet.modele.personne;

public class Officier extends Personne {
    private final String rang;
    private final String specialite;

    public Officier(String nom, String prenom, String identifiant, String rang, String specialite) {
        super(nom, prenom, identifiant);
        this.rang = rang;
        this.specialite = specialite;
    }

    @Override
    public String getDescription() {
        return "Officier " + rang + " - " + specialite;
    }
}