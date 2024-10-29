package MULTITHREADING.SQS.consumer;

import MULTITHREADING.SQS.CalculationMessage;

public class AdditionConsumer implements IConsumer {

    public AdditionConsumer() {
    }

    @Override
    public void consume(CalculationMessage message) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " Started Computation" + message.toString());
        Thread.sleep(5000);
        System.out.println(Thread.currentThread().getName() + "Computation Completed: " + (message.a + message.b));
    }
}
