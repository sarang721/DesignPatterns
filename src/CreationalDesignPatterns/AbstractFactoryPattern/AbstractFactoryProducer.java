package CreationalDesignPatterns.AbstractFactoryPattern;

import java.util.Objects;

public class AbstractFactoryProducer {
    public AbstractFactory getFactoryInstance(String value)
    {
        if(Objects.equals(value, "economic"))
        {
            return new EconomicCarFactory();
        }
        else {
            return new LuxuryCarFactory();
        }
    }
}
