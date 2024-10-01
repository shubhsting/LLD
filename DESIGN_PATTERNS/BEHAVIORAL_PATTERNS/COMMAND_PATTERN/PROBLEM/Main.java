package DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.COMMAND_PATTERN.PROBLEM;

public class Main {
    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner();
        ac.turnOn();
        ac.setTemperature(34);
        ac.turnOff();
    }
}
