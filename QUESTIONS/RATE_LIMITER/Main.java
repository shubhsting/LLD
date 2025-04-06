package QUESTIONS.RATE_LIMITER;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        IRateLimiter rateLimiter = new SlidingWindowRateLimiter(3, 10);

        String userId = "user123";
        new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println(rateLimiter.isRequestAllowed(userId));
            }
            
        }).start();
        new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println(rateLimiter.isRequestAllowed(userId));
            }
            
        }).start();
        new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println(rateLimiter.isRequestAllowed(userId));
            }
            
        }).start();
        new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println(rateLimiter.isRequestAllowed(userId));
            }
            
        }).start();
        new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println(rateLimiter.isRequestAllowed(userId));
            }
            
        }).start();
        // System.out.println(rateLimiter.isRequestAllowed(userId));
        // System.out.println(rateLimiter.isRequestAllowed(userId));
        // System.out.println(rateLimiter.isRequestAllowed(userId));
        // System.out.println(rateLimiter.isRequestAllowed(userId));
        // System.out.println("sleeping now");
        // Thread.sleep(10000);
        // System.out.println(rateLimiter.isRequestAllowed(userId));
    }
}
