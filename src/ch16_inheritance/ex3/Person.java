package ch16_inheritance.ex3;
// #15 상속 (2024-02-22)
public class Person {
    /*
        Person 클래스:
        공통 필드: name (이름), age (나이)
        메소드: introduce() - 사람의 기본 정보(이름, 나이)를 소개하는 메시지를 출력
     */
    // 필드
    protected String name;
    protected int age;

    // 생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 메소드
    void introduce(){
        System.out.print("이름 : " + name + ", 나이 : " + age);
    }
}
