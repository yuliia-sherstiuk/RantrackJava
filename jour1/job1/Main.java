import java.util.Scanner;//import sc class

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner (System.in);
        System.out.println ("Entrez quelque chose:  ");
        String imput = myObj.nextLine();
        System.out.println("Votre chox est :" + imput);
        myObj.close();

    }
}