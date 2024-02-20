package ch08_class;
// #9-5 클래스 - 메소드 이용 (2024-02-16)
public class Class5 {
    /* 메인 */
    public static void main(String[] args) {
        // 학생정보 입력
        Student student1 = createStudent("홍길동", 80, 30);
        Student student2 = createStudent("임꺽정", 70, 40);
        Student student3 = createStudent("이몽룡", 90, 20);

        // 학생정보 출력
        printInformation(student1);
        printInformation(student2);
        printInformation(student3);

    }

    /* 메소드 */
    // 학생 객체 생성 메소드
    public static Student createStudent(String name, int score, int age){
        Student student = new Student();    // 생성된 객체(학생 타입의 인스턴스)는 Heap영역에 저장 -> 메소드가 끝나도 없어지지 않는다
        student.name = name;
        student.score = score;
        student.age = age;

        return student;     // 객체의 참조값을 리턴(0X100)
    }
    // 학생 정보 출력 메소드
    public static void printInformation(Student students){
        System.out.println("[ 학생 이름 : " + students.name + ", 점수 : " + students.score + ", 나이 : " + students.age + " ]");
    }

}
