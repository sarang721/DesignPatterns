package CreationalDesignPatterns.AbstractFactoryPattern;

public class Main {
    public static void main(String[] args) {

        AbstractFactoryProducer producer = new AbstractFactoryProducer();
        AbstractFactory abstractFactoryobj = producer.getFactoryInstance("economic");

        Car car = abstractFactoryobj.getInstance(3000);

        System.out.println(car.getTopSpeed());




    }
}
