package MULTITHREADING.SQS.consumer;

import MULTITHREADING.SQS.CalculationMessage;

public class SubtractionConsumer implements IConsumer {

    public SubtractionConsumer() {
    }

    @Override
    public void consume(CalculationMessage message) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " Started Subtraction Computation" + message.toString());
        Thread.sleep(5000);
        System.out.println(Thread.currentThread().getName() + "Computation Subtraction Completed: " + (message.a - message.b));
    }
}
