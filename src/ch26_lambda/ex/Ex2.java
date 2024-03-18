package ch26_lambda.ex;

import javax.swing.text.DateFormatter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.function.Function;

public class Ex2 {
    /*
        <날짜 변환기>
        요구사항: 주어진 날짜 문자열(예: "20240320")을 "2024-03-20" 형태로 변환합니다.
        Function<String, String>을 사용하여 구현하세요.

        출력예시
        ===
        2024-03-20

        힌트 : 문자열 메서드(substring) 사용
     */
    public static void main(String[] args) {
        // 필드
        String strDate = "20240320";

        // 입력값이 문자열, 반환값 문자열인 Function 함수
        Function<String, String> function
                = date -> date.substring(0, 4) + "-" + date.substring(4, 6) + "-" + date.substring(6, 8);
                // return 포함 한 줄 -> { } 생략가능
        System.out.println(function.apply(strDate));
    }
}
