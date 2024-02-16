package ch5_reference;
// #9 참조 (2024-02-16)
public class Ref3 {
    public static void main(String[] args) {
        Data data1 = new Data();        // 데이터 생성하여 참조값을 data1에 저장  data1 <- 0X10 (data1 자체는 주소값)
        data1.value1 = 10;
        Data data2 = data1;             // 객체의 위치를 가리키는 참조값을 복사한다. data2 <- 0X10 (data1의 주소값을 data2에 넣음)

        int a = 10;
        int b = 20;
        int sum = a + b;    // 기본타입은 연산이 가능하다.

        // int dataSum = data1 + data2;                 // 참조타입은 기본적으로 연산 불가능
        int dataSum = data1.value1 + data2.value2;      // 참조타입의 기본 타입 필드에 접근하면 연산 가능

        // String 문자열은 특별한 타입으로 문자열 연결 연산 가능

    }
}
