package QUESTIONS.SQS.CONSUMER;

import QUESTIONS.SQS.AdditionMessage;
import QUESTIONS.SQS.IMessage;

public class AdditionConsumer implements IConsumer {
    @Override
    public void consume(IMessage m) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }
        AdditionMessage message = (AdditionMessage) m;
        System.out.println("Here is addition result: "+ Thread.currentThread().getName()+ "Ans: " + (message.a + message.b));
    }
}
