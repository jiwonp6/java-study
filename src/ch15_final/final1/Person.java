package ch15_final.final1;
// #14 final (2024-02-22)
public class Person {
    // final : 최종적이라는 뜻을 가지는 필드, 무조건 초기화 필요 -> 생성자 통해서 초기값 부여
    // 필드
    final String nation = "Korea";    // 국가
    final String ssn;                 // 주민번호
    String name;                // 이름

    // 생성자
    public Person(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }
}
