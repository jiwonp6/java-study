package ch17_polymorphism.ex3;

public class Rectangle extends Shape{
    int base;
    int height;

    public Rectangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void area() {
        System.out.println("사각형의 면적 : " + (base * height));
    }
}
