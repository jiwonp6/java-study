package ch8_class;
// #9-3 클래스 (2024-02-16)
public class Class3 {
    public static void main(String[] args) {

        Student student1;    // Student 라는 타입의 변수를 선언
        student1 = new Student();    // Student 라는 타입의 변수를 초기화, 객체 생성 = 인스턴스화
        student1.name = "홍길동";      // 학생의 변수값
        student1.score = 80;
        student1.age = 30;

        Student student2 = new Student();     // 선언과 초기화 같이 new 생성자로 인스턴스화
        student2.name = "임꺽정";
        student2.score = 70;
        student2.age = 40;

        Student student3 = new Student();
        student3.name = "이몽룡";
        student3.score = 90;
        student3.age = 20;

        // 학생정보 출력
        System.out.println("[ 학생 이름 : " + student1.name + ", 점수 : " + student1.score + ", 나이 : " + student1.age + " ]");
        System.out.println("[ 학생 이름 : " + student2.name + ", 점수 : " + student2.score + ", 나이 : " + student2.age + " ]");
        System.out.println("[ 학생 이름 : " + student3.name + ", 점수 : " + student3.score + ", 나이 : " + student3.age + " ]");


    }
}
