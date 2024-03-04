package quiz2.q3;

public class Quiz3 {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(5), new Rectangle(2,7), new Triangle(4,3)};

        for (Shape shape : shapes) {
                shape.area();
        }
    }
}
