package ch25_collection.set;

import java.util.Comparator;
import java.util.TreeSet;

public class Set6_Compare2 {
    // Comparator 인터페이스     <- java.util 패키지
    static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return name + " : " + age;
        }
    }

    public static void main(String[] args) {
        // 비교자 Comparator 정의 : 익명 객체로 인터페이스 본문 선언
        Comparator<Person> nameComparator = new Comparator<>() {
            @Override
            public int compare(Person person1, Person person2) {
                // 나이 비교
                // return person1.age - person2.age;

                // 이름 비교 : 문자열(Comparable) 필드의 비교 방법을 사용하여 비교
                return person1.name.compareTo(person2.name);
            }
        };

        // 이름 비교자를 사용한 정렬
        TreeSet<Person> treeSet = new TreeSet<>(nameComparator);

        Person person1 = new Person("홍길동", 25);
        Person person2 = new Person("임꺽정", 40);
        Person person3 = new Person("전우치", 20);
        Person person4 = new Person("이몽룡", 30);

        treeSet.add(person1);
        treeSet.add(person2);
        treeSet.add(person3);
        treeSet.add(person4);

        // 요소 출력
        for (Person person : treeSet) {
            System.out.println(person);
        }

    }

}
