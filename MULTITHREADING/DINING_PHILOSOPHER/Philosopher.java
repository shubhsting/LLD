package MULTITHREADING.DINING_PHILOSOPHER;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

import java.util.List;

@AllArgsConstructor
public class Philosopher implements Runnable {

    int index;
    List<Chopstick> chopsticks;

    public void eat() throws InterruptedException {
        System.out.println("Philosopher " + index + " have started eating!");
        Thread.sleep(4000);
        System.out.println("Philosopher " + index + " have finished eating!");
    }

    public void think() throws InterruptedException {
        System.out.println("Philosopher " + index + " have started thinking!");
        Thread.sleep(2000);
        System.out.println("Philosopher " + index + " have finished thinking!");
    }

    @SneakyThrows
    @Override
    public void run() {
        final Chopstick leftChopstick = chopsticks.get(index);
        final Chopstick rightChopstick = chopsticks.get((index + 1) % chopsticks.size());
        while (true) {
            think();
            try {
                leftChopstick.lock.lock();
                if (rightChopstick.lock.tryLock()) {
                    try {
                        eat();
                    } finally {
                        rightChopstick.lock.unlock();
                    }
                }

            } finally {
                leftChopstick.lock.unlock();
            }
        }
    }
}

//[p1, p2, p3, p4, p5, p6]
// [s1, s2, s3, s4, s5, s6]