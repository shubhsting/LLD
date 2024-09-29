package DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.CHAIN_OF_RESPONSIBILITY.LOGGER;

public enum LogLevel {
    INFO(1), 
    DEBUG(2), 
    WARNING(4), 
    ERROR(8), 
    ALL(15);
    public Integer code;
    LogLevel(int code) {
        this.code = code;
    }
}
