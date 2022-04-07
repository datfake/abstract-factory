package factory;

import model.Circle;
import model.Rectangle;
import model.Shape;
import model.Square;

public class ShapeFactory {
    public static Shape getShape(String shape) {
        switch (shape) {
            case "C":
                return new Circle();
            case "S":
                return new Square();
            default:
                return new Rectangle();
        }
    }
}
