package ch25_collection.n2_set;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class Set5_TreeSet {
    // TreeSet
        // : 자동으로 정렬되는 중복을 불허하는 자료구조
    // Red-Black Tree 알고리즘을 기반으로 사용
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(7);
        treeSet.add(20);
        treeSet.add(5);
        treeSet.add(36);
        treeSet.add(5);           // 중복 불가
        // treeSet.add(null);     // null 불가 (Runtime Exception 발생)

        System.out.println("treeSet = " + treeSet);                     // [5, 7, 10, 20, 36]

        // 첫 번째 요소 가져오기
        Integer first = treeSet.first();
        System.out.println("first = " + first);                         // 5

        // 마지막 요소 가져오기
        Integer last = treeSet.last();
        System.out.println("last = " + last);                           // 36

        // 10 보다 head(앞)쪽 숫자들의 집합을 반환 (10 불포함)
        SortedSet<Integer> headSet = treeSet.headSet(10);
        System.out.println("headSet = " + headSet);                     // [5, 7]

        // 10 보다 tail(뒤)쪽 숫자들의 집합을 반환 (10 포함)
        SortedSet<Integer> tailSet = treeSet.tailSet(10);
        System.out.println("tailSet = " + tailSet);                     // [10, 20, 36]

        // 해당 요소 바로 아래 요소 리턴
        Integer lower = treeSet.lower(10);
        System.out.println("lower = " + lower);                         // 7

        // 해당 요소 바로 위 요소 리턴
        Integer higher = treeSet.higher(10);
        System.out.println("higher = " + higher);                       // 20

        // TreeSet 문자열 자동 정렬
        TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.addAll(
                Arrays.asList("Banana", "Coke", "Apple", "Zebra", "Fruit")
        );
        System.out.println("stringTreeSet = " + stringTreeSet);         // [Apple, Banana, Coke, Fruit, Zebra]

        stringTreeSet.addAll(
                Arrays.asList("가", "다", "나", "하")
        );
        System.out.println("stringTreeSet = " + stringTreeSet);         // [Apple, Banana, Coke, Fruit, Zebra, 가, 나, 다, 하]

    }

}
