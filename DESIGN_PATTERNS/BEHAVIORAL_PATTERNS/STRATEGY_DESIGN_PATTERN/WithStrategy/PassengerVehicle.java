package DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.STRATEGY_DESIGN_PATTERN.WithStrategy;

import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.STRATEGY_DESIGN_PATTERN.WithStrategy.strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {
    public PassengerVehicle() {
        super(new NormalDriveStrategy());
    }
}