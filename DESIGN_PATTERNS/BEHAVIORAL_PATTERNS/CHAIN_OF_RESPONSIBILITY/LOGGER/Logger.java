package DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.CHAIN_OF_RESPONSIBILITY.LOGGER;

public abstract class Logger {

    public Logger next;
    public LogLevel loggerLogLevel;

    public Logger(LogLevel loggerLogLevel) {
        this.loggerLogLevel = loggerLogLevel;
        this.next = null;
    }

    public Logger setNext(Logger logger) {
        Logger current = this;
        while (current.next != null) {
            current = current.next;
        }
        current.next = logger;
        return this;
    }

    public void message(LogLevel messageLevel, String message) {
        if ((messageLevel.code & loggerLogLevel.code) != 0) {
            writeMessage(message);
        }

        if (next != null)
            next.message(messageLevel, message);
    }

    public abstract void writeMessage(String message);
}
