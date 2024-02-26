package ch17_polymorphism.ex3;

public class Circle extends Shape{
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        System.out.println("원의 면적 : " + (radius * radius * 3.14));
    }
}
