import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre : "); // Demande  d'entrer un nombre
        int num = scanner.nextInt(); // Lit le nombre 
        int square = num * num; //  carre du nombre
        System.out.println("Le carré du nombre est : " + square); // Affiche le resultat
    }
}
