package ch22_library.lang.lang10_string;

public class StringMethod4 {
    public static void main(String[] args) {
        // <문자열에서 자주 사용되는 메소드>

        // 12. Upper/Lower : 대소문자 변환
        String hello = "Hello, Java";
        String upperCase = hello.toUpperCase();                                 // "HELLO, JAVA"
        String lowerCase = hello.toLowerCase();                                 // "hello, java"

        String str = "Hello, How are you?";
        boolean result1 = str.contains("how");                                  // false`<--- 대소문자 구분
        boolean result2 = str.toLowerCase().contains("how");                    // true
        boolean result3 = str.toLowerCase().contains("hOw".toLowerCase());      // true


    }
}
