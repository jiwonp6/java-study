package ch22_library.lang.lang10_string;

public class StringMethod3 {
    public static void main(String[] args) {
        // <문자열에서 자주 사용되는 메소드>

        // 7. equals : 문자열 비교 (문자열에서 ==비교는 지양)
        String hello1 = "Hello, World";
        String hello2 = "hello, world";
        String hello3 = "HELLO, WORLD";
        // 대 소문자 구분하여 비교.
        boolean result1 = hello1.equals(hello2);                    // false
        boolean result2 = hello1.equals(hello3);                    // false
        // 대 소문자 무시하여 비교
        boolean result3 = hello1.equalsIgnoreCase(hello2);          // true
        boolean result4 = hello1.equalsIgnoreCase(hello3);          // true

        // 8. contains : 포함 여부 확인
        String str4 = "시계가 돌아갑니다. 째깍째깍";
        boolean clock1 = str4.contains("시계");                     // true
        boolean clock2 = str4.contains("회중시계");                  // false
        boolean clock3 = str4.contains("째깍");                     // true

        // 9. startsWith : 해당 문자열로 시작하는지 여부
        boolean clock4 = str4.startsWith("시계");                   // true
        boolean clock5 = str4.startsWith("째깍");                   // false
        boolean clock6 = str4.startsWith("시계", 3);   // false
        boolean clock7 = str4.startsWith("째깍", 11);  // true

        // 10. endsWith : 해당 문자열로 끝는지 영부
        boolean clock8 = str4.endsWith("시계");                     // false
        boolean clock9 = str4.endsWith("째깍");                     // true

        // 11. match : 정규식을 이용하여 매치 되는지 여부
        // email 주소 여부를 확인하는 정규식
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        String email1 = "normal@example.com";
        String email2 = "normal_example.com";
        String email3 = "normal@example@com";

        boolean matches1 = email1.matches(regex);                   // true
        boolean matches2 = email2.matches(regex);                   // false
        boolean matches3 = email3.matches(regex);                   // false


    }
}
