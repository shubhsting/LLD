package DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.COMMAND_PATTERN.SOLUTION.COMMAND;

import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.COMMAND_PATTERN.SOLUTION.RECEIVER.AirConditioner;

public class TurnACOffCommand implements ICommand {
    AirConditioner airConditioner;

    public TurnACOffCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOff();
    }

    @Override
    public void undo() {
        airConditioner.turnOn();
    }
}
