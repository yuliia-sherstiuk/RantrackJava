import java.util.Scanner;

public class SequentialCounter {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nombre maximum à compter : ");
        int max = scanner.nextInt();

      
        long startTime = System.currentTimeMillis();

       
        int count = 0;
        for (int i = 1; i <= max; i++) {
            count++;
        }

       
        long endTime = System.currentTimeMillis();

     
        System.out.println("Compte total : " + count);
        System.out.println("Temps d'exécution : " + (endTime - startTime) + " ms");

      
        scanner.close();
    }
}
