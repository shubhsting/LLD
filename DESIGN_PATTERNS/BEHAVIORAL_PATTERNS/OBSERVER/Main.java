package DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.OBSERVER;

import java.util.ArrayList;

import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.OBSERVER.Observable.IPhoneStockObservableImpl;
import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.OBSERVER.Observer.EmailAlertObserverImpl;
import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.OBSERVER.Observer.PhoneAlertObserverImpl;

public class Main {
    public static void main(String[] args) {
        IPhoneStockObservableImpl iPhoneStockObservable = new IPhoneStockObservableImpl(new ArrayList<>(), 0);
        iPhoneStockObservable.add(new EmailAlertObserverImpl("user1@gmail.com"));
        iPhoneStockObservable.add(new EmailAlertObserverImpl("user2@gmail.com"));
        iPhoneStockObservable.add(new EmailAlertObserverImpl("user3@gmail.com"));
        iPhoneStockObservable.add(new PhoneAlertObserverImpl("phone1"));
        iPhoneStockObservable.add(new PhoneAlertObserverImpl("phone2"));
        iPhoneStockObservable.addStock(10);
    }
}
