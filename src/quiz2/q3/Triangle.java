package quiz2.q3;

public class Triangle extends Shape{
    int base;
    int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void area() {
        System.out.println("삼각형의 면적: " + (base * height * 0.5));
    }
}
