public class Avion extends Vehicule {
    private String typeMoteur; // "HELICES" ou "REACTION"
    private int heuresVol;

    public Avion(String marque, int anneeAchat, double prixAchat, String typeMoteur, int heuresVol) {
        super(marque, anneeAchat, prixAchat);
        this.typeMoteur = typeMoteur;
        this.heuresVol = heuresVol;
    }

    @Override
    public void calculePrix(int anneeActuelle) {
        prixCourant = prixAchat;

        if (typeMoteur.equalsIgnoreCase("HELICES")) {
            prixCourant -= prixAchat * 0.10 * Math.round(heuresVol / 100.0);
        } else {
            prixCourant -= prixAchat * 0.10 * Math.round(heuresVol / 1000.0);
        }

        if (prixCourant < 0) {
            prixCourant = 0;
        }
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Type de moteur: " + typeMoteur);
        System.out.println("Heures de vol: " + heuresVol);
    }
}
