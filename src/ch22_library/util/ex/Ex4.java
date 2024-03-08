package ch22_library.util.ex;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Ex4 {
    /*
        다가오는 생일까지 남은 날짜 계산하기
        [요구사항]
        사용자로부터 생년월일을 입력받아, 올해의 생일이 지났는지 여부에 따라
        올해 또는 내년 생일까지 남은 날짜를 계산하여 출력하세요.
        사용자의 생년월일과 현재 날짜에 LocalDate를 사용하고,
        남은 날짜 계산에는 Period 클래스를 활용하세요.
        
        [입력 예시]
        1990-05-24
        
        [출력 예시]
        (올해 생일이 지났을 경우) : 다음 생일까지 x개월 x일 남았습니다!
        (올해 생일이 아직 안 지났을 경우) : 다음 생일까지 30일 남았습니다!

        [Hint]
        *다른 메서드*
        localdate인스턴스.withYear(정수) => 해당 년도의 LocalDate 객체를 반환
        localdate인스턴스.isBefore(다른날짜) => 해당 날짜 이전 여부를 불리언으로 반환
        localdate인스턴스.isAfter(다른날짜) => 해당 날짜 이후 여부를 불리언으로 반환
     */
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        int thisYear = today.getYear();

        Scanner scanner = new Scanner(System.in);

        System.out.println("생년월일을 입력해주세요.(YYYY-MM-DD)");
        String birth = scanner.next();

        // 일반적인 날짜 포맷일 경우, 포맷 없이도 문자열 파싱이 가능하다.
        LocalDate birthDate = LocalDate.parse(birth);

        // 올해 생일 구하기
        // = LocalDate thisYearBday = LocalDate.of(thisYear, birthMonth, birthDay);
        // = LocalDate thisYearBday = LocalDate.of(thisYear, birthDate.getMonth(), birthDate.getDayOfMonth());
        LocalDate thisYearBday = birthDate.withYear(thisYear);
            // withYear 메소드 : 해당 년도의 날짜(기존 월, 일 유지) 객체 반환

        if (thisYearBday.isBefore(today)){
            thisYearBday = thisYearBday.plusYears(1);
        }

        Period period = Period.between(today, thisYearBday);

        System.out.printf("다음 생일까지 %s 개월 %s 일 남았습니다!\n", period.getMonths(), period.getDays());

        // +) D-day 로 출력하기
        Duration duration = Duration.between(today.atStartOfDay(), thisYearBday.atStartOfDay());
        long days = duration.toDays();
        String formatted = String.format("다음 생일까지 %s일 남았습니다.", days);
        System.out.println(formatted);

    }
}
