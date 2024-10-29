package MULTITHREADING.MESSAGE_BROKER;

public class CalculationMessage {
    public int a;
    public int b;

    public CalculationMessage(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "(" + a + "," + b + ")";
    }
}
