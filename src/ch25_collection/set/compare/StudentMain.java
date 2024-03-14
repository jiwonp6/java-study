package ch25_collection.set.compare;

import java.util.Arrays;
import java.util.TreeSet;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("홍길동", 30, 170.0);
        Student student2 = new Student("임꺽정", 20, 185.2);
        Student student3 = new Student("전우치", 25, 180.1);
        Student student4 = new Student("이몽룡", 28, 178.5);

        // 일반 정렬 (학번)
        System.out.println("< 일반 정렬 (학번) >");
        TreeSet<Student> studentTreeSet = new TreeSet<>();

        studentTreeSet.addAll(
                Arrays.asList(student1, student2, student3, student4)
        );

        for (Student student : studentTreeSet) {
            System.out.println(student);
        }

        // 이름 순 오름차순 정렬
        System.out.println("< 이름 순 정렬 >");
        StudentComparator nameComp = new StudentComparator(StudentComparator.SortBy.NAME, StudentComparator.SortDirection.ASC);
        TreeSet<Student> nameSortSet = new TreeSet<>(nameComp);

        nameSortSet.addAll(
                Arrays.asList(student1, student2, student3, student4)
        );

        for (Student student : nameSortSet) {
            System.out.println(student);
        }

        TreeSet[] treeSetArray = {
                new TreeSet<Student>(
                        new StudentComparator(
                                StudentComparator.SortBy.AGE,       // 나이순
                                StudentComparator.SortDirection.ASC // 오름차순
                        )
                ),
                new TreeSet<Student>(
                        new StudentComparator(
                                StudentComparator.SortBy.AGE,       // 나이순
                                StudentComparator.SortDirection.DESC // 내림차순
                        )
                ),
                new TreeSet<Student>(
                        new StudentComparator(
                                StudentComparator.SortBy.HEIGHT,    // 키순
                                StudentComparator.SortDirection.ASC // 오름차순
                        )
                ),
                new TreeSet<Student>(
                        new StudentComparator(
                                StudentComparator.SortBy.HEIGHT,    // 키순
                                StudentComparator.SortDirection.DESC // 내림순
                        )
                )
        };

        for (TreeSet<Student> treeSet : treeSetArray) {
            treeSet.addAll(
                    Arrays.asList(student1, student2, student3, student4)
            );
            System.out.println(" < 정렬 (나이 오름차순, 나이 내림차순, 키 오름차순, 키 내림차순) > ");
            for (Student student : treeSet) {
                System.out.println(student);
            }

        }
    }
}
