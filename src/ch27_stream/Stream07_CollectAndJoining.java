package ch27_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream07_CollectAndJoining {
    // 스트림 요소 수집하기 collect()
    // 유연한 최종연산
    // Collector<T, A, R> collector
    // : Collector 인터페이스의 구현을 매개변수로 받아 작업
    // - T : 스트림의 요소
    // - A : 누산기 (accumulator, T 타입의 요소를 A 누산기가 누적)
    // - R : 반환될 컬렉션
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("하길동", "남", 60));
        studentList.add(new Student("가길동", "여", 80));
        studentList.add(new Student("다길동", "남", 90));
        studentList.add(new Student("나길동", "여", 60));

        // 최종연산 : collect()
        // 1. toList : 리스트로 수집
        List<String> nameList = studentList.stream()
                                        .sorted()
                                        .map(Student::getName)
                                        .collect(Collectors.toList());
                                        // .toList();

        // 2. toSet : Set 으로 수집
        Set<Integer> scoreList = studentList.stream()
                                        .sorted()
                                        .map(Student::getScore)
                                        .collect(Collectors.toSet());

        // 3. toMap : 키, 값 쌍으로 함수를 통해 각 요소에서 추출
        Map<String, Integer> map = studentList.stream()
                .filter(student -> student.getScore() >= 80)
                .collect(Collectors.toMap(Student::getName, Student::getScore));
                                        // (key 값,          value 값)

        // 4. joining : 스트림의 문자열 요소를 하나의 문자열로 만든다.
            // 구분된 문자열을 단일 문자열 연결로 만들 때 유용,
            // JSON, HTML 문자열로 만들 때 사용
        Stream<String> stringStream = Stream.of("자바", "스트림", "람다식");

        // 1)
        String join1 = stringStream.collect(Collectors.joining());
        System.out.println("join1 = " + join1);

        // 2)
        String join2
                = Stream.of("자바", "스트림", "람다식")
                        .collect(Collectors.joining(", "));
        System.out.println("join2 = " + join2);

        // 3)
        String join3
                = Stream.of("자바", "스트림", "람다식")
                        .collect(Collectors.joining(", ", "[", "]"));
        System.out.println("join3 = " + join3);

        // 5. groupingBy : 요소 그룹핑
            // 분류기(Function 람다식)를 기준으로 타입 T를 K(key) 로 맵핑하고
            // List<T> 를 V(value) 로 갖는 Map 컬렉션을 생성
        Map<String, List<Student>> genderMap = studentList.stream()
                .collect(Collectors.groupingBy(Student::getGender));

        List<Student> maleList = genderMap.get("남");
        List<Student> femaleList = genderMap.get("여");

        System.out.println("maleList = " + maleList);
        System.out.println("femaleList = " + femaleList);

        // 두 번째 매개변수에 Collector 를 사용해서
        // 집계 메소드를 사용할 수 있음, summing, averaging, counting
        Map<String, Double> genderScoreMap
                = studentList.stream()
                            .collect(Collectors.groupingBy(Student::getGender,
                                     Collectors.averagingDouble(Student::getScore)));
        System.out.println("genderScoreMap = " + genderScoreMap);

        // 6. mapping : 스트림의 요소를 반환한 후, 다른 컬렉터에서 수집
        List<String> namesList = studentList.stream()
                                            .collect(Collectors.mapping(Student::getName,
                                                     Collectors.toList()));

        // 7. partitioningBy : 스트림 요소를 특정한 기준에 따라
        // true 와 false 양쪽 리스트로 나누는 Map 을 반환
        Map<Boolean, List<Student>> score70Map = studentList.stream()
                .collect(Collectors.partitioningBy(student -> student.getScore() >= 70));

        System.out.println("score70Map = " + score70Map);
        List<Student> over70students = score70Map.get(true);
        List<Student> under70students = score70Map.get(false);

        System.out.println("over70students = " + over70students);
        System.out.println("under70students = " + under70students);

    }
}
