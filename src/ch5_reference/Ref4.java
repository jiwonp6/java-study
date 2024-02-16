package ch5_reference;
// #9 기본타입과 참조타입 비교(2024-02-16)
public class Ref4 {
    public static void main(String[] args) {
        // 기본타입
        int a = 10;
        int b = a;  // 값(10)이 복사되어 대입

        System.out.println("a = " + a);     // 10
        System.out.println("b = " + b);     // 10

        // a값 변경
        a = 20;

        System.out.println("=====<기본타입>=====");       // a값을 변경해도 b에 영향을 주지 않음
        System.out.println("a = " + a);     // 20
        System.out.println("b = " + b);     // 10

        // 참조타입
        Data dataA = new Data();
        dataA.value1 = 100;
        Data dataB = dataA;     // 값(주소=참조값)이 복사되어 대입

        System.out.println("=====<참조타입>=====");
        System.out.println("dataA = " + dataA);     // 참조값 : ch5_reference.Data@27973e9b
        System.out.println("dataB = " + dataB);     // 참조값 : ch5_reference.Data@27973e9b

        System.out.println("dataA.value1 = " + dataA.value1);       // 100
        System.out.println("dataB.value1 = " + dataB.value1);       // 100

        // dataA.value1 값 변경
        dataA.value1 = 200;
        System.out.println("dataA.value1 = " + dataA.value1);       // 200
        System.out.println("dataB.value1 = " + dataB.value1);       // 200 -> a값을 변경하면 b에 영향을 줌

        // dataB.value1 값 변경
        dataB.value1 = 300;
        System.out.println("dataA.value1 = " + dataA.value1);       // 300 -> b값을 변경하면 a에 영향을 줌
                                                                            // 즉, 주소를 가르키기 때문에 주소 내의 값을 변경시키면 원래의 a도 영향을 받는다.
        System.out.println("dataB.value1 = " + dataB.value1);       // 300


    }
}
