public class Rectangle {
    private double largeur;
    private double longueur;

    public Rectangle(double largeur, double longueur) {
        this.largeur = largeur;
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double surface() {
        return largeur * longueur;
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(3.5, 4.0);
        System.out.println("Largeur: " + rect.getLargeur());
        System.out.println("Longueur: " + rect.getLongueur());
        System.out.println("Surface: " + rect.surface());
    }
}
