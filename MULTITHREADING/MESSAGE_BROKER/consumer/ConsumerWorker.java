package MULTITHREADING.MESSAGE_BROKER.consumer;

import MULTITHREADING.MESSAGE_BROKER.CalculationMessage;
import lombok.SneakyThrows;

import java.util.List;

public class ConsumerWorker implements Runnable {
    final List<CalculationMessage> queue;
    final IConsumer consumer;

    public ConsumerWorker(final List<CalculationMessage> queue,
                          final IConsumer consumer) {
        this.consumer = consumer;
        this.queue = queue;
    }

    @SneakyThrows
    @Override
    public void run() {
        while (true) {
            CalculationMessage message;
            synchronized (queue) {
                while (queue.isEmpty()) {
                    queue.wait();
                }
                message = queue.remove(0);
            }
            consumer.consume(message);
        }
    }
}

