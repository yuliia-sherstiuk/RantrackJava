// Classe Rectangle
class Rectangle {
    protected double largeur;
    protected double hauteur;

    public Rectangle(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public String toString() {
        return "Rectangle :\nlargeur = " + largeur + "\nhauteur = " + hauteur;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Rectangle)) return false;
        Rectangle r = (Rectangle) obj;
        return this.largeur == r.largeur && this.hauteur == r.hauteur;
    }
}