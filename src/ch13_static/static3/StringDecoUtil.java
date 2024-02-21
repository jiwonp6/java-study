package ch13_static.static3;
// #12 자바 메모리 영역 구조 (2024-02-21)
public class StringDecoUtil {
    // ● static이 없는 경우 => 인스턴스 메서드
    String decorate1(String str1){
        return "★★★★★ " + str1 + " ★★★★★";
    }

    // ● 메소드를 static 키워드로 만들 경우
        // 인스턴스(객체)를 생성하지 않고 사용 가능하다.
    static String decorate2(String str2){
        return "★★★★★ " + str2 + " ★★★★★";
    }
}
