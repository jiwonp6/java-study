package ch08_class.ex7;
// #10 클래스 (2024-02-19)
public class Rectangle {
    // 필드 : 데이터
    int width = 5;
    int height = 8;

    // 메서드 : 기능
    int calculateArea() {
        return width * height;
    }

    int calculatePerimeter() {
        return 2 * (width + height);
    }

    boolean isSquare() {
        return width == height;
    }
}
