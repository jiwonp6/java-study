package ch27_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream7_Collect {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("하길동", 60));
        studentList.add(new Student("가길동", 80));
        studentList.add(new Student("다길동", 90));
        studentList.add(new Student("나길동", 75));

        // 최종연산 : collect()
        List<String> nameList = studentList.stream()
                                        .sorted()
                                        .map(Student::getName)
                                        .collect(Collectors.toList());

        Set<Integer> scoreList = studentList.stream()
                                        .sorted()
                                        .map(Student::getScore)
                                        .collect(Collectors.toSet());

    }
}
