package DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.STRATEGY_DESIGN_PATTERN.WithStrategy;

import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.STRATEGY_DESIGN_PATTERN.WithStrategy.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {
    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
