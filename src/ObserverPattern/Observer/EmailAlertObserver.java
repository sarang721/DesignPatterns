package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver{
    StockObservable obj;
    String email;
    public EmailAlertObserver(String email, StockObservable obj)
    {
        this.email = email;
        this.obj = obj;
    }
    @Override
    public void update() {
        System.out.println(obj.getStockCount());
        System.out.println("Notified to "+email);
    }
}
