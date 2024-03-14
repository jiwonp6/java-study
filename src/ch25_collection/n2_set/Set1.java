package ch25_collection.n2_set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set1 {
    // 컬렉션 프레임워크의 주요 인터페이스 중 하나
    /*
        <Set의 특징>
        1. 중복을 허용하지 않는다.
        2. 순서를 보장하지 않는다.

        (수학의 집합과 유사한 구조를 가짐)

        <Set 구현체의 종류>
        1. HashSet : 가장 많이 사용되는 기본 Set, 순서 보장 없고, 가장 뛰어난 성능
        2. LinkedHashSet : 요소가 추가된 순서를 보장함 (예외)
        3. TreeSet : 요소가 자연 순서로 정렬되어 저장되는 구조

     */
    public static void main(String[] args) {
        Set<Integer> numberSet = new HashSet<>();
        numberSet.add(1);
        numberSet.add(2);
        numberSet.add(3);
        System.out.println(numberSet);

        boolean add1 = numberSet.add(1);    // 중복 허용 X
        System.out.println(add1);           // false
        System.out.println(numberSet);

        boolean add4 = numberSet.add(4);    // 중복이 아닌 요소는 삽입 가능
        System.out.println(add4);           // true
        System.out.println(numberSet);


        if (!numberSet.add(3)){             // 반환되는 boolean 값을 통해 조건문 사용
            System.out.println("3은 이미 존재하는 값입니다.");
        }

        // 요소 한 번에 추가
        numberSet.addAll(Arrays.asList(5, 6, 7, 8, 9));
        System.out.println(numberSet);

        // contains : 포함 여부 반환
        if (numberSet.contains(2)){
            System.out.println("Set에 2가 포함되어 있습니다.");
        }

        // size : 데이터의 크기
        System.out.println("데이터 크기 : " + numberSet.size());

        for (int i = 0; i < numberSet.size(); i++) {
            // 인덱스를 기준으로 요소 순회 X
            // numberSet.get(i);    => 인덱스와 관련된 메소드 X
        }

        // 향상된 for문 사용하여 요소 순회 -> 순서 보장 X
        for (Integer i : numberSet) {
            System.out.print(i + "\t");
        }
        System.out.println(" ");

        // 반복자를 사용한 요소 순회
        Iterator<Integer> iterator = numberSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "\t");
        }
        System.out.println(" ");

        // 요소 제거 : 제거 성공할 경우 true 반환
        boolean remove3 = numberSet.remove(3);
        System.out.println(remove3);

        boolean remove5 = numberSet.remove(5);
        System.out.println(remove5);

        System.out.println(numberSet);

        // 모든 요소 제거
        numberSet.clear();

        System.out.println(numberSet);

        // 배열로 변환하기 => Object 의 배열
        Object[] array = numberSet.toArray();
    }

}
