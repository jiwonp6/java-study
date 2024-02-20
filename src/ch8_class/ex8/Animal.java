package ch8_class.ex8;
// #10 클래스 (2024-02-19)

public class Animal {
    // 필드
    String type; // 종류
    String name; // 이름
    int age;     // 나이

    // 메서드
    void printInformation() {
        System.out.println(type + " " + name + "는 "+ age + "살 입니다.");
    }
}
