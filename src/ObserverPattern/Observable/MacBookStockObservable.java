package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class MacBookStockObservable implements StockObservable{
    public List<NotificationAlertObserver> macbookObservers = new ArrayList<>();
    public int macStockCount=0;
    @Override
    public void add(NotificationAlertObserver observer) {
        macbookObservers.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        macbookObservers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver observer: macbookObservers)
        {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int count) {
        this.macStockCount = this.macStockCount+count;
        if(this.macStockCount>0)
        {
            notifySubscribers();
        }
    }

    @Override
    public int getStockCount() {
        return this.macStockCount;
    }
}
