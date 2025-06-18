import java.util.Scanner; // Importe la classe Scanner pour lire les entrées utilisateur depuis le clavier

public class Main { // Déclaration de la classe principale Main
    public static void main(String[] args) { // Méthode principale : point d’entrée du programme
        Scanner scanner = new Scanner(System.in); // Crée un objet Scanner pour lire les entrées de l'utilisateur
        int sum = 0; // Initialise une variable pour stocker la somme des nombres saisis

        System.out.println("Entrez 5 nombres :"); // Affiche un message demandant à l'utilisateur d'entrer 5 nombres

        for (int i = 0; i < 5; i++) { // Boucle qui s'exécute 5 fois pour lire 5 nombres
            System.out.print("Entrez le nombre " + (i + 1) + " : "); // Affiche le numéro du nombre à entrer
            int nombre = scanner.nextInt(); // Lit le nombre entier saisi par l'utilisateur
            sum += nombre; // Ajoute le nombre à la somme totale
        }

        float average = (float) sum / 5; // Calcule la moyenne en divisant la somme par 5 (conversion en float pour précision)
        System.out.println("La moyenne est : " + average); // Affiche le résultat de la moyenne
    }
}