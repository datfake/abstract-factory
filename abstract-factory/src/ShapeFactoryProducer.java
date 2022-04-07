public class ShapeFactoryProducer {
    public static AbstractShapeFactory getShapeFactory(boolean isRounded) {
        if (isRounded) {
            return new RoundedShapeFactory();
        } else {
            return new ShapeFactory();
        }
    }
}
