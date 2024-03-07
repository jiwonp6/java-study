package ch22_library.lang.lang10_string;

import java.text.MessageFormat;
import java.util.Calendar;

public class StringFormat {
    public static void main(String[] args) {
        // 문자열 포맷팅
        // 1. printf() : 형식지정자를 문자열에 % 기호를 사용하여 삽입 위치와 방식 지정, 포맷 형태로 출력
        String name = "홍길동";
        int age = 20;
        System.out.printf("이름 : %s, 나이 : %d\n", name, age);

        // 2. String.format() : 포맷팅 된 문자열로 반환
        String formattedStr = String.format("이름 : %s, 나이 : %d", name, age);
        System.out.println(formattedStr);

        // 3. MessageFormat.format : 복잡한 포맷팅이 필요할 때
        String formattedMsg = MessageFormat.format("이름 : {0}, 나이 : {1}", name, age);
        System.out.println(formattedMsg);

        // 4. "문자열".formatted("포맷") : 포맷된 문자열을 반환 (자바 13버전 이후로 사용가능)
        String formatted = "이름 : %s, 나이 : %d".formatted(name, age);

        // 문자열 포맷팅 예시
        // 숫자 또는 금액 포맷팅 (%, 1,000 단위로 콤마형식)
        double dollarPrice = 12340.56;
        String formattedDP = String.format("가격 : %,.2f 달러", dollarPrice);   // %.n 부동 소수점 자리수
        System.out.println(formattedDP);

        // 날짜 시간 포매팅
            // %tY %tm %td : 연 월 일 형식지정자
            // $1 $2 $3 : 1번째, 2번째, 3번째 인자를 사용하겠다는 의미(인자 순서가 맞으면 사용할 필요 없음)
        Calendar now = Calendar.getInstance();
        String formattedDate = String.format("현재 날짜 : %1$tY년 %1$tm월 %1$td일", now);
        System.out.println(formattedDate);

        // 패딩 간격과 정렬하기
            // %숫자s : 숫자 만큼의 자리를 차지 (기본 우측정렬)
            // %-숫자s : 자리를 차지하고 좌측정렬
        String formattedName = String.format("이름 : [[%10s]]", name);
        System.out.println(formattedName);

        // 대문자 변환하기
            // %S : 영문자 대문자 변환
        String hello = "Hello Java";
        String formattedUpper = String.format("인사말 : %S", hello);
        System.out.println(formattedUpper);

        // 자료형에 따른 형식지정자
            // %s : 문자열, %d : 정수, %f : 실수 (실수 소수점 기본 6자리)
        int year = 2024;
        double temp = 12.3;
        String fmt = String.format("연도 : %d, 온도 : %.1f 도", year, temp);
        System.out.println(fmt);

    }
}
