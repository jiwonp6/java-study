package ch22_library.lang.lang10_string;

public class StringMethod2 {
    public static void main(String[] args) {
        // <문자열에서 자주 사용되는 메소드>

        // 5. charAt : (index)번째 '문자(char)'를 반환
        String str = "오늘은 3월 6일입니다. 오늘 날씨가 좋네요.";
        char c1 = str.charAt(0);                        // '오'
        char c10 = str.charAt(9);                       // '입'
        char cLast = str.charAt(str.length()-1);        // '.' : 마지막

        // 6. indexOf : 문자열에서 index 위치를 int로 반환
        int i1 = str.indexOf("오늘");                     // 0
        int i2 = str.indexOf("오늘", 3);     // 14 <--- 2번째 인자 인덱스(시작 인덱스) 위치부터 찾아서 처음 발견하는 위치 반환
        int i3 = str.indexOf("3월");                      // 4
        int i4 = str.lastIndexOf("오늘");             // 14 <--- 끝에서 부터 찾아서 발견한 인덱스 반환

    }
}
