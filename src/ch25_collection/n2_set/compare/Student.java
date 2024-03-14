package ch25_collection.n2_set.compare;

public class Student implements Comparable<Student> {
    // 필드
    private static int lastStudentNo = 20240000;
    private int studentNo;
    private String name;
    private int age;
    private double height;

    // 생성자
    public Student(String name, int age, double height) {
        this.studentNo = ++lastStudentNo;       // 생성할 때마다 학번이 자동 부여
        this.name = name;
        this.age = age;
        this.height = height;
    }

    // 게터 메서드
    public int getStudentNo() {
        return studentNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "학번 : " + studentNo +
                ", 이름 : " + name +
                ", 나이 : " + age +
                ", 키 : " + height;
    }

    @Override
    public int compareTo(Student other) {
        return this.studentNo - other.studentNo;
    }

}
