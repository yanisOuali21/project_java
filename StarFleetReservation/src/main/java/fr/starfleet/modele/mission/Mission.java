package fr.starfleet.modele.mission;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.List;
import fr.starfleet.modele.vaisseau.Vaisseau;
import fr.starfleet.modele.reservation.Reservation;

public class Mission implements Serializable {
    private final String code;
    private final String description;
    private final Date dateDepart;
    private final Date dateRetour;
    private final String destination;
    private final transient Vaisseau vaisseau;
    private final List<Reservation> reservations;
    private final int capaciteMaximale;

    public Mission(String code, String description, Date dateDepart, Date dateRetour, String destination, Vaisseau vaisseau, int capaciteMaximale) {
        if (code == null || description == null || dateDepart == null || dateRetour == null || destination == null || vaisseau == null) {
            throw new IllegalArgumentException("Arguments cannot be null");
        }
        this.code = code;
        this.description = description;
        this.dateDepart = dateDepart;
        this.dateRetour = dateRetour;
        this.destination = destination;
        this.vaisseau = vaisseau;
        this.capaciteMaximale = capaciteMaximale;
        this.reservations = new ArrayList<>();
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public Date getDateDepart() {
        return dateDepart;
    }

    public Date getDateRetour() {
        return dateRetour;
    }

    public String getDestination() {
        return destination;
    }

    public Vaisseau getVaisseau() {
        return vaisseau;
    }

    public boolean ajouterReservation(Reservation reservation) {
        if (reservations.size() < capaciteMaximale) {
            reservations.add(reservation);
            return true;
        }
        return false;
    }

    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject();
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
       
    }
}