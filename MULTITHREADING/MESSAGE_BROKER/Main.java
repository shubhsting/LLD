package MULTITHREADING.MESSAGE_BROKER;

import MULTITHREADING.MESSAGE_BROKER.consumer.AdditionConsumer;
import MULTITHREADING.MESSAGE_BROKER.consumer.SubtractionConsumer;

public class Main {
    public static void main(String[] args) {
        MessageBroker mb = new MessageBroker();
        Topic additionTopic = mb.createTopic("Addition Topic");
        additionTopic.subscribe(new AdditionConsumer());

        Topic subtractionTopic = mb.createTopic("Subtraction Topic");
        subtractionTopic.subscribe(new SubtractionConsumer());
        subtractionTopic.subscribe(new SubtractionConsumer());


        mb.publish(new CalculationMessage(1,3));
        mb.publish(subtractionTopic, new CalculationMessage(10,6));
        mb.publish(subtractionTopic, new CalculationMessage(1,-12));
        mb.publish(subtractionTopic, new CalculationMessage(8,3));
    }
}
