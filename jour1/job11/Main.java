import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        long n = scanner.nextInt();

        if (n < 0) {
            System.out.println("La factorielle n'est pas définie pour les nombres négatifs.");
        } else {
            BigInteger factorial = BigInteger.ONE;
            for (long i = 1; i <= n; i++) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }
            System.out.println("La factorielle de " + n + " est : " + factorial);
        }

        scanner.close(); 
    }
}
