package MULTITHREADING.DINING_PHILOSOPHER;

import java.util.ArrayList;
import java.util.List;

public class DiningPhilosopherHandler {
    public static void main(String[] args) {
        List<Chopstick> chopstickList = new ArrayList<>();
        chopstickList.add(new Chopstick(0));
        chopstickList.add(new Chopstick(1));
        chopstickList.add(new Chopstick(2));
        chopstickList.add(new Chopstick(3));
        chopstickList.add(new Chopstick(4));
        List<Philosopher> philosopherList = new ArrayList<>();
        philosopherList.add(new Philosopher(0, chopstickList));
        philosopherList.add(new Philosopher(1, chopstickList));
        philosopherList.add(new Philosopher(2, chopstickList));
        philosopherList.add(new Philosopher(3, chopstickList));
        philosopherList.add(new Philosopher(4, chopstickList));

        for (Philosopher philosopher : philosopherList) new Thread(philosopher).start();
    }

}
