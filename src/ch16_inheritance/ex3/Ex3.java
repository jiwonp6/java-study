package ch16_inheritance.ex3;
// #15 상속 (2024-02-22)
public class Ex3 {
    /*
        대학 관리 시스템 구현
        요구사항
        대학에서 교수(Professor)와 학생(Student)을 관리하는 시스템을 구축합니다. Person 클래스를 상속받아 Professor와 Student 클래스를 구현하되, 각각의 특성에 맞는 추가 속성과 메소드를 포함시킵니다.

        University 클래스:
        main 메소드에서 다음을 수행합니다:
        교수와 학생 객체를 각각 생성합니다.
        생성된 모든 사람의 정보를 소개합니다.

        출력 예시
        ===
        안녕하세요, 제 이름은 John Doe입니다. 저는 40살이고, 컴퓨터 과학 학과에서 근무합니다.
        안녕하세요, 제 이름은 Jane Smith입니다. 저는 20살이고, 제 학번은 20201234입니다.
     */
    public static void main(String[] args) {
        Professor professor = new Professor("John Doe", 40, "컴퓨터 과학 학과");
        professor.introduce();

        Student student = new Student("Jane Smith", 20, "20201234");
        student.introduce();

    }

}
