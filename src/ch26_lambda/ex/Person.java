package ch26_lambda.ex;

public class Person {
    // Ex5 용
    // 필드
    private String name;
    private int age;

    // 생성자
    public Person() {
    }
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 게터
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
