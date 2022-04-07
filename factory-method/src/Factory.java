import factory.ShapeFactory;
import model.Shape;

public class Factory {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.getShape("C");
        shape1.draw();
        Shape shape2 = ShapeFactory.getShape("R");
        shape2.draw();
    }
}
