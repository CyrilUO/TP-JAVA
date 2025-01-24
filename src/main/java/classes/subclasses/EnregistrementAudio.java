package classes.subclasses;

import classes.Consultable;
import classes.Empruntable;
import classes.Media;

public class EnregistrementAudio extends Media implements Empruntable, Consultable {
    private boolean isBooked;

    private int duree;

    public EnregistrementAudio(String title, boolean isBooked, int duree){
        super(title);
        this.isBooked = isBooked;
        this.duree = duree;
    }

    @Override
    public void consulter() {
        if (!isBooked){
            System.out.println("********************************");
            System.out.println("Fonction consulter pour enregistrement");
            System.out.println("********************************");
            System.out.println("Consultation de enregistrement : " + getTitle() + "dure :" + duree +"quantité louée : ");
        } else {
            System.out.println("Consultation impossible, enregistrement dejà emprunté");
        }

    }

    @Override
    public void emprunter() {

        if (!isBooked){
            isBooked = true;
            System.out.println("********************************");
            System.out.println("Fonction pour emprunter l'enregistrement");
            System.out.println("********************************");
        } else {
            System.out.println("********************************");
            System.out.println("Fonction emprunter pour enregistrement");
            System.out.println("********************************");
            System.out.println("Enregistrement Deja emprunté : " + showTitre());
        }


    }

    @Override
    public void retourner() {
        if (isBooked){
            isBooked =false;
            System.out.println("Fonction retourner pour enregistrement");
            System.out.println("********************************");
            System.out.println("Enregistrement : " + showTitre() + " a été retourné.");
        } else {
            System.out.println("Fonction retourner pour enregistrement");
            System.out.println("********************************");
            System.out.println("Enregistrement Deja emprunté : " + showTitre());
        }
    }

    @Override
    public String showTitre() {
        return this.getTitle();
    }

    @Override
    public void afficher() {

        System.out.println("Appel à la fonction afficher pour Enregistrement : ");
        System.out.println("************************************");
        System.out.println("Titre : " + showTitre());
        System.out.println("Duree : " + getDuree());
        System.out.println("Status d'emprunt : " + (isBooked ? "Emprunté" : "Dispo"));
        System.out.println("Quantité des médias empruntés dans la bibliothèque : " + getQuantiteMedias());
        System.out.println("************************************");

    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

}
