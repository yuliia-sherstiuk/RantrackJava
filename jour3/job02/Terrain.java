public class Terrain extends Carte {
    private char couleur; // 'B', 'b', 'n', 'r', 'v'

    public Terrain(char couleur) {
        super(0);
        this.couleur = couleur;
    }

    @Override
    public void afficher() {
        System.out.println("Type : Terrain");
        System.out.println("Coût : " + cout);
        System.out.println("Couleur : " + couleur);
    }
}
