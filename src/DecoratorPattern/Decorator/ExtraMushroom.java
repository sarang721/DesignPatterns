package DecoratorPattern.Decorator;

import DecoratorPattern.Base.BasePizza;

public class ExtraMushroom implements ToppingDecorator{

    public BasePizza basePizza;

    public ExtraMushroom(BasePizza pizza)
    {
        this.basePizza = pizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost()+30;
    }
}
