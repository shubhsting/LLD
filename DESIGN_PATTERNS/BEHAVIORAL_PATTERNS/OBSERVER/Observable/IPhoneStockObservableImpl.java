package DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.OBSERVER.Observable;

import java.util.List;

import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.OBSERVER.Observer.NotificationAlertObserver;

public class IPhoneStockObservableImpl implements StocksObservable {
    public List<NotificationAlertObserver> observers;
    public int currentAvailableStock;

    public IPhoneStockObservableImpl(List<NotificationAlertObserver> observers, Integer currentAvailableStock) {
        this.observers = observers;
        this.currentAvailableStock = currentAvailableStock;
    }

    @Override
    public void add(NotificationAlertObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void addStock(Integer newStockItemCount) {
        if (currentAvailableStock == 0) {
            notifySubscribers();
        }
        this.currentAvailableStock = currentAvailableStock + newStockItemCount;
    }

    @Override
    public void notifySubscribers() {
        for (NotificationAlertObserver observer : observers)
            observer.update();
    }

}
