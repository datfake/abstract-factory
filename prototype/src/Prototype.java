import model.Circle;
import model.Rectangle;
import model.Shape;

import java.util.ArrayList;
import java.util.List;

public class Prototype {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> cloneShapes = new ArrayList<>();

        Rectangle rectangle = new Rectangle(1, 2, "vang", 10, 20);
        shapes.add(rectangle);
        Rectangle cloneRectangle = (Rectangle) rectangle.clone();
        shapes.add(cloneRectangle);

        Circle circle = new Circle(3, 4, "do", 40);
        shapes.add(circle);

        shapes.forEach(shape -> {
            cloneShapes.add(shape.clone());
        });

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i).equals(cloneShapes.get(i))) {
                System.out.println(i + ": 2 Hình giống nhau");
            } else {
                System.out.println(i + ": 2 Hình không giống nhau");
            }
        }
    }
}
