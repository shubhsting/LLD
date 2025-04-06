package QUESTIONS.SQS.CONSUMER;

import java.util.List;

import QUESTIONS.SQS.IMessage;

public class ConsumerWorker implements Runnable {
    IConsumer consumer;
    List<IMessage> messageStore;

    public ConsumerWorker(IConsumer consumer, List<IMessage> messageStore) {
        this.consumer = consumer;
        this.messageStore = messageStore;
    }
    
    @Override
    public void run() {
        IMessage message;

        while(true) {
            synchronized(messageStore) {
                while (messageStore.isEmpty())
                try {
                    messageStore.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                message = messageStore.remove(0);
            }
            consumer.consume(message);
        }
    }

}
