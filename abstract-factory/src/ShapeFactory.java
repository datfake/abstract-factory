public class ShapeFactory extends AbstractShapeFactory{
    public Shape getShape(String shape) {
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
