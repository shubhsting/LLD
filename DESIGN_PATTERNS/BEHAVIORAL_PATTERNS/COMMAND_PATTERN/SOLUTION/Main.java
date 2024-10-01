package DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.COMMAND_PATTERN.SOLUTION;

import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.COMMAND_PATTERN.SOLUTION.COMMAND.TurnACOffCommand;
import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.COMMAND_PATTERN.SOLUTION.COMMAND.TurnACOnCommand;
import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.COMMAND_PATTERN.SOLUTION.INVOKER.RemoteControl;
import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.COMMAND_PATTERN.SOLUTION.RECEIVER.AirConditioner;

public class Main {
    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner();
        RemoteControl remote = new RemoteControl();
        remote.setCommand(new TurnACOnCommand(ac));
        remote.click();
        remote.setCommand(new TurnACOffCommand(ac));
        remote.click();
        remote.undo();
        remote.undo();
    }
}
