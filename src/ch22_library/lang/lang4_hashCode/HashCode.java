package ch22_library.lang.lang4_hashCode;

import ch22_library.lang.Object1;

public class HashCode {
    public static void main(String[] args) {
        // Object 클래스의 hashcode
        // : 기본적으로 메모리 주소를 기반으로 한 정수값을 가짐.
        // equals() 메소드를 오버라이드 해서 동등성을 비교하는 경우,
        // hashCode() 메소드도 같이 오버라이드해서, 동등한 객체가 나오도록 반환해야 함.
        // => 일관성이 중요

        // HashSet, HashMap, HashTable 등 hash 값을 이용하는 자료구조에서
        // <동등성을 비교할 때>
        // 먼저 HashCode() 값을 비교 => 다르면 다른 객체, 같으면
        // 다음으로 equals() 값을 비교 => false : 다른 객체, true : 동등 객체

        // hashCode는 hash 충돌이 발생할 수 있다
        // : 서로 다른 입력 값에 대해서 동일한 해시값이 생성되는 경우,
        // 잘 만든 해시함수는 hash 충동을 최소화하지만 완전히 hash 충돌이 없을 수는 없다.
        // => equals와 hashCode는 반드시 일관성을 가져야 한다.
        // 같은 key 값 ---> 같은 value 무결성을 검증할 수 있음.

        Object1 object = new Object1();
        System.out.println(object.hashCode());
        System.out.println(object);

        Member member1 = new Member("홍길동", 30);
        Member member2 = new Member("박길동", 20);

        int hash1 = member1.hashCode();
        int hash2 = member2.hashCode();

        System.out.println("hash1 : " + hash1);
        System.out.println("hash2 : " + hash2);

    }
}
