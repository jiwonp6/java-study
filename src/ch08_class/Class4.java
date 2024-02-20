package ch08_class;
// #9-4 클래스 - 메소드 이용 (2024-02-16)
public class Class4 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student();
        // 객체를 메소드로 전달(참조값을 복사)
        // 메소드 내에서 변경된 필드 값들은 실제 객체에 적용이 된다
        initStudent(student1, "홍길동", 80, 30);

        Student student2 = new Student();     // 선언과 초기화 같이 new 생성자로 인스턴스화
        initStudent(student2, "임꺽정", 70, 40);

        Student student3 = new Student();
        initStudent(student3, "이몽룡", 90, 20);

        // 학생정보 출력
        printInformation(student1);
        printInformation(student2);
        printInformation(student3);

    }

    /* 메소드 */
    // 학생 정보 초기화 메소드
    public static void initStudent(Student student, String name, int score, int age){
        student.name = name;
        student.score = score;
        student.age = age;
    }

    // 학생 정보 출력 메소드
    public static void printInformation(Student students){
        System.out.println("[ 학생 이름 : " + students.name + ", 점수 : " + students.score + ", 나이 : " + students.age + " ]");
    }

}
