package ch27_stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Stream06_Sorted {
    // 요소 정렬
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("하길동", 60));
        studentList.add(new Student("가길동", 80));
        studentList.add(new Student("다길동", 90));
        studentList.add(new Student("나길동", 75));

        studentList.stream()                        // 스트림 생성
                // Comparator 매개변수로 하는 방법 or Comparable 인터페이스 구현
                .sorted()                           // 중간 : 정렬 (Comparable)
                .map(Student::getName)              // 중간 : 이름필드 스트림으로 변환
                .forEach(System.out::println);      // 최종 출력

        // 자연 순서(이름순으로 오버라이딩)에서 역순으로 정렬
        studentList.stream()                        // 스트림 생성
                // Comparator 매개변수로 하는 방법 or Comparable 인터페이스 구현
                .sorted(Comparator.reverseOrder())  // 중간 : 정렬 (Comparable)
                .map(Student::getName)              // 중간 : 이름필드 스트림으로 변환
                .forEach(System.out::println);      // 최종 출력

    }
}
