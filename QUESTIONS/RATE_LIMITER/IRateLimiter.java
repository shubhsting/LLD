package QUESTIONS.RATE_LIMITER;

public interface IRateLimiter {
    boolean isRequestAllowed(String userId);
}
