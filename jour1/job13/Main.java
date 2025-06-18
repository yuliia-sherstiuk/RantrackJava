import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur d'entrer un nombre <= 9
        System.out.print("Entrez un nombre entier (0  => 9) : ");
        int n = scanner.nextInt();

        if (n <= 9) {
            // Affiche la table de multiplication
            System.out.println("Table de multiplication de " + n + " :");
            for (int i = 1; i <= 10; i++) {
                // Affiche  ligne de la table
                 int num = n * i;
                System.out.println(n + " x " + i + " = " + (num));
            }
        } else {
            // Message d'erreur
            System.out.println("Erreur : le nombre doit être inférieur ou égal à 9.");
        }
    }
}