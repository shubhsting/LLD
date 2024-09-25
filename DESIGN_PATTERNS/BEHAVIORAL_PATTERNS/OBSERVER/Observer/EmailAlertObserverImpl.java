package DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.OBSERVER.Observer;

public class EmailAlertObserverImpl implements NotificationAlertObserver {
    public String email;

    public EmailAlertObserverImpl(String email) {
        this.email = email;
    }

    @Override
    public void update() {
        System.out.println("Sending email notification on: " + email);
    }
}
