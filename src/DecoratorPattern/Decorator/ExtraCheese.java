package DecoratorPattern.Decorator;

import DecoratorPattern.Base.BasePizza;

public class ExtraCheese implements ToppingDecorator{

    public BasePizza basePizza;

    public ExtraCheese(BasePizza pizza)
    {
        this.basePizza = pizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost()+10;
    }
}
