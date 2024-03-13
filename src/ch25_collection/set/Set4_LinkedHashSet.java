package ch25_collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SequencedSet;

public class Set4_LinkedHashSet {
    // LinkedHashSet
        // : HashSet 과 유사한 기능들을 모두 가짐. (중복 허용하지 않음)
    // 내부적으로 LinkedList 를 사용하여 순서를 가질 수 있음
    // 중복을 불허하는 고유 요소를 유지하면서도 순서를 기억해야 할 때 사용.
    // HashSet 보다 성능상으로 조금 느림

    public static void main(String[] args) {
        // <hashSet>
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("해쉬셋은");
        hashSet.add("순서를");
        hashSet.add("보장하지");
        hashSet.add("않습니다.");
        hashSet.add(null);          // null 가능
        hashSet.add(null);          // null 도 중복 불가능

        System.out.println("hashSet = " + hashSet);

        // <linkedHashSet>
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("링크드");
        linkedHashSet.add("해쉬셋은");
        linkedHashSet.add("순서를");
        linkedHashSet.add("보장합니다.");
        linkedHashSet.add(null);    // null 가능
        linkedHashSet.add(null);    // 중복은 불가능

        System.out.println("linkedHashSet = " + linkedHashSet);

        // addFirst : 첫 번째 요소로 추가
        linkedHashSet.addFirst("첫 번째 순서에 추가");

        // removeFirst : 첫 번째 요소 삭제
        linkedHashSet.removeFirst();

        // getFirst : 첫 번째 요소 가져오기
        String first = linkedHashSet.getFirst();
        System.out.println("first = " + first);

        // reversed : 순서를 뒤집은 셋 반환
        SequencedSet<String> reversed = linkedHashSet.reversed();   // SequencedSet (자식) -> Set (부모)
        System.out.println("reversed = " + reversed);

        System.out.println("linkedHashSet = " + linkedHashSet);

    }
}
