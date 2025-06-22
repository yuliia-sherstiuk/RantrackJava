public class Vehicule {
    protected String marque;
    protected int anneeAchat;
    protected double prixAchat;
    protected double prixCourant;

    public Vehicule(String marque, int anneeAchat, double prixAchat) {
        this.marque = marque;
        this.anneeAchat = anneeAchat;
        this.prixAchat = prixAchat;
        this.prixCourant = prixAchat; // Initialise le prix courant avec le prix d'achat
    }

    public void calculePrix(int anneeActuelle) {
        int age = anneeActuelle - anneeAchat;
        prixCourant = prixAchat - (prixAchat * 0.01 * age);
        if (prixCourant < 0) {
            prixCourant = 0;
        }
    }

    public void affiche() {
        System.out.println("Marque: " + marque);
        System.out.println("Année d'achat: " + anneeAchat);
        System.out.println("Prix d'achat: " + prixAchat);
        System.out.println("Prix courant: " + prixCourant);
    }
}
