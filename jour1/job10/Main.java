import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int factorial = 1;  

        //  Boucle pour multiplier 
        for (int i = 1; i <= 8; i++) {
            factorial *= i; // // Multiplie fact. par i
        }

        System.out.println("The factorial of 8 is: " + factorial); 
    }
}