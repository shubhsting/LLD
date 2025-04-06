package MULTITHREADING.LOCK;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // Test test = new Test();
        // Thread thread = new Thread(() -> {
        //     test.lock.lock();
        // });
        // Test test2 = new Test();
        // Thread thread2 = new Thread(() -> {
        //     test2.lock.lock();
        // });
        // Test test3 = new Test();
        // Thread thread3 = new Thread(() -> {
        //     test3.lock.lock();
        // });

        // thread.start();
        // thread2.start();
        // thread3.start();

        // System.out.println(test.lock.tryLock());
        ExecutorService service = Executors.newCachedThreadPool();
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            return "hello";
        }, service);
        System.out.println(future.join());
        service.shutdown();
    }
}
