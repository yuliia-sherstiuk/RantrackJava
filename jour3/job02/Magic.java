public class Magic {
    public static void main(String[] args) {
        Jeu jeu = new Jeu();

        Carte c1 = new Terrain('r');
        Carte c2 = new Creature("Dragon", 5, 4, 3);
        Carte c3 = new Sortilege("Boule de feu", "Inflige 3 dégâts à l'adversaire", 2);

        jeu.piocher(c1);
        jeu.piocher(c2);
        jeu.piocher(c3);

        jeu.afficher();

        jeu.jouer();
        jeu.afficher();
    }
}
