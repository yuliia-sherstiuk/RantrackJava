import java.util.Scanner;

// Classe qui représente un thread pour calculer une somme partielle
class SumThread extends Thread {
    private int[] array;      // Tableau d'entiers
    private int start, end;   // Indices de début et de fin pour cette portion du tableau
    private int sum = 0;      // Somme locale pour ce thread

    // Constructeur : on donne le tableau et les limites à ce thread
    public SumThread(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    // Méthode exécutée automatiquement quand le thread démarre
    public void run() {
        for (int i = start; i < end; i++) {
            sum += array[i]; // On additionne chaque élément de la portion assignée
        }
    }

    // Méthode pour récupérer la somme calculée par ce thread
    public int getSum() {
        return sum;
    }
}

// Classe principale du programme
public class ParallelSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Création d'un scanner pour lire les entrées utilisateur

        // Étape 1 : Demander la taille du tableau
        System.out.print("Entrez la taille du tableau : ");
        int taille = scanner.nextInt(); // Lire la taille
        int[] tableau = new int[taille]; // Créer un tableau de la taille donnée

        // Étape 2 : Remplir le tableau avec les nombres entrés par l'utilisateur
        System.out.println("Entrez les éléments du tableau :");
        for (int i = 0; i < taille; i++) {
            tableau[i] = scanner.nextInt();
        }

        // Étape 3 : Calculer le point de séparation (milieu du tableau)
        int milieu = taille / 2;

        // Démarrer le chronomètre
        long debut = System.currentTimeMillis();

        // Étape 4 : Créer deux threads pour chaque moitié du tableau
        SumThread t1 = new SumThread(tableau, 0, milieu);        // Première moitié
        SumThread t2 = new SumThread(tableau, milieu, taille);   // Deuxième moitié

        // Étape 5 : Lancer les deux threads en parallèle
        t1.start();
        t2.start();

        try {
            // Attendre que les deux threads aient terminé leur travail
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace(); // En cas d'erreur d'interruption
        }

        // Étape 6 : Récupérer les résultats de chaque thread et calculer la somme totale
        int sommeTotale = t1.getSum() + t2.getSum();

        // Arrêter le chronomètre
        long fin = System.currentTimeMillis();

        // Afficher le résultat final
        System.out.println("Somme totale : " + sommeTotale);
        System.out.println("Temps d'exécution : " + (fin - debut) + " ms");

        scanner.close(); // Fermer le scanner pour éviter les fuites de ressources
    }
}
