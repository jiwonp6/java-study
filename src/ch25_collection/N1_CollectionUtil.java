package ch25_collection;

import java.util.*;

public class N1_CollectionUtil {
    public static void main(String[] args) {
        // Collections 클래스
            // : 다양한 컬렉션을 다루기 위해 제공하는 메소드들의 모음
        List<Integer> numberList = new ArrayList<>();
        numberList.addAll(
                Arrays.asList(3, 1, 2, 4, 5, 9)
        );
        System.out.println("numberList = " + numberList);

        // sort : List 를 정렬
        Collections.sort(numberList);
        System.out.println("오름차순 정렬 = " + numberList);
        Collections.sort(numberList, new Comparator<Integer>() {    // 비교자 이용 -> 정렬기준을 다르게 적용 가능
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;     // 내림차순 정렬
            }
        });
        System.out.println("내림차순 정렬 = " + numberList);

        // binarySearch : 이진 검색 알고리즘을 사용해서 정렬된 리스트 검색
        int index = Collections.binarySearch(numberList, 4);
        System.out.println("4의 index = " + index);

        // reverse(List) : 리스트 요소를 역순으로 뒤집기
        Collections.reverse(numberList);
        System.out.println("역순 정렬 = " + numberList);

        // shuffle(List) : 리스트 요소를 무작위로 섞기
        Collections.shuffle(numberList);
        System.out.println("셔플 = " + numberList);

        // fill(List) : 리스트의 모든 요소를 지정된 값으로 대체
        Collections.fill(numberList, 0);
        System.out.println("모든 요소 0으로 대체 = " + numberList);

        // copy(copyList, originList) : 리스트의 내용을 다른 리스트로 복사
        // copyList 의 size 가 originList 의 size 과 같거나 커야 복사 가능
        List<Integer> copyNumList = new ArrayList<>();
        copyNumList.addAll(
                Arrays.asList(1, 1, 1, 1, 1, 1, 1)
        );
        Collections.copy(copyNumList, numberList);
        System.out.println("copyNumList = " + copyNumList);

        // max, min : 최대값 최솟값 찾기
        numberList = Arrays.asList(3, 43, 5, 9, 5, 80);
        Integer max = Collections.max(numberList);
        Integer min = Collections.min(numberList);
        System.out.println("numberList = " + numberList);
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        // rotate(List, 거리(정수)) : 지정된 거리만큼 회전(뒤로 밀림)
        Collections.rotate(numberList, 2);
        System.out.println("2만큼 회전 = " + numberList);

        // replaceAll(List, 이전값, 새값)
        Collections.replaceAll(numberList, 3, 30);
        System.out.println("3을 30으로 변경 = " + numberList);

        // swap(List, index, index) :
        Collections.swap(numberList, 2, 5);
        System.out.println("inde x2, index 5 자리 바꾸기 = " + numberList);

        // frequency(Collection, 객체) : 객체의 빈도수 반환
        int frequency = Collections.frequency(numberList, 30);
        System.out.println("30의 빈도수 = " + frequency);

        // disjoint(Collection, Collection) : 공통요소가 없으면 true 를 반환
        boolean disjoint = Collections.disjoint(numberList, Arrays.asList(40, 50, 60));
        System.out.println("공통 요소 없는지 여부 = " + disjoint);

    }
}
