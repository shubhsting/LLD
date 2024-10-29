package MULTITHREADING.SQS.consumer;

import MULTITHREADING.SQS.CalculationMessage;

import java.util.Queue;


public class ConsumerWorker implements Runnable {
    final IConsumer consumer;
    final Queue<CalculationMessage> queue;

    public ConsumerWorker(final Queue<CalculationMessage> queue, final IConsumer consumer) {
        this.consumer = consumer;
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            CalculationMessage message;
            synchronized (queue) {
                while (queue.isEmpty()) {
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                message = queue.remove();
            }
            try {
                consumer.consume(message);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
