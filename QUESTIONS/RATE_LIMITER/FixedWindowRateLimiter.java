package QUESTIONS.RATE_LIMITER;

import java.util.Date;
import java.util.HashMap;

public class FixedWindowRateLimiter implements IRateLimiter {
    public Integer maxRequests;
    public Long windowSizeInMillis;

    HashMap<String, Long> reqestsWindow;
    HashMap<String, Integer> requestsCount;

    public FixedWindowRateLimiter(Integer maxRequests, Integer windowSizeInSeconds) {
        this.maxRequests = maxRequests;
        this.windowSizeInMillis = windowSizeInSeconds * 1000L;
        this.reqestsWindow = new HashMap<>();
        this.requestsCount = new HashMap<>();
    }

    @Override
    public boolean isRequestAllowed(String userId) {
        long currentTimeInMillis = new Date().getTime();
        reqestsWindow.putIfAbsent(userId, currentTimeInMillis);
        requestsCount.putIfAbsent(userId, 0);
        if (reqestsWindow.get(userId) + windowSizeInMillis < currentTimeInMillis) {
            reqestsWindow.put(userId, currentTimeInMillis);
            requestsCount.put(userId, 0);
        }

        if (requestsCount.get(userId) < maxRequests) {
            requestsCount.put(userId, requestsCount.get(userId) + 1);
            return true;
        }
        return false;
    }

}
