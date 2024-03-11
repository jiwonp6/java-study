package ch24_generic;

public class Generic4_2 {
    // 제네릭 메소드
        // : 메소드 내에서 타입 매개변수를 선언해서 다양한 타입에 유연하게 대응

    // 리턴 타입 앞에 타입 매개변수를 제네릭으로 선언하여 정의하면
        // 메소드의 매개변수, 리턴 타입, 메소드 내부 등에서 사용하는 타입으로 활용 가능
    static <T> T[] genericPrintArray(T[] array){   // 매개변수
        for (T element : array) {
            System.out.println(element);
        }
        return array;   // 리턴타입
    }

    public static void main(String[] args) {
        String[] stringArray = {"Hello", "Generic", "Java", "Kotlin"};
        genericPrintArray(stringArray);     // 제네릭을 통해 구현, 매개변수로 유연한 타입이 가능

        Integer[] intArray = {10, 20, 30, 40, 50};
        genericPrintArray(intArray);

        Double[] doubleArray = {10.0, 20.0, 30.0, 40.0, 50.0};
        genericPrintArray(doubleArray);

        Boolean[] booleanArray = {true, false, true};
        genericPrintArray(booleanArray);

    }

}
