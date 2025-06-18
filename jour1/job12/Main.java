import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir un nombre entier
        System.out.print("Entrez un nombre entier : ");
        int n = scanner.nextInt();

        System.out.println("Les nombres pairs jusqu'à " + n + " sont :");

        // Boucle de 0 à n
        for (int i = 0; i <= n; i++) {
            // Vérifie si le nombre est pair
            if (i % 2 == 0) {
                System.out.println(i); // Affiche le nombre pair
            }
        }
    }
}