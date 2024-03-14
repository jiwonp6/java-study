package ch25_collection.n2_set.compare;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    // 중첩 클래스
    public enum SortBy { STUDENT_NO, NAME, AGE, HEIGHT }
    public enum SortDirection { ASC, DESC }     // 정렬순서

    // 필드
    private SortBy sortBy;
    private SortDirection sortDirection;


    // 생성자
    public StudentComparator(SortBy sortBy, SortDirection sortDirection) {
        this.sortBy = sortBy;
        this.sortDirection = sortDirection;
    }

    // 메소드 : 비교 기준
    @Override
    public int compare(Student student1, Student student2) {
        // 비교 기준에 따라 결과를 [음수, 0, 양수]의 정수로 반환
        int compareResult = 0;

        // 정렬기준 (기본 오름차순 정렬)
        switch (sortBy){
            case STUDENT_NO -> compareResult = student1.getStudentNo() - student2.getStudentNo();
            case NAME -> compareResult = student1.getName().compareTo(student2.getName());
            case AGE -> compareResult = student1.getAge() - student2.getAge();
            case HEIGHT -> compareResult = Double.compare(student1.getHeight(), student2.getHeight());
        }

        // DESC : 내림차순
        if (sortDirection.equals(SortDirection.DESC)){
            compareResult *= -1;
        }

        return compareResult;
    }
}
