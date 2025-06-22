public class RectangleColore extends Rectangle {
    private int couleur;

    public RectangleColore(double largeur, double longueur, int couleur) {
        super(largeur, longueur); // Rectangle
        this.couleur = couleur;
    }

    public int getCouleur() {
        return couleur;
    }

    public void setCouleur(int couleur) {
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return "RectangleColore [largeur=" + getLargeur() + ", longueur=" + getLongueur() +
               ", couleur=" + couleur + ", surface=" + surface() + "]";
    }

    public static void main(String[] args) {
        RectangleColore rc = new RectangleColore(255, 255, 255);
        System.out.println(rc.toString());
    }
}
