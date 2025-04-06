package QUESTIONS.MULTITHREADING.SIMPLE;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CommonState state = new CommonState("I");
        new Thread(new Shubham(state)).start();
        Thread.sleep(4000);
        new Thread(new I(state)).start();
        new Thread(new Am(state)).start();
    }
}
