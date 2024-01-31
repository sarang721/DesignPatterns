package DecoratorPattern;

import DecoratorPattern.Base.BasePizza;
import DecoratorPattern.Base.FarmHouse;
import DecoratorPattern.Decorator.ExtraCheese;
import DecoratorPattern.Decorator.ExtraMushroom;

public class Main {

    public static void main(String[] args) {

        //        // Decorator Design Pattern
        BasePizza pizza1 = new FarmHouse();
        System.out.println(pizza1.cost());    //Rs 100

        BasePizza pizza2 = new ExtraMushroom(new FarmHouse());
        System.out.println(pizza2.cost());   // Rs 130

        BasePizza pizza3 = new ExtraMushroom(new ExtraCheese(new FarmHouse()));
        System.out.println(pizza3.cost());   // Rs 140

    }
}
