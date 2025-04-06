package QUESTIONS.SQS;

import java.util.ArrayList;
import java.util.List;

import QUESTIONS.SQS.CONSUMER.ConsumerWorker;
import QUESTIONS.SQS.CONSUMER.IConsumer;

public class SQS {
    List<IMessage> messageStore;
    List<IConsumer> consumers;

    public SQS() {
        this.consumers = new ArrayList<>();
        this.messageStore = new ArrayList<>();
    }

    public void addConsumer(IConsumer consumer) {
        consumers.add(consumer);
        new Thread(new ConsumerWorker(consumer, messageStore)).start();
    }

    public void pushMessage(IMessage message) {
        synchronized(messageStore) {
            messageStore.add(message);
            messageStore.notifyAll();
        }
    }
}
