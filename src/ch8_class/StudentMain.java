package ch8_class;
// #9-3-2 클래스 -> 배열로 (2024-02-16)
public class StudentMain {
    public static void main(String[] args) {

        Student student1;    // Class3_Student 라는 타입의 변수를 선언
        student1 = new Student();    // Class3_Student 라는 타입의 변수를 초기화, 객체 생성 = 인스턴스화
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

        // 배열 생성하고 값 넣어주기
        Student[] students = new Student[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        // 학생정보 출력
        for (int i = 0; i < students.length; i++) {
            System.out.println("[ 학생 이름 : " + students[i].name + ", 점수 : " + students[i].score + ", 나이 : " + students[i].age+ " ]");
        }

        System.out.println(student1);       // 주소 출력됨
        System.out.println(student2);

    }
}
