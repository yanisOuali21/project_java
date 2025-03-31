package fr.starfleet.modele.vaisseau;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import fr.starfleet.modele.mission.Mission;

public class Vaisseau implements Serializable {
    private String nom;
    private String immatriculation;
    private int capaciteMaximale;
    private List<Mission> missions;

    public Vaisseau(String nom, String immatriculation, int capaciteMaximale) {
        this.nom = nom;
        this.immatriculation = immatriculation;
        this.capaciteMaximale = capaciteMaximale;
        this.missions = new ArrayList<>();
    }

    public void ajouterMission(Mission mission) {
        if (!missions.contains(mission)) {
            missions.add(mission);
        }
    }

    public List<Mission> getMissions() {
        return missions;
    }
}