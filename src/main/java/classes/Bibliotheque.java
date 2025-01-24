package classes;

import java.util.ArrayList;
import java.util.List;


public class Bibliotheque {

    private List<Media> mediaEmpruntes;

    public Bibliotheque() {
        this.mediaEmpruntes = new ArrayList<>();
    }

    public void emprunterMedia(Media media){
        if (media != null && !mediaEmpruntes.contains(media)){
            mediaEmpruntes.add(media);
            System.out.println("MEDIA: " + media.getTitle() + "emprunté");
        } else {
            assert media != null;
            System.out.println("Le média " + media.getTitle() + " est déjà emprunté ou n'existe pas.");
        }
    }

    public void retournerMedia(Media media) {

        for (int i = 0; i < mediaEmpruntes.size(); i++) {
            Media mediaInLoop = mediaEmpruntes.get(i);
            if (mediaInLoop.equals(media)){
                mediaEmpruntes.remove(i);
                System.out.println("Le média numéro " + (i + 1) + " : " + mediaInLoop.getTitle() + " a été retourné.");
                return;
            }
        }
        System.out.println("Le média " + media.getTitle() + " n'est pas enregistré comme emprunté.");
    }


    public void afficherEmprunt(){
        if (mediaEmpruntes.isEmpty()){
            System.out.println("Pas de média emprunté.");
        }
        System.out.println("Liste des médias empruntés :");
        for (int i = 0; i < mediaEmpruntes.size(); i++){
            Media media = mediaEmpruntes.get(i);
            System.out.println("Media numéro :" + (i+1) );
            media.afficher();
        }
    }
}
