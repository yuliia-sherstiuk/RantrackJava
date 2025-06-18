import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre entier : ");

        long n = scanner.nextInt();

        long inverse = 0;
        long original = n;
        while (n != 0) {
            long chiffre = n % 10; // Récupère le dernier chiffre
            inverse = inverse * 10 + chiffre; // Ajoute le chiffre à l'inverse
            n = n / 10; // Enlève le dernier chiffre
        }


        System.out.println("Le nombre inversé est : " + inverse);

    }
}