package MULTITHREADING.SQS;

import MULTITHREADING.SQS.consumer.ConsumerWorker;
import MULTITHREADING.SQS.consumer.IConsumer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SQSQueue {
    final Queue<CalculationMessage> queue;
    final List<IConsumer> consumerList;

    public SQSQueue() {
        this.queue = new LinkedList<>();
        this.consumerList = new ArrayList<>();
    }

    public void registerConsumer(IConsumer consumer) {
        consumerList.add(consumer);
        new Thread(new ConsumerWorker(queue, consumer)).start();
    }

    public void publish(CalculationMessage message) {
        synchronized (queue) {
            System.out.println("message added to queue" + message.toString());
            queue.add(message);
            queue.notifyAll();
        }
    }
}
