package DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.STRATEGY_DESIGN_PATTERN.WithStrategy.strategy;

public class SportsDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("sports drive capability");
    } 
}