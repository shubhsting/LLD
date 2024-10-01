package DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.COMMAND_PATTERN.PROBLEM;

public class AirConditioner {
    boolean isOn;
    int temperature;

    public void turnOn() {
        this.isOn = true;
        System.out.println("AC is now ON");
    }

    public void turnOff() {
        this.isOn = false;
        System.out.println("AC is now OFF");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("AC temperature changed to" + temperature);
    }
}
