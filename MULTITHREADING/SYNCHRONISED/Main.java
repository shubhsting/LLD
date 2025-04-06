package MULTITHREADING.SYNCHRONISED;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(0);
        MyThread a = new MyThread("first", counter);
        MyThread b = new MyThread("second", counter);
        a.start();
        b.start();
        try {
            a.join();
            b.join();
        }catch (Exception e){

        }
        System.out.println(counter.getNo());
    }
}
