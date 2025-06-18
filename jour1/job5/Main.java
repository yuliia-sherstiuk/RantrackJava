import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nombre 1 : "); // Demande à l'utilisateur d'entrer le premier nombre
        int a = scanner.nextInt(); // Lit le premier nombre
        System.out.print("Entrez le nombre 2 : "); 
        int b = scanner.nextInt(); 
        System.out.print("Entrgitez le nombre 3 : "); 
        int c = scanner.nextInt();

        int max = a; // Initialise max avec la valeur du premier nombre
        if (b > max) max = b; // Si le deuxième nombre est plus grand, met à jour max
        if (c > max) max = c; 

        System.out.println("Le maximum est : " + max); // Affiche le maximum
    }
}