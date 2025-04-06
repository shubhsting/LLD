package QUESTIONS.SQS.CONSUMER;

import QUESTIONS.SQS.IMessage;

public interface IConsumer {
    void consume(IMessage message);
}
