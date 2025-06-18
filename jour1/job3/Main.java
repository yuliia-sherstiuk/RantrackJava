public class Main {
    public static void main(String[] args) {
        int[] T = new int[10]; // Créer un tableau de 10 nombres
        for (int i = 0; i < T.length; i++) {
            T[i] = i; // Remplir le tableau avec des nombres de 0 à 9
        }

        System.out.println("T[0] = " + T[0]);
        System.out.println("T[1] = " + T[1]);
        System.out.println("T[5] = " + T[5]);
        System.out.println("T[9] = " + T[9]);
     // System.out.println("T[10] = " + T[10]); // C'est une erreur ! Le tableau se termine à [9]
    }
}