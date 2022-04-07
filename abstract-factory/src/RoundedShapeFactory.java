public class RoundedShapeFactory extends AbstractShapeFactory {
    public Shape getShape(String shape) {
        switch (shape) {
            case "C":
                return new RoundedCircle();
            case "S":
                return new RoundedSquare();
            default:
                return new RoundedRectangle();
        }
    }
}
