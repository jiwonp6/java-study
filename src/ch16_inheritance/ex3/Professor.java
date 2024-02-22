package ch16_inheritance.ex3;
// #15 상속 (2024-02-22)
public class Professor extends Person{
    /*
        Professor 클래스:
        Person 클래스로부터 상속받습니다.
        추가 필드: department (학과)
        introduce() 메소드를 오버라이딩하여, 교수의 경우 추가적으로 학과 정보도 소개합니다.
     */
    // 필드
    protected String department;

    // 생성자
    public Professor(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    // 메소드

    @Override
    void introduce() {
        System.out.print("[교수] ");
        super.introduce();
        System.out.println(", 학과 : " + department);
    }
}
