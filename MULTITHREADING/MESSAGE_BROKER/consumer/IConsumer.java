package MULTITHREADING.MESSAGE_BROKER.consumer;

import MULTITHREADING.MESSAGE_BROKER.CalculationMessage;

public interface IConsumer {

    public void consume(CalculationMessage message) throws InterruptedException;
}
