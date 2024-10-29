package MULTITHREADING.BASICS;

public class Am implements Runnable {
    CommonState commonState;

    Am(CommonState commonState) {
        this.commonState = commonState;
    }

    @Override
    public void run() {
        synchronized (commonState) {
            while (commonState.getState() != StateName.AM) {
                try {
                    commonState.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Am");
            commonState.setState(StateName.SHUBHAM);
            commonState.notifyAll();
        }
    }
}