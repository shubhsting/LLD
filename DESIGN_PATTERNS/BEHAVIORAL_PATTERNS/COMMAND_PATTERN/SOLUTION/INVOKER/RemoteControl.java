package DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.COMMAND_PATTERN.SOLUTION.INVOKER;

import java.util.Stack;

import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.COMMAND_PATTERN.SOLUTION.COMMAND.ICommand;

public class RemoteControl {
    Stack<ICommand> commandHistory;
    ICommand command;

    public RemoteControl() {
        commandHistory = new Stack<>();
    }

    public void setCommand(ICommand command) {
        this.command = command;
        commandHistory.push(command);
    }

    public void click() {
        command.execute();
    }

    public void undo() {
        if (!commandHistory.isEmpty()) {
            commandHistory.pop().undo();
        }
    }
}
