import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Entrer le votre age : ");
        int age = scanner.nextInt();
        if (age < 18) {
            System.out.println("Vous etes mineur");
        } else {
            System.out.println("Vous etes majeur");
        }

       scanner.close();




    }
}