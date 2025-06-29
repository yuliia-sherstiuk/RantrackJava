import java.util.Scanner;

public class SequentialSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Entrez la taille du tableau : ");
        int taille = scanner.nextInt();

        int[] tableau = new int[taille];

    
        System.out.println("Entrez les éléments du tableau :");
        for (int i = 0; i < taille; i++) {
            tableau[i] = scanner.nextInt();
        }

      
        long debut = System.currentTimeMillis();

        int somme = 0;
        for (int i = 0; i < taille; i++) {
            somme += tableau[i];
        }

      
        long fin = System.currentTimeMillis();

      
        System.out.println("Somme totale : " + somme);
        System.out.println("Temps d'exécution : " + (fin - debut) + " ms");

        scanner.close();
    }
}