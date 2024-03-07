package ch22_library.lang.lang10_string;

public class StringClass {
    public static void main(String[] args) {
        // String class
            // : 문자열은 상수(constant)이며 불변(immutable) 객체이다.
            // 한번 만들어진 문자열은 변하지 않는다.
            // 네트워크를 통해 byte 배열을 받게 될 경우 new String(byte[])을 통해 문자열로 디코딩된다.
        String str1 = "hello";

        byte[] bytes = {104, 101, 108, 108, 111};   // hello
        String str2 = new String(bytes);            // 정수배열

        System.out.println(str2);
            // 변셩이 아니라 새로 생성하여 새 문자열을 만듦.
        String newStr = new String(bytes, 2, 3);    // bytes에서 인댁스 2부터 길이 3만큼 잘라서 새로운 문자열 생성
        System.out.println(newStr);

    }
}
