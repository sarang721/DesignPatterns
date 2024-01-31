package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

public class MobileAlertObserver implements NotificationAlertObserver{

    StockObservable obj;
    String mobileNumber;
    public MobileAlertObserver(String mobileNumber,StockObservable obj)
    {
        this.mobileNumber = mobileNumber;
        this.obj = obj;
    }
    @Override
    public void update() {
        System.out.println(obj.getStockCount());
        System.out.println("Notified to" + mobileNumber);
    }
}
