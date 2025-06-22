public class Main {
    public static void main(String[] args) {
        int anneeActuelle = 2025;

        System.out.println("--- VOITURE 1---");
        Voiture v = new Voiture("Bugatti", 2020, 20000, 1600, 5, 110, 85000);
        v.calculePrix(anneeActuelle);
        v.affiche();

        System.out.println("\n--- VOITURE 2 ---");
        Voiture v2 = new Voiture("Ferrari", 2020, 150000, 3000, 2, 600, 20000);
        v2.calculePrix(anneeActuelle);
        v2.affiche();

        System.out.println("\n--- AVION ---");
        Avion a = new Avion("Boeing", 2015, 5000000, "REACTION", 6000);
        a.calculePrix(anneeActuelle);
        a.affiche();

        System.out.println("\n--- AVION 2 ---");
        Avion a2 = new Avion("Airbus", 2020, 300000, "HELICES", 7000);
        a2.calculePrix(anneeActuelle);
        a2.affiche();
    }
}
