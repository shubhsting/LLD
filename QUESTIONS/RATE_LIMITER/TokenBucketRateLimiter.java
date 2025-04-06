package QUESTIONS.RATE_LIMITER;

import java.util.*;

public class TokenBucketRateLimiter implements IRateLimiter {

    Integer bucketSize;
    long tokenRefillWindowInMillis;
    HashMap<String, List<String>> tokensStore;
    HashMap<String, Long> bucketLastRefillTimestamp;

    public TokenBucketRateLimiter(Integer bucketSize, long tokenRefillWindowInSeconds) {
        this.bucketSize = bucketSize;
        this.tokenRefillWindowInMillis = tokenRefillWindowInSeconds * 1000L;
        this.tokensStore = new HashMap<>();
        this.bucketLastRefillTimestamp = new HashMap<>();
    }

    @Override
    public boolean isRequestAllowed(String userId) {
        tokensStore.putIfAbsent(userId, new ArrayList<>());
        refill(userId);
        List<String> tokens = tokensStore.get(userId);
        if (tokens.size() > 0) {
            String token = tokens.remove(tokens.size() - 1);
            System.out.println(token);
            return true;
        }
        return false;
    }

    public void refill(String userId) {
        long currentTimestampInMillis = new Date().getTime();
        if (!bucketLastRefillTimestamp.containsKey(userId)
                || bucketLastRefillTimestamp.get(userId) < currentTimestampInMillis - tokenRefillWindowInMillis) {
            final List<String> tokens = tokensStore.getOrDefault(userId, new ArrayList<>());
            while (tokens.size() < bucketSize)
                tokens.add(UUID.randomUUID().toString());
            bucketLastRefillTimestamp.put(userId, currentTimestampInMillis);
        }
    }

}
