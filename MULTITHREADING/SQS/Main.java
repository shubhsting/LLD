package MULTITHREADING.SQS;

import MULTITHREADING.SQS.consumer.AdditionConsumer;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SQSQueue queue = new SQSQueue();
        queue.registerConsumer(new AdditionConsumer());
        queue.registerConsumer(new AdditionConsumer());
        queue.registerConsumer(new AdditionConsumer());
        queue.registerConsumer(new AdditionConsumer());
        queue.publish(new CalculationMessage(1,2));
//        Thread.sleep(2000);
        queue.publish(new CalculationMessage(3,4));
//        Thread.sleep(2000);
        queue.publish(new CalculationMessage(5,6));
        queue.publish(new CalculationMessage(7,8));
        queue.publish(new CalculationMessage(9,10));
        queue.publish(new CalculationMessage(11,12));
    }
}
