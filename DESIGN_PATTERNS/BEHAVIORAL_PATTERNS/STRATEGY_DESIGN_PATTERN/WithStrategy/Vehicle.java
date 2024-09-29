package DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.STRATEGY_DESIGN_PATTERN.WithStrategy;

import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.STRATEGY_DESIGN_PATTERN.WithStrategy.strategy.DriveStrategy;

public abstract class Vehicle {
    public DriveStrategy strategy;

    public Vehicle(DriveStrategy strategy) {
        this.strategy = strategy;
    }

    public void drive() {
        strategy.drive();
    }
}
