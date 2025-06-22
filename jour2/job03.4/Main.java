public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(1, 2, 3, 4);
        r.affiche();
        System.out.println("Surface : " + r.surface());

        System.out.println();

        RectangleColore rc = new RectangleColore(2, 3, 4, 5, 123456);
        rc.affiche();
        System.out.println("Surface : " + rc.surface());

        System.out.println();

        Cercle c = new Cercle(0, 0, 5);
        c.affiche();
        System.out.println("Surface : " + c.surface());
        System.out.println("Le point (3,4) est à l’intérieur ? " + c.estInterieur(3, 4));
        System.out.println("Le point (6,0) est à l’intérieur ? " + c.estInterieur(6, 0));
    }
}
