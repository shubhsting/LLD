package MULTITHREADING.MESSAGE_BROKER.consumer;

import MULTITHREADING.MESSAGE_BROKER.CalculationMessage;

import java.util.List;

public class ConsumerWorker implements Runnable {
    final List<CalculationMessage> queue;
    final IConsumer consumer;

    public ConsumerWorker(final List<CalculationMessage> queue,
                          final IConsumer consumer) {
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
                message = queue.remove(0);
            }
            try {
                consumer.consume(message);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

