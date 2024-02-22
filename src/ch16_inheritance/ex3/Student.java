package ch16_inheritance.ex3;
// #15 상속 (2024-02-22)
public class Student extends Person{
    /*
        Student 클래스:
        Person 클래스로부터 상속받습니다.
        추가 필드: studentId (학번)
        introduce() 메소드를 오버라이딩하여, 학생의 경우 추가적으로 학번 정보도 소개합니다.
     */
    // 필드
    protected String studentId;

    // 생성자
    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    // 메소드
    @Override
    void introduce() {
        System.out.print("[학생] ");
        super.introduce();
        System.out.println(", 학번 : " + studentId);
    }
}
