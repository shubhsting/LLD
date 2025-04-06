package QUESTIONS.SQS;

public class AdditionMessage implements IMessage {
    public int a;
    public int b;
    public AdditionMessage(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
