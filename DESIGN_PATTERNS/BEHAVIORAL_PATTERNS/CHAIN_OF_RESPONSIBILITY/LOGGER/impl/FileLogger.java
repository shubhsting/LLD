package DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.CHAIN_OF_RESPONSIBILITY.LOGGER.impl;

import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.CHAIN_OF_RESPONSIBILITY.LOGGER.LogLevel;
import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.CHAIN_OF_RESPONSIBILITY.LOGGER.Logger;

public class FileLogger extends Logger {

    public FileLogger(LogLevel loggerLogLevel) {
        super(loggerLogLevel);
    }
    @Override
    public void writeMessage(String message) {
        System.out.println("message written in FileLogger" + message);
    }

}
