public class Abstract {
    public static void main(String[] args) {
        AbstractShapeFactory shapeFactory = ShapeFactoryProducer.getShapeFactory(false);

        Shape shape1 = shapeFactory.getShape("C");
        shape1.draw();

        AbstractShapeFactory roundedShapeFactory = ShapeFactoryProducer.getShapeFactory(true);

        Shape shape2 = roundedShapeFactory.getShape("C");
        shape2.draw();
    }
}
