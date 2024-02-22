package ch15_final.final1;

// #14 final (2024-02-22)
public class Final1 {
    public static void main(String[] args) {
        Person person = new Person("000000-0000000", "홍길동");
        System.out.println(person.nation);      // final 필드 초기값 할당됨
        System.out.println(person.ssn);         // 생성자 시점 초기값 할당
        System.out.println(person.name);

        // 개명 신청
        person.name = "박길동";        // 일반 필드 변경 가능

        // 주민번호 변경 -> final 필드 변경 불가
        // person.ssn = "111111-1111111";
    }
}
