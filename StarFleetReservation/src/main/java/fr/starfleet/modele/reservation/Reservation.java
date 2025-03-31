package fr.starfleet.modele.reservation;

import java.io.Serializable;
import java.util.Date;
import fr.starfleet.modele.mission.Mission;
import fr.starfleet.modele.personne.Personne;

public class Reservation implements Serializable {
    private String idReservation;
    private Personne passager;
    private Mission mission;
    private Date dateReservation;
    private boolean confirmee;

    public Reservation(String idReservation, Personne passager, Mission mission) {
        this.idReservation = idReservation;
        this.passager = passager;
        this.mission = mission;
        this.dateReservation = new Date();
        this.confirmee = false;
    }

    public void confirmer() {
        this.confirmee = true;
    }
}
