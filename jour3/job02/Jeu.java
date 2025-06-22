public class Jeu {
    private Carte[] cartes;
    private int compteur;

    public Jeu() {
        cartes = new Carte[10];
        compteur = 0;
    }

    public void piocher(Carte carte) {
        if (compteur < cartes.length) {
            cartes[compteur++] = carte;
        } else {
            System.out.println("Le jeu est plein.");
        }
    }

    public void jouer() {
        for (int i = 0; i < cartes.length; i++) {
            if (cartes[i] != null) {
                System.out.println("--- Jouer une carte ---");
                cartes[i].afficher();
                cartes[i] = null;
                break;
            }
        }
    }

    public void afficher() {
        System.out.println("=== Jeu de cartes ===");
        for (int i = 0; i < cartes.length; i++) {
            if (cartes[i] != null) {
                System.out.println("Carte " + (i + 1) + ":");
                cartes[i].afficher();
                System.out.println();
            }
        }
    }
}
