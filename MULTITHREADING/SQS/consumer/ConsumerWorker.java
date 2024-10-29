package MULTITHREADING.SQS.consumer;

import MULTITHREADING.SQS.CalculationMessage;
import lombok.SneakyThrows;

import java.util.Queue;


public class ConsumerWorker implements Runnable {
    final IConsumer consumer;
    final Queue<CalculationMessage> queue;

    public ConsumerWorker(final Queue<CalculationMessage> queue, final IConsumer consumer) {
        this.consumer = consumer;
        this.queue = queue;
    }

    @Override
    @SneakyThrows
    public void run() {
        while (true) {
            CalculationMessage message;
            synchronized (queue) {
                while (queue.isEmpty()) {
                    queue.wait();
                }
                message = queue.remove();
            }
            consumer.consume(message);

        }
    }
}
