public class Voiture extends Vehicule {
    private int cylindree;
    private int nbPortes;
    private int puissance;
    private int kilometrage;

    public Voiture(String marque, int anneeAchat, double prixAchat, int cylindree, int nbPortes, int puissance, int kilometrage) {
        super(marque, anneeAchat, prixAchat);
        this.cylindree = cylindree;
        this.nbPortes = nbPortes;
        this.puissance = puissance;
        this.kilometrage = kilometrage;
    }

    @Override
    public void calculePrix(int anneeActuelle) {
        int age = anneeActuelle - anneeAchat;
        prixCourant = prixAchat;
        prixCourant -= prixAchat * 0.02 * age;
        prixCourant -= prixAchat * 0.05 * Math.round(kilometrage / 10000.0);

        // Rabais pour certaines marques
        if (marque.equalsIgnoreCase("Renault") || marque.equalsIgnoreCase("Fiat")) {
            prixCourant -= prixAchat * 0.10;
        }

        // Bonus pour marques prestigieuses
        if (marque.equalsIgnoreCase("Ferrari") || marque.equalsIgnoreCase("Porsche")) {
            prixCourant += prixAchat * 0.20;
        }

        if (prixCourant < 0) {
            prixCourant = 0;
        }
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Cylindrée: " + cylindree);
        System.out.println("Nombre de portes: " + nbPortes);
        System.out.println("Puissance: " + puissance);
        System.out.println("Kilométrage: " + kilometrage);
    }
}
