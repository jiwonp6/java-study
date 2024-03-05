package ch22_library.lang;
// # 22 library (240305)
public class JavaLang1 {
    // java.base 모듈
    // java.lang 패키지
    // 자바 프로그래밍 언어의 기본 클래스들을 포함하고 있고,
    // 별도의 import 구문 없이도 클래스를 사용할 수 있다.
    Object1 object;      // 모든 클래스의 최상위 클래스
    // 공식문서 보는 법
    public static void main(String[] args) {
        // toString 메소드
            // : 기본적으로 객체의 정보를 출력 (객체를 대표하는 문자열)
            // => 패키지경로.클래스명@해시값 ---> 기본 구현은 유용한 정보 제공 X
            // △ 객체의 상태를 더욱 잘 나타낼 수 있는 방식으로 오버라이딩해서 사용
            // 유용성 : 디버깅, 로깅, 가독성 등에 유용하게 사용할 수 있다.

        Object1 obj = new Object1();
        System.out.println(obj.toString());
        System.out.println(obj);    // println 메소드에서는 기본적으로 객체의 toString() 값을 리턴

        Student student = new Student("홍길동", "3");
        System.out.println(student.toString());
        System.out.println(student);

    }

}

class Student{
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
