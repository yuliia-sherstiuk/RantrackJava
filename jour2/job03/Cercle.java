 public class Cercle {
    private double x;
    private double y;
    private double rayon;

    public Cercle(double x, double y, double rayon) {
        this.x = x;
        this.y = y;
        this.rayon = rayon;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public void affiche() {
        System.out.println("Centre: (" + x + ", " + y + "), Rayon: " + rayon);
    }

    public double surface() {
        return Math.PI * rayon * rayon;
    }

    public boolean estInterieur(double px, double py) {
        double distance = Math.sqrt(Math.pow(px - x, 2) + Math.pow(py - y, 2));
        return distance <= rayon;
    }

    public static void main(String[] args) {
        Cercle c = new Cercle(0.0, 0.0, 5.0);
        c.affiche();
        System.out.println("Surface: " + c.surface());
        System.out.println("Le point (3,4) est à l’intérieur ? " + c.estInterieur(3, 4));
        System.out.println("Le point (6,0) est à l’intérieur ? " + c.estInterieur(6, 0));
    }
}
