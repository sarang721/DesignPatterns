package CreationalDesignPatterns.FactoryPattern;

public class Main {

    public static void main(String[] args) {


        // Factory Pattern

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shapeObj = shapeFactory.getShape("circle");
        shapeObj.draw();


    }
}
