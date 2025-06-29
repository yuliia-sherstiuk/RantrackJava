import java.util.Scanner;

class CounterThread extends Thread {
    private int start;
    private int end;
    private int count;

    public CounterThread(int start, int end) {
        this.start = start;
        this.end = end;
        this.count = 0;
    }

    
    public void run() {
        for (int i = start; i <= end; i++) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}

public class ParallelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nombre maximum à compter : ");
        int max = scanner.nextInt();
        scanner.close();

        int mid = max / 2;

        long startTime = System.currentTimeMillis();

        
        CounterThread thread1 = new CounterThread(1, mid);
        CounterThread thread2 = new CounterThread(mid + 1, max);

        thread1.start();
        thread2.start();

        try {
         
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int totalCount = thread1.getCount() + thread2.getCount();

        long endTime = System.currentTimeMillis();

     
        System.out.println("Compte total : " + totalCount);
        System.out.println("Temps d'exécution : " + (endTime - startTime) + " ms");
    }
}
