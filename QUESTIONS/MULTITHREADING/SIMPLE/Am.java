package QUESTIONS.MULTITHREADING.SIMPLE;

public class Am implements Runnable{
    CommonState commonState;
    public Am (CommonState state) {
        this.commonState = state;
    }
    @Override
    public void run() {
        synchronized (commonState) {
            while (!commonState.name.equals("AM")) {
                try {
                    commonState.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Am");
            commonState.setState("SHUBHAM");
            commonState.notifyAll();
        }
    }
    
}
