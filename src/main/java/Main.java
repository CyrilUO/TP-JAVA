import classes.Bibliotheque;
import classes.subclasses.Journal;
import classes.subclasses.Livre;
import classes.subclasses.Magazine;

public class Main {
    public static void main(String[] args) {
        Livre livre1 = new Livre("Jon", false);
        Livre livre2 = new Livre("Frankenstein", true);

        Journal journal = new Journal("Libération", true);

        Bibliotheque bibliotheque = new Bibliotheque();

        bibliotheque.emprunterMedia(livre2);
        bibliotheque.emprunterMedia(livre1);
        bibliotheque.emprunterMedia(journal);
        bibliotheque.afficherEmprunt();

        bibliotheque.retournerMedia(journal);
        bibliotheque.afficherEmprunt();

    }
}


/**
 * Emprunt et le retour de médias
 * La consultation de médias sur place
 * Le suivi des emprunts en cours
 * La gestion des informations de base sur les médias (titre, auteur, auteur, durée)
 */