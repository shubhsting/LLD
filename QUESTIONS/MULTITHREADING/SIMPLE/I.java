package QUESTIONS.MULTITHREADING.SIMPLE;

public class I implements Runnable {
    CommonState commonState;

    public I(CommonState state) {
        this.commonState = state;
    }

    @Override
    public void run() {
        synchronized (commonState) {
            while (!commonState.name.equals("I")) {
                try {
                    commonState.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("I");
            commonState.setState("AM");;
            commonState.notifyAll();
        }
    }

}
