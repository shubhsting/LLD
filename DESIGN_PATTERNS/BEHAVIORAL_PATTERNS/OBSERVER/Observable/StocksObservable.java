package DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.OBSERVER.Observable;

import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.OBSERVER.Observer.NotificationAlertObserver;

public interface StocksObservable {
    void add(NotificationAlertObserver observer);

    void remove(NotificationAlertObserver observer);

    void addStock(Integer newStockItemCount);

    void notifySubscribers();
}
