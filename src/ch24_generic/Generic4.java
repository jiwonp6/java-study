package ch24_generic;

public class Generic4 {
    // 제네릭 메소드
        // : 메소드 내에서 타입 매개변수를 선언해서 다양한 타입에 유연하게 대응
    static void printArray(String[] array){
        for (String s : array) {
            System.out.println(s);
        }
    }

    static void printArray(Integer[] array){
        for (Integer i : array) {
            System.out.println(i);
        }
    }
    static void printArray(Double[] array){
        for (Double d : array) {
            System.out.println(d);
        }
    }

    public static void main(String[] args) {
        String[] stringArray = {"Hello", "Generic", "Java", "Kotlin"};
        printArray(stringArray);

        Integer[] intArray = {10, 20, 30, 40, 50};
        printArray(intArray);

        Double[] doubleArray = {10.0, 20.0, 30.0, 40.0, 50.0};
        printArray(doubleArray);

    }

}
