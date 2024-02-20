package ch12_accessModifier.ex1.com.school.management;

// #11 접근제한자 (2024-02-20)
public class Ex1 {
    /*
        <학생 관리 시스템>
        1. 패키지 생성
            com.school.management
        2. Student 클래스 구현
            인스턴스 변수: name, studentId
            생성자: Student(String name, String studentId)로 학생의 이름과 ID를 초기화
            게터와 세터: 각 변수에 대한 public 게터와 세터 메서드
        3. Main 클래스
            com.school.management 패키지의 Student 객체를 생성
            학생의 이름과 ID를 설정
            설정된 이름과 ID를 출력
    */
    public static void main(String[] args) {
        // 객체 생성
        Student student = new Student();
        // set & get
        student.setName("홍길동");
        student.setStudentId("hgd123");
        String name = student.getName();
        String studentId = student.getStudentId();
        // 출력
        System.out.println("name : " + name + ", studentID : " + studentId);
    }

}
