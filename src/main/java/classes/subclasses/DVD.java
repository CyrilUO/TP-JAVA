package classes.subclasses;

import classes.Consultable;
import classes.Empruntable;
import classes.Media;

public class DVD extends Media implements Consultable, Empruntable {

    private boolean isBooked;
    private int duree;

    public DVD(String title, boolean isBooked, int duree){
        super(title);
        this.isBooked = isBooked;
        this.duree = duree;
    }


    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }


    @Override
    public void consulter() {
        if (!isBooked) {
            System.out.println("Fonction consulter pour journal");
            System.out.println("********************************");
            System.out.println("Consultation du journal : " + getTitle() + ", longueur : " + getDuree() + "mins");
        } else {
            System.out.println("Fonction consulter pour DVD");
            System.out.println("********************************");
            System.out.println("Consultation du DVD Impossible, ce dernier est malheureusement indisponible");
        }
    }

    @Override
    public void emprunter() {
        if (!isBooked){
            isBooked = true;
            System.out.println("********************************");
            System.out.println("Fonction emprunter pour DVD");
            System.out.println("********************************");
            System.out.println("DVD emprunté ! Son titré est : " + showTitre() + "\n");
        } else {
            System.out.println("********************************");
            System.out.println("Fonction emprunter pour DVD");
            System.out.println("********************************");
            System.out.println("DVD deja emprunté emprunté !");
        }

    }

    @Override
    public void retourner() {
        if (isBooked){
            isBooked =false;
            System.out.println("Fonction retourner pour DVD");
            System.out.println("********************************");
            System.out.println("DVD : " + showTitre() + " a été retourné.");
        } else {
            System.out.println("Fonction retourner pour DVD");
            System.out.println("********************************");
            System.out.println("DVD Deja emprunté : " + showTitre());
        }

    }

    @Override
    public String showTitre() {
        return this.getTitle();
    }

    @Override
    public void afficher() {
        System.out.println("********************************");
        System.out.println("Appel à la fonction afficher pour DVD : ");
        System.out.println("************************************");
        System.out.println("Titre : " + showTitre());
        System.out.println("Duree : " + getDuree());
        System.out.println("Status d'emprunt : " + (isBooked ? "Emprunté" : "Dispo"));
        System.out.println("************************************");
    }

}
