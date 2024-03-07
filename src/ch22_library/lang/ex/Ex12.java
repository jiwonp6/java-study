package ch22_library.lang.ex;

import java.util.Scanner;

public class Ex12 {
    /*
        <주민등록번호로 생년월일과 성별 구별하기>
        [요구사항]
        사용자로부터 주민등록번호를 입력받습니다.
        입력 형식은 "YYMMDD-XXXXXXX"입니다.
        주민등록번호를 분석하여 생년월일과 성별을 출력하는 프로그램을 작성하세요.

        [조건]
        성별 구별 번호는 주민등록번호의 뒷자리 첫 번째 숫자로,
        홀수이면 "남성", 짝수이면 "여성"으로 구별합니다.
        생년월일 출력 시, 1900년 또는 2000년대 출생자 구분을 위해
        성별 구별 번호가 1, 2이면 1900년대,
        3, 4이면 2000년대 출생으로 가정합니다.

        [입력]
        주민등록번호: 991231-1234567
        주민등록번호: 010203-4321765

        [실행 결과 예시]
        생년월일: 1999년 12월 31일
        성별: 남성
        생년월일: 2001년 02월 03일
        성별: 여성
     */
    public static void main(String[] args) {
        String sex = null;
        int year = 0;
        int month;
        int day;

        Scanner scanner = new Scanner(System.in);
        System.out.println("주민등록번호를 입력하세요.");
        String userNum = scanner.nextLine();

        String[] userNums = userNum.split("-");
        switch (userNums[1].charAt(0)){
            case '1':
                sex = "남성";
                year = 1900;
                break;
            case '2':
                sex = "여성";
                year = 1900;
                break;
            case '3':
                sex = "남성";
                year = 2000;
                break;
            case '4':
                sex = "여성";
                year = 2000;
                break;
        }
        year = year + Integer.parseInt(userNums[0].substring(0,2));
        month = Integer.parseInt(userNums[0].substring(2,4));
        day = Integer.parseInt(userNums[0].substring(4));

        System.out.printf("생년월일 : %s년 %s월 %s일 \n성별 : %s", year, month, day, sex);
    }
}
