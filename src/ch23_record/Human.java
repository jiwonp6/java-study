package ch23_record;
// #23 record (240305)

// java Record <= java 14 버전부터 새롭게 도입된 데이터 구조
//:  VO (Value Object) 객체 또는 DTO (Data Transfer Object) 를 작성할 때
// 불변하는 데이터 객체를 간단하게 정의해주는 자료구조

// 컴파일러가 자동으로 기본 생성자, getter, equals, hashCode, toString을 생성

record Human(String name, int age){ }
