package MULTITHREADING.MESSAGE_BROKER;

import MULTITHREADING.MESSAGE_BROKER.consumer.ConsumerWorker;
import MULTITHREADING.MESSAGE_BROKER.consumer.IConsumer;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    final String topicName;
    final List<CalculationMessage> queue;
    final List<IConsumer> consumerList;

    public Topic(String topicName) {
        this.topicName = topicName;
        queue = new ArrayList<>();
        consumerList = new ArrayList<>();
    }

    public void subscribe(IConsumer consumer) {
        consumerList.add(consumer);
        new Thread(new ConsumerWorker(queue, consumer)).start();
    }

    protected void publish(CalculationMessage message) {
        synchronized (queue) {
            queue.add(message);
            queue.notifyAll();
        }
    }
}
