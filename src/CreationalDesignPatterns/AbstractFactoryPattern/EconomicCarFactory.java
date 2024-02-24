package CreationalDesignPatterns.AbstractFactoryPattern;

public class EconomicCarFactory implements AbstractFactory{
    @Override
    public Car getInstance(int price) {
        if(price>5000 && price<10000)
        {
            return new EconomicCar1();
        }
        else {
            return new EconomicCar2();
        }
    }
}
