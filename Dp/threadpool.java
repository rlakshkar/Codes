import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EvenOddThreadPool {
    public static void main(String[] args) {
        // Define a range of numbers
        int start = 1;
        int end = 20;

        // Create a thread pool with two threads
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // Task for printing even numbers
        Runnable evenTask = () -> {
            for (int i = start; i <= end; i++) {
                if (i % 2 == 0) {
                    System.out.println("Even: " + i + " - " + Thread.currentThread().getName());
                }
            }
        };

        // Task for printing odd numbers
        Runnable oddTask = () -> {
            for (int i = start; i <= end; i++) {
                if (i % 2 != 0) {
                    System.out.println("Odd: " + i + " - " + Thread.currentThread().getName());
                }
            }
        };

        // Submit tasks to the thread pool
        executorService.submit(evenTask);
        executorService.submit(oddTask);

        // Shut down the executor service
        executorService.shutdown();
    }
}