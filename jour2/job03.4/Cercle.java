 public class Cercle extends Figure {
    private double rayon;

    public Cercle(double x, double y, double rayon) {
        super(x, y);
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Cercle : rayon = " + rayon);
    }

    public double surface() {
        return Math.PI * rayon * rayon;
    }

    public boolean estInterieur(double px, double py) {
        double distance = Math.sqrt(Math.pow(px - x, 2) + Math.pow(py - y, 2));
        return distance <= rayon;
    }
}

