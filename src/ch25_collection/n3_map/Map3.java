package ch25_collection.n3_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Map3 {
    static class Student {
        // 필드
        private int studentNo;
        private String name;

        // 생성자
        public Student(int studentNo, String name) {
            this.studentNo = studentNo;
            this.name = name;
        }

        // 메소드
        @Override
        public String toString() {
            return studentNo + " : " + name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return studentNo == student.studentNo && Objects.equals(name, student.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(studentNo, name);
        }
    }

    public static void main(String[] args) {
        // Key 값에 참조타입 객체(사용자 정의 타입)
            // => 동등성 확인하는 로직으로 equals, hashCode 오버라이딩 해야 한다.
        Map<Student, Integer> studentMap = new HashMap<>();

        studentMap.put(new Student(1, "홍길동"), 90);
        studentMap.put(new Student(1, "홍길동"), 95);

        int size = studentMap.size();
        System.out.println("size = " + size);       // 덮어써지지 X -> 2
                                                    // equals, hashCode 오버라이딩 -> 1
        System.out.println(studentMap);

    }
}
