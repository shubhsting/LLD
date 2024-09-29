package DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.CHAIN_OF_RESPONSIBILITY.LOGGER;

import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.CHAIN_OF_RESPONSIBILITY.LOGGER.impl.CloudwatchLogger;
import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.CHAIN_OF_RESPONSIBILITY.LOGGER.impl.ConsoleLogger;
import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.CHAIN_OF_RESPONSIBILITY.LOGGER.impl.FileLogger;

public class Main {
    public static void main(String[] args) {
        Logger logger = new ConsoleLogger(LogLevel.ALL)
                .setNext(new FileLogger(LogLevel.DEBUG))
                .setNext(new CloudwatchLogger(LogLevel.ERROR));
        logger.message(LogLevel.DEBUG, "hello msg");
    }
}
