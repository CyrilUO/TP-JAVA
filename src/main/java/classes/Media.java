package classes;

public abstract class Media {

    private String title;
    private static int quantiteMedias = 0;

    public Media(String title){
        this.title = title;
        quantiteMedias++;
    }

    public Media() {
        quantiteMedias++;
    };

    public abstract void afficher();


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static int getQuantiteMedias() {
        return quantiteMedias;
    }


}
