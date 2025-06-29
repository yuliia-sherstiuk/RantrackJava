import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class MultiThreadedStringWriter {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la longueur de la chaîne aléatoire : ");
        int length = scanner.nextInt();

        long startTime = System.currentTimeMillis();

        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            sb.append(characters.charAt(random.nextInt(characters.length())));
        }

        String fullString = sb.toString();
        String part1 = fullString.substring(0, length / 2);
        String part2 = fullString.substring(length / 2);

        Thread t1 = new Thread(() -> {
            try (FileWriter writer = new FileWriter("output.txt")) {
                writer.write(part1);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            try (FileWriter writer = new FileWriter("output.txt", true)) {
                writer.write(part2);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();

        t1.join(); 
        t2.join();

        long endTime = System.currentTimeMillis();
        System.out.println("Temps d'exécution (multi-thread) : " + (endTime - startTime) + " ms");
        scanner.close();
    }
}
