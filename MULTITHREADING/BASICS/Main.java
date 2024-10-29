package MULTITHREADING.BASICS;

public class Main {
    public static void main(String[] args) {
        CommonState commonState = new CommonState(StateName.I);
        new Thread(new Shubham(commonState)).start();
        new Thread(new Am(commonState)).start();
        new Thread(new I(commonState)).start();

    }
}
