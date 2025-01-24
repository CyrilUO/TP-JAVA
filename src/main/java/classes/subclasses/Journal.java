package classes.subclasses;

import classes.Consultable;
import classes.Empruntable;
import classes.Media;

public class Journal extends Media implements Consultable, Empruntable {
    private boolean isBooked;

    public Journal(String titre, boolean isBooked){
        super(titre);
        this.isBooked = isBooked;
    }

    /* Surchage des méthodes de l'interface consultable */

    @Override
    public void consulter() {
        if (!isBooked){
            System.out.println("Fonction consulter pour journal");
            System.out.println("********************************");
            System.out.println("Consultation du journal : " + getTitle());
        } else {
            System.out.println("Fonction consulter pour journal");
            System.out.println("********************************");
            System.out.println("Consultation du journal impossible, ce dernier est malheureusement indisponible");
        }
    }

    /* Surchage des méthodes de l'interface cempruntable */


    @Override
    public void emprunter(){
        if (!isBooked){
            isBooked = true;
            System.out.println("Fonction emprunter pour journal");
            System.out.println("********************************");
            System.out.println("Journal emprunté ! Son titré est : " + showTitre() + "\n");
        } else {
            System.out.println("Consultation impossible, journal dejà emprunté");

        }

    }

    @Override
    public void retourner() {
        if (isBooked){
            isBooked =false;
            System.out.println("Fonction retourner pour journal");
            System.out.println("********************************");
            System.out.println("Magzine : " + showTitre() + " a été retourné.");
        } else {
            System.out.println("Fonction retourner pour journal");
            System.out.println("********************************");
            System.out.println("Journal Deja emprunté : " + showTitre());
        }
    }

    @Override
    public String showTitre(){
        return this.getTitle();
    }

    /* Surchage de la méthode abstraite de la superclassMedia*/
    @Override
    public void afficher() {
        System.out.println("Appel à la fonction afficher pour journal : ");
        System.out.println("************************************");
        System.out.println("Titre : " + showTitre());
        System.out.println("Status d'emprunt : " + (isBooked ? "Emprunté" : "Dispo"));
        System.out.println("Quantité des médias : " + getQuantiteMedias());
        System.out.println("************************************");
    }

}
