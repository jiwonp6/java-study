package ch22_library.lang.lang1;

public class Student{
    String name;
    String grade;

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    // 객체 정보를 유용하게 제공하기 위해 toString() 을 오버라이드
    @Override
    public String toString() {
        return "%s 학년 %s 입니다.".formatted(grade, name);
    }
}
