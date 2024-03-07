package ch22_library.lang.lang10_string;

public class StringMethod1 {
    public static void main(String[] args) {
        // <문자열에서 자주 사용되는 메소드>

        // 1. length : 문자열의 길이(문자 수)를 반환
        int l1 = "".length();                   // 0
        int l2 = "반갑습니다.".length();          // 6
        int l3 = "공  백".length();              // 4
        int l4 = "이스케이프문자\n\t".length();    // 9

        // 2. isEmpty : 문자열의 길이가 0인지 여부
        String em1 = "";
        String em2 = " ";
        String em3 = "\t\t\n";

        boolean em1Empty = em1.isEmpty();        // true
        boolean em2Empty = em2.isEmpty();        // false
        boolean em3Empty = em3.isEmpty();        // false

        // 3. isBlank : 공백을 제외한 문자 길이가 0인지 여부
        String b1 = "";
        String b2 = " ";
        String b3 = "\t\t\n";

        boolean b1Blank = b1.isBlank();           // true
        boolean b2Blank = b2.isBlank();           // true
        boolean b3Blank = b3.isBlank();           // true

        // 4. trim : 문자열 white space 제거
        String str = " \t\n 문자열 trim \t\n ";
        String trim = str.trim();   // 기존 문자열을 변경하지 않고 새로운 문자열 객체를 생성하여 리턴한다.
        System.out.println(trim);           // "문자열 trim" <--- 문자열 내부공백은 제거 X(시작과 끝만 제거)

    }
}
