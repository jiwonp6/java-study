package quiz.quiz2.q3;

public class Rectangle extends Shape{
    int base;
    int height;

    public Rectangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void area() {
        System.out.println("사각형의 면적 : " + (base * height));
    }
}
