package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservable implements StockObservable {

    public int stockCount = 0;
    public List<NotificationAlertObserver> observerList = new ArrayList<>();

    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver observer : observerList)
        {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int count) {

        this.stockCount = this.stockCount + count;
        if(this.stockCount > 0 ) {
            notifySubscribers();
        }
    }

    @Override
    public int getStockCount() {
        return this.stockCount;
    }
}
