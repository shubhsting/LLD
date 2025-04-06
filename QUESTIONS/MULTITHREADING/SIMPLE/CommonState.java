package QUESTIONS.MULTITHREADING.SIMPLE;

public class CommonState {
    String name;
    public CommonState(String name) {
        this.name = name;
    }

    public void setState(String name) {
        this.name = name;
    }
}
