package QUESTIONS.MULTITHREADING.SIMPLE;

public class Shubham implements Runnable {
    CommonState commonState;
    public Shubham (CommonState state) {
        this.commonState = state;
    }
    @Override
    public void run() {
        synchronized (commonState) {
            while (!commonState.name.equals("SHUBHAM")) {
                try {
                    commonState.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Shubham");
            commonState.setState(null);;
            commonState.notifyAll();
        }
    }
}
