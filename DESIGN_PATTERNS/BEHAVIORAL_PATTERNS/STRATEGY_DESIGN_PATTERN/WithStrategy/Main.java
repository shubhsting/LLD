package DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.STRATEGY_DESIGN_PATTERN.WithStrategy;

public class Main {
    public static void main(String[] args) {
        Vehicle v = new PassengerVehicle();
        v.drive();
    }
}
