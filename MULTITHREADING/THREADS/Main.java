package MULTITHREADING.THREADS;

public class Main {
    public static void main(String[] args) {
        Create_Thread_2 th = new Create_Thread_2();
        // Create_Thread a =  new Create_Thread("one");
        // Create_Thread b =  new Create_Thread("two");
        // Create_Thread c =  new Create_Thread("three");
        // a.start();
        // b.start();
        // c.start();
        Thread a = new Thread(th);
        a.start();
    }
}
