package DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.OBSERVER.Observer;

public class PhoneAlertObserverImpl implements NotificationAlertObserver {
    public String phoneNumber;

    public PhoneAlertObserverImpl(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update() {
        System.out.println("Sending phone notification on: " + phoneNumber);
    }
}
