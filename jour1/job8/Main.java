import java.util.Scanner; // Importe la classe Scanner pour lire les entrées utilisateur


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crée un objet Scanner pour lire les entrées de l'utilisateur
        system.out.print("Entrez un nombre : "); // Affiche un message demandant à l'utilisateur d'entrer un nombre
        
        int num = scanner.nextInt(); // Lit le nombre saisi par l'utilisateur

        int sum = 0; // Déclare une variable pour stocker la somme   
            for (int i = 1; i <= num; i++) { // Boucle qui s'exécute de 1 à num
            sum += ( i * i * i ); // Ajoute i à la somme cube


        }
        system.out.println("La somme des cubes des nombres de 1 à " + num + " est : " + sum); // Affiche le résultat
    } 
}       
        