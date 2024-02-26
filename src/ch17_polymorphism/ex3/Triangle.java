package ch17_polymorphism.ex3;

public class Triangle extends Shape{
    int base;
    int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void area() {
        System.out.println("삼각형의 면적 : " + (base * height * 0.5));
    }
}
