package ch10_class2.ex1;
// #10 클래스 (2024-02-19)

public class Person {
    // Person 클래스를 설계 해주세요.
    // 필드 : name, age, gender
    String name;
    int age;
    String gender;

    // 생성자 : 모든 속성을 초기화하는 생성자,
    Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // 이름, 성별만 초기화하는 생성자
    Person(String name, String gender) {
        this(name, 0, gender);
    }

    // 메서드 : 필드 정보를 출력하는 printInfo()
    void printInfo() {
        System.out.println(name + "씨는 " + age + "세이고 " + gender + "입니다.");
    }
}
