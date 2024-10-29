package MULTITHREADING.MESSAGE_BROKER.consumer;


import MULTITHREADING.MESSAGE_BROKER.CalculationMessage;

public class SubtractionConsumer implements IConsumer {
    @Override
    public void consume(CalculationMessage message) throws InterruptedException {
        System.out.println("Started subtraction evaluation of message: " + message.toString());
        Thread.sleep(3000);
        System.out.println(Thread.currentThread().getName() + "Subtraction result was found to be: " + (message.a - message.b));
    }
}

