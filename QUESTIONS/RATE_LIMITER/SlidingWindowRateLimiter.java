package QUESTIONS.RATE_LIMITER;

import java.util.Date;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

public class SlidingWindowRateLimiter implements IRateLimiter {
    public Integer maxRequests;
    public Long windowSizeInMillis;
    private ConcurrentHashMap<String, LinkedList<Long>> requestsStore;
    
    public SlidingWindowRateLimiter(int maxRequests, int windowSizeInSeconds) {
        this.maxRequests = maxRequests;
        this.windowSizeInMillis = windowSizeInSeconds * 1000L;
        this.requestsStore = new ConcurrentHashMap<>();
    }

    @Override
    public boolean isRequestAllowed(String userId) {
        long currentTimeMillis = (new Date()).getTime();
        synchronized (userId) {
            requestsStore.putIfAbsent(userId, new LinkedList<>());

            final LinkedList<Long> queue = requestsStore.get(userId);

            while (!queue.isEmpty() && queue.getFirst() <= currentTimeMillis - windowSizeInMillis) {
                queue.removeFirst();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.print(userId + Thread.currentThread().getName());
            queue.addLast(currentTimeMillis);
            return queue.size() <= maxRequests;
        }
    }
}
