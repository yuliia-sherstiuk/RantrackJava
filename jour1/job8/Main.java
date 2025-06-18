import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // // Crée un scanner pour lire depuis le clavier

        System.out.print("Enter a number: "); // // Demande à l'utilisateur de saisir un nombre
        long n = scanner.nextInt(); // // Lit le nombre entier

        long sum = 0; // // Initialise la somme

        // // Boucle pour calculer la somme des cubes de 1 à n
        for (long i = 1; i <= n; i++) {
            sum += i * i * i; // // Ajoute le cube de i à la somme
        }

        System.out.println("The sum of the first " + n + " cubes is: " + sum); // // Affiche la somme
    }
}

        