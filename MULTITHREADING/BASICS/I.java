package MULTITHREADING.BASICS;

public class I implements Runnable {
    CommonState commonState;

    I(CommonState commonState) {
        this.commonState = commonState;
    }

    @Override
    public void run() {
        synchronized (commonState) {
            while (commonState.getState() != StateName.I) {
                try {
                    commonState.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("I");
            commonState.setState(StateName.AM);
            commonState.notifyAll();
        }
    }
}
