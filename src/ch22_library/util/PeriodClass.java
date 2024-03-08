package ch22_library.util;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class PeriodClass {
    public static void main(String[] args) {
        // Period 날짜 간격 구하기
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 12, 31);

        Period between = Period.between(startDate, endDate);

        System.out.println("between : " + between);

        int years = between.getYears();
        int months = between.getMonths();
        int days = between.getDays();
        System.out.println("날짜 간격은 " + years + "년 " + months + "개월 " + days + "일 입니다.");

        // Duration 시간 간격 구하기
        LocalTime startTime = LocalTime.of(8, 30);
        LocalTime endTime = LocalTime.of(17, 00);

        Duration duration = Duration.between(startTime, endTime);

        System.out.println("duration : " + duration);

        long hours = duration.toHours();
        long minutes = duration.toMinutesPart();
        long totMinutes = duration.toMinutes();

        System.out.println("학원에서 " + hours + "시간 " + minutes + "분 있습니다.");
        System.out.println("분으로 환산 : " + totMinutes + "분");
    }
}
