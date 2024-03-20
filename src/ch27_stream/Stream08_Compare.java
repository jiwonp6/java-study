package ch27_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Stream08_Compare {
    public static void main(String[] args) {
        // Comparator 인터페이스의 디폴트 메소드 사용
        // Comparator.comparing(클래스명::필드명)
        List<Person> personList = new ArrayList<>(
                Arrays.asList(new Person("홍길동", 20),
                              new Person("홍길동", 40),
                              new Person("박길동", 40),
                              new Person("김길동", 30),
                              new Person("박길동", 25) )
        );
        // Comparator.comparing : 기준 1 개
        System.out.println("<기준 1개>");
        personList.stream()
                // 나이 기준으로 정렬하기
                // .sorted(Comparator.comparing(Person::getAge))
                // 이름 기준으로 정렬하기
                .sorted(Comparator.comparing(Person::getName))
                .forEach(System.out::println);

        // Comparator.comparing.thenComparing : 기준 2 개 (이름순 -> 나이순)
        System.out.println("<기준 2개>");
        personList.stream()
                // 주 정렬조건이 같을 때 추가 정렬 조건을 적용
                .sorted(Comparator.comparing(Person::getName).thenComparing(Person::getAge))
                .forEach(System.out::println);

        // reversed : (나이 역순 -> 이름순)
        System.out.println("<역순>");
        personList.stream()
                // 주 정렬조건이 같을 때 추가 정렬 조건을 적용 (이름순 -> 나이순)
                .sorted(Comparator.comparing(Person::getAge).reversed().thenComparing(Person::getName))
                .forEach(System.out::println);

        // Comparator.comparingInt : 특정한 기본 타입 기준으로 정렬하고 싶을 때
        System.out.println("<문자열 길이순 정렬>");
        List<String> strList = Arrays.asList("x", "xxx", "xx");
        strList.stream()
                .sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::println);

        // nullsFirst, nullsLast : null 값이 있는 경우
        // naturalOrder, reverseOrder : 오름차순 정렬(Comparable 기준), 역순
        System.out.println("<null 값이 있는 경우>");
        List<String> nameList = Arrays.asList("홍길동", "임꺽정", null, "이몽룡");
        nameList.stream()
                .sorted(Comparator.nullsFirst(Comparator.naturalOrder()))
                .forEach(System.out::println);

    }

    static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return name + " : " + age;
        }
    }
}
