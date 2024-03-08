package quiz.quiz2.q3;

public class Circle extends Shape{
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        System.out.println("원의 면적 : " + (radius * radius * 3.14));
    }
}
