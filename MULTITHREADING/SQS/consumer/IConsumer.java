package MULTITHREADING.SQS.consumer;

import MULTITHREADING.SQS.CalculationMessage;

public interface IConsumer {
    void consume(CalculationMessage message) throws InterruptedException;
}
