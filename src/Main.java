import DecoratorPattern.Base.BasePizza;
import DecoratorPattern.Base.FarmHouse;
import DecoratorPattern.Decorator.ExtraCheese;
import DecoratorPattern.Decorator.ExtraMushroom;
import FactoryPattern.Shape;
import FactoryPattern.ShapeFactory;
import ObserverPattern.Observable.IphoneStockObservable;
import ObserverPattern.Observable.MacBookStockObservable;
import ObserverPattern.Observable.StockObservable;
import ObserverPattern.Observer.EmailAlertObserver;
import ObserverPattern.Observer.MobileAlertObserver;
import ObserverPattern.Observer.NotificationAlertObserver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    // Observer Design Pattern
//        StockObservable iphoneStockObservable = new IphoneStockObservable();
//        StockObservable macStockObservable = new MacBookStockObservable();
//
//        NotificationAlertObserver iphoneObserver1 = new MobileAlertObserver("9309965114", iphoneStockObservable);
//        NotificationAlertObserver iphoneObserver2 = new EmailAlertObserver("test@gmail.com",iphoneStockObservable);
//        NotificationAlertObserver macObserver1 = new EmailAlertObserver("test@gmail.com",macStockObservable);
//
//
//        iphoneStockObservable.add(iphoneObserver1);
//        iphoneStockObservable.add(iphoneObserver2);
//        macStockObservable.add(macObserver1);
//        iphoneStockObservable.setStockCount(20);
//        macStockObservable.setStockCount(10);







//        // Decorator Design Pattern
//
//        BasePizza pizza1 = new FarmHouse();
//        System.out.println(pizza1.cost());    //Rs 100
//
//        BasePizza pizza2 = new ExtraMushroom(new FarmHouse());
//        System.out.println(pizza2.cost());   // Rs 130
//
//        BasePizza pizza3 = new ExtraMushroom(new ExtraCheese(new FarmHouse()));
//        System.out.println(pizza3.cost());   // Rs 140








//        // Factory Pattern
//
//        ShapeFactory shapeFactory = new ShapeFactory();
//        Shape shapeObj = shapeFactory.getShape("circle");
//        shapeObj.draw();























    }
}