package ch29_io_stream.ex_serializable;

import java.io.Serializable;

public class Person implements Serializable {
    // serialVersionUID
        // : 직렬화하여 주고받을 해당 클래스의 버전
        // 객체를 보내는 쪽과 받는 쪽의 명시된 클래스의 내용이 다를 경우 대비
        // 직접 지정하지 않으면 자동으로 생성
    // * 객체를 직렬화 한 후 UID 를 변경해서 직렬화로 읽으면
        // -> 예외발생
    // * 필드가 달라도 시리얼 ID 가 같으면 같은 클래스로 간주
        // -> 심각한 데이터 손실 문제 발생 가능성이 있음
    private static final long serialVersionUID = 1;
    private String name;
    private int age;
    private double height;
    transient private double weight;      // <- 직렬화에서 제외하고 싶은 민감 정보
                                          // transient 키워드를 통해 제외시켜 줌
    private boolean married;

    // 직렬화에 내부 객체 타입이 있는 경우 -> 해당 객체도 Serializable 를 구현해야 한다.
    private Career career;

    public Person(String name, int age, double height, double weight, boolean married, Career career) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.married = married;
        this.career = career;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", married=" + married +
                ", career=" + career +
                '}';
    }
}
