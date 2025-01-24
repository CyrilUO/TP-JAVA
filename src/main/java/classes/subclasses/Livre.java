package classes.subclasses;

import classes.Consultable;
import classes.Empruntable;
import classes.Media;

public class Livre extends Media implements Consultable, Empruntable {

    private boolean isBooked;

    public Livre(String titre, boolean isBooked){
        super(titre);
        this.isBooked = isBooked;
    }

    /* Surchage des méthodes de l'interface consultable */

    @Override
    public void consulter() {
        if (!isBooked){
            System.out.println("Consultation du livree : " + getTitle());
        } else {
            System.out.println("Consultation impossible, livre dejà emprunté");
        }
    }

    /* Surchage des méthodes de l'interface cempruntable */


    @Override
    public void emprunter(){
        if (!isBooked){
            isBooked = true;
            System.out.println("Live emprunté ! Son titré est : " + showTitre() + "\n");
        } else {
            System.out.println("Fonction consulter pour magazine");
            System.out.println("********************************");
            System.out.println("Consultation du livree impossible, ce dernier est malheureusement indisponible");
        }

    }

    @Override
    public void retourner() {
        if (isBooked){
            isBooked =false;
            System.out.println("Le livre : " + showTitre() + " a été retourné.");
        } else {
            System.out.println("lIVRE Deja emprunté : " + showTitre());
        }
    }

    @Override
    public String showTitre(){
        return this.getTitle();
    }

    /* Surchage de la méthode abstraite de la superclassMedia*/
    @Override
    public void afficher() {
        System.out.println("************************************");
        System.out.println("Appel à la fonction afficher pour livre : ");
        System.out.println("************************************");
        System.out.println("Titre : " + showTitre());
        System.out.println("Status d'emprunt : " + (isBooked ? "Emprunté" : "Dispo"));
        System.out.println("Quantité des médias : " + getQuantiteMedias());
        System.out.println("************************************");
    }
}
