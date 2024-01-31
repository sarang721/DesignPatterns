package ObserverPattern;

import ObserverPattern.Observable.IphoneStockObservable;
import ObserverPattern.Observable.MacBookStockObservable;
import ObserverPattern.Observable.StockObservable;
import ObserverPattern.Observer.EmailAlertObserver;
import ObserverPattern.Observer.MobileAlertObserver;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Main {

    public static void main(String[] args) {

        // Observer Design Pattern
        StockObservable iphoneStockObservable = new IphoneStockObservable();
        StockObservable macStockObservable = new MacBookStockObservable();

        NotificationAlertObserver iphoneObserver1 = new MobileAlertObserver("9309965114", iphoneStockObservable);
        NotificationAlertObserver iphoneObserver2 = new EmailAlertObserver("test@gmail.com",iphoneStockObservable);
        NotificationAlertObserver macObserver1 = new EmailAlertObserver("test@gmail.com",macStockObservable);


        iphoneStockObservable.add(iphoneObserver1);
        iphoneStockObservable.add(iphoneObserver2);
        macStockObservable.add(macObserver1);
        iphoneStockObservable.setStockCount(20);
        macStockObservable.setStockCount(10);

    }
}
