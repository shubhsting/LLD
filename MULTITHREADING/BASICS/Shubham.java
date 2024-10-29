package MULTITHREADING.BASICS;

public class Shubham implements Runnable {
    CommonState commonState;

    Shubham(CommonState commonState) {
        this.commonState = commonState;
    }

    @Override
    public void run() {
        synchronized (commonState) {
            while (commonState.getState() != StateName.SHUBHAM) {
                try {
                    commonState.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Shubham");
            commonState.notifyAll();
        }
    }
}