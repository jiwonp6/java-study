package ch23_record;
// #23 record (240305)

// java Record <= java 14 버전부터 새롭게 도입된 데이터 구조
    //:  VO (Value Object) 객체 또는 DTO (Data Transfer Object) 를 작성할 때
    // 불변하는 데이터 객체를 간단하게 정의해주는 자료구조

// 컴파일러가 자동으로 기본 생성자, getter, equals, hashCode, toString을 생성
record Human(String name, int age){ }

public class Record {
    public static void main(String[] args) {
        Human human1 = new Human("홍길동", 30);

        // getter 메소드와 동일한 효과를 내는 메소드
        int age = human1.age();
        String name = human1.name();

        // toString 메소드 오버라이딩
        String str = human1.toString();

        // equals
        Human human2 = new Human("홍길동", 30);
        Human human3 = new Human("홍길동", 40);

        System.out.println(human1.equals(human2));
        System.out.println(human1.equals(human3));

        // hashCode 오버라이딩
        System.out.println(human1.hashCode());
        System.out.println(human2.hashCode());
        System.out.println(human3.hashCode());

    }
}

// 레코드는 final 키워드가 적용이 되어 더 이상 상속되지 않는다.
//class StrongHuman extends Human {
//    StrongHuman(String name, int age) {
//        super(name, age);
//    }
//}

