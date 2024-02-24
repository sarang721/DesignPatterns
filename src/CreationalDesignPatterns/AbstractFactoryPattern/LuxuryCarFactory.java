package CreationalDesignPatterns.AbstractFactoryPattern;

public class LuxuryCarFactory implements AbstractFactory{
    @Override
    public Car getInstance(int price) {
        if(price>100000 && price<200000)
        {
            return new LuxuryCar1();
        }
        else {
            return new LuxuryCar2();
        }
    }
}
