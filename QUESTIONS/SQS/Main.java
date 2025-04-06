package QUESTIONS.SQS;

import QUESTIONS.SQS.CONSUMER.AdditionConsumer;

public class Main {
    public static void main(String[] args) {
        SQS sqs = new SQS();
        sqs.addConsumer(new AdditionConsumer());
        sqs.addConsumer(new AdditionConsumer());
        sqs.pushMessage(new AdditionMessage(5, 10));
        sqs.pushMessage(new AdditionMessage(7, 14));
        sqs.pushMessage(new AdditionMessage(2, 9));
    }
}
