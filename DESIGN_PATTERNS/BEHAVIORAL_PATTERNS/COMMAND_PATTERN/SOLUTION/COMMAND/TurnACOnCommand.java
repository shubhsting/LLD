package DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.COMMAND_PATTERN.SOLUTION.COMMAND;

import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.COMMAND_PATTERN.SOLUTION.RECEIVER.AirConditioner;

public class TurnACOnCommand implements ICommand {
    AirConditioner airConditioner;

    public TurnACOnCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOn();
    }

    @Override
    public void undo() {
        airConditioner.turnOff();
    }
}
