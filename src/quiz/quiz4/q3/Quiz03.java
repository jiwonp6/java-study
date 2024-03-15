package quiz.quiz4.q3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Quiz03 {
    public static void main(String[] args) {
        // 오늘 날짜
        LocalDate todayDate = LocalDate.now();
        
        // 월드컵 날짜
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy년 M월 dd일");
        LocalDate worldCupDate = LocalDate.parse("2026년 6월 14일", fmt);
        
        // 기간 구하기
        Period period = Period.between(todayDate, worldCupDate);
        
        // 출력
        System.out.printf("다음 월드컵은 %s년 %s개월 %s일 후에 개최됩니다.", 
                period.getYears(), period.getMonths(), period.getDays());
    }

}
