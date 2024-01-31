package FactoryPattern;

public class ShapeFactory {

    public Shape shapeObj;

    public Shape getShape(String shape)
    {
        switch (shape){
            case "square":
                return new Square();
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            default:
                return null;
        }

    }

}
