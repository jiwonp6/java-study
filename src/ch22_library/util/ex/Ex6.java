package ch22_library.util.ex;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Ex6 {
    /*
        <회의 시간대 변환하기>
        [요구사항]
        뉴욕에서 오후 3시에 시작하는 온라인 회의가 있다고 할 때,
        이 회의가 서울과 런던에서 몇 시에 시작하는지 계산하여 출력하세요.
        ZonedDateTime과 ZoneId를 사용하여 시간대 변환을 수행하세요.

        [출력예시]
        회의는 뉴욕 기준 오후 3시에 시작합니다.
        서울에서는 회의가 오전 5시에 시작합니다.
        런던에서는 회의가 오후 8시에 시작합니다.
     */
    public static void main(String[] args) {
        // 미팅 시간 변수로 설정
        LocalDateTime meetingTime = LocalDateTime.of(2024, 3, 8, 15, 0, 0);

        // 출력 포맷 설정
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("a h시");

        // 1. 기준시간 뉴욕
        ZonedDateTime nyMeetingTime = ZonedDateTime.of(meetingTime, ZoneId.of("America/New_York"));
        System.out.println("회의는 뉴욕 기준 오후 3시에 시작합니다.");

        // 2. 서울 미팅 타임 (withZoneSameInstant : 해당 시간대와 동일한 다른 지역의 시간 리턴 메소드)
        ZonedDateTime seoulMeetingTime = nyMeetingTime.withZoneSameInstant(ZoneId.of("Asia/Seoul"));
        String seoulFormatted = seoulMeetingTime.format(fmt);
        System.out.printf("서울에서는 회의가 %s에 시작합니다.\n", seoulFormatted);

        // 3. 런던 미팅 타임
        ZonedDateTime londonMeetingTime = nyMeetingTime.withZoneSameInstant(ZoneId.of("Europe/London"));
        String londonFormatted = londonMeetingTime.format(fmt);
        System.out.printf("런던에서는 회의가 %s에 시작합니다.", londonFormatted);

    }
}
