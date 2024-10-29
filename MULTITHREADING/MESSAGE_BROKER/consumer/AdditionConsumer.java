package MULTITHREADING.MESSAGE_BROKER.consumer;

import MULTITHREADING.MESSAGE_BROKER.CalculationMessage;

public class AdditionConsumer implements IConsumer {
    @Override
    public void consume(CalculationMessage message) throws InterruptedException {
        System.out.println("Started addition evaluation of message: " + message.toString());
        Thread.sleep(3000);
        System.out.println(Thread.currentThread().getName() + " Addition result was found to be: " + (message.a + message.b));
    }
}
